package com.jjcompany.lombok.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
	
	private String name;
	private String id;
	private String pw;
	private int age;

}
