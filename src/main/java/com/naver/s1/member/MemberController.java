package com.naver.s1.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	}
	
	@RequestMapping(value="/member/memberLogin", method=RequestMethod.POST)
	public void memberLogin2(HttpServletRequest request) throws Exception {
		System.out.println("memberbbbbbbbbb");
	String id=	request.getParameter("id");
	String pw=request.getParameter("pw");

		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setID(id);
		memberDTO.setPW(pw);
		memberDTO = memberService.memberlogin(memberDTO);
		
		System.out.println(memberDTO);
	}
}
