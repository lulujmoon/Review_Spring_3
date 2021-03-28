package com.redbeet.whatI.member;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.redbeet.whatI.MyAbstractTest;

public class MemberDAOTest extends MyAbstractTest{
	
	@Autowired
	MemberDAO memberDAO = new MemberDAO();
	
//	@Test
//	public void signInTest() throws Exception {
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId("lulujmoon");
//		memberDTO.setPw("mun6801");
//		memberDTO = memberDAO.signIn(memberDTO);
//		assertNotNull(memberDTO);
//	}
	
//	@Test
//	public void signUpTest() throws Exception {
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId("moondori");
//		memberDTO.setPw("dorimoon");
//		memberDTO.setName("문존돌이");
//		memberDTO.setEmail("moondori@gmail.com");
//		
//		int result = memberDAO.signUp(memberDTO);
//		
//		assertNotEquals(0, result);
//	}
}
