package com.naver.s1.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//memberJoin 메서드를 만들어서 memberjoin.jsp로 보내기
	// /member/memberJoin get
	//memberJoin2 회원가입코드 진행
	// /member/memberJoin post
	
	@RequestMapping(value="/member/memberJoin")
	public String memberJoin() {
		
		System.out.println("멤버조인");
		
		return "member/memberJoin";
	}
	
	@RequestMapping(value="/member/memberJoin" ,method=RequestMethod.POST)
	public void memberJoin2(MemberDTO memberDTO) throws Exception {
		

		int result = memberService.memberJoin(memberDTO);
		
		
		System.out.println(result);
	
		
	}
	
	
	@RequestMapping(value="/member/memberLogin")
	public String memberLogin() {
		
//		System.out.println(name);
//		System.out.println(age);
		System.out.println("멤버 로그인");
		
		return "member/memberLogin";
		//
	}
	
	@RequestMapping(value="/member/memberLogin", method=RequestMethod.POST)
	public ModelAndView memberLogin(MemberDTO memberDTO, ModelAndView mv) throws Exception {


		memberDTO = memberService.memberlogin(memberDTO);
	
		mv.addObject("dto",memberDTO);
		mv.setViewName("member/memberPage");
		
		return mv;
	}
}
