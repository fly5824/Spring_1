package com.naver.s2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2Controller {
	
	@RequestMapping(value="/test/test.do")
	public void test() {
		System.out.println("pppppppppppppppp");
	}

}
