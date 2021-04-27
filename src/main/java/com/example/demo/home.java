package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
	
	    //アクセス先URL http://localhost:8080/test1
		@GetMapping("/test1")
		public String write1() {
			return "Hello World1";
		}
		
		@GetMapping("/test2")
		public String write2() {
			return "Hello World2";
		}
}
