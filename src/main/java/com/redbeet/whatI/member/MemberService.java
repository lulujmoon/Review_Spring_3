package com.redbeet.whatI.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	public MemberDTO signIn(MemberDTO memberDTO) throws Exception {
		return memberDAO.signIn(memberDTO);
	}
	
	public int signUp(MemberDTO memberDTO) throws Exception {
		return memberDAO.signUp(memberDTO);
	}
	
	public int updateInfo(MemberDTO memberDTO) throws Exception {
		return memberDAO.updateInfo(memberDTO);
	}
	
	public int deleteAccount(MemberDTO memberDTO) throws Exception {
		return memberDAO.deleteAccount(memberDTO);
	}
}
