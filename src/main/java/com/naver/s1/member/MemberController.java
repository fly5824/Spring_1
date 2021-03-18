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
	
	@RequestMapping(value="/member/memberLogin")
	public String memberJoin() {
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
