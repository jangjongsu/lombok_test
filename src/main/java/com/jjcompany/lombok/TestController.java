package com.jjcompany.lombok;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjcompany.lombok.dto.MemberDto;

@RestController
public class TestController {

	
		@RequestMapping(value="/test")
		public MemberDto test() {
			
			MemberDto dto  = new MemberDto();
			
			dto.setName("홍길동");
			dto.setPw("12345");
			dto.setId("tiger");
			dto.setAge(17);
			 
			return dto;
		}
}
