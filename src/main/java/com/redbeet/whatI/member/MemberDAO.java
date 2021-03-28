package com.redbeet.whatI.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;

	private final String NAMESPACE = "com.redbeet.whatI.member.MemberDAO.";
	
	public MemberDTO signIn(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"signIn", memberDTO);
	}
	
	public int signUp(MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"signUp", memberDTO);
	}
}
