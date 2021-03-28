package com.redbeet.whatI.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="signIn")
	public void signIn() throws Exception {
		
	}
	
	
	@RequestMapping(value="signIn", method= RequestMethod.POST)
	public String signIn(MemberDTO memberDTO, HttpSession session) throws Exception {
		memberDTO = memberService.signIn(memberDTO);
		session.setAttribute("member", memberDTO);
		String re = "./signIn";
		if(memberDTO!=null) {
			re = "redirect:../";
		}
		return re;
	}
	
	@RequestMapping(value="signOut")
	public String signOut(HttpSession session) throws Exception {
		session.invalidate();
		return "redirect:../";
	}
	
	@RequestMapping(value="signUp")
	public void signUp() throws Exception {
		
	}
	
	@RequestMapping(value="signUp", method = RequestMethod.POST)
	public String signUp(MemberDTO memberDTO) throws Exception {
		int result = memberService.signUp(memberDTO);
		String re = "./signUp";
		if(result!=0) {
			re = "redirect:../";
		}
		return re;
	}

}
