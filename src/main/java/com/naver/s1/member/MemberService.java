package com.naver.s1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;

	public MemberDTO memberlogin(MemberDTO memberDTO) throws Exception {
		//dao의 메서드 호출
		
		memberDTO = memberDAO.logIn(memberDTO);

		return memberDTO;
	}

}
