package com.naver.s1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value="/member/memberLogin.do")
	public void Test3() {
		System.out.println("테슽으 33333333");
	}
	
	
}
