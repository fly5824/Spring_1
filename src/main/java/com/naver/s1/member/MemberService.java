package com.naver.s1.member;

public class MemberService {

	private MemberDAO memberDAO;

	public MemberDTO memberlogin(MemberDTO memberDTO) throws Exception {
		//dao의 메서드 호출
		
		memberDTO = memberDAO.logIn(memberDTO);

		return memberDTO;
	}

}
