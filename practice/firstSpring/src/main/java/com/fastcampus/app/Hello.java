package com.fastcampus.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;
	
	@RequestMapping("/hello")
	private void main() { // static ���̵� ���� 
		System.out.println("Hello_private");
	}
	public static void main2() {
		System.out.println(cv);
	}

}
