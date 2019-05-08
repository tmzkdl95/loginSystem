package com.mylogin.loginapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mylogin.Service.userService;

@Controller
public class loginController {

	userService login_service; //서비스 객체 생성
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String LoginFirst(){
		
		return "loginSystem/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String Login(Model model, HttpServletRequest request) {
		
		//System.out.println("model = "+model);
		String userID = request.getParameter("id");
		String userPW = request.getParameter("passwd");
		System.out.println("userID : "+ userID + " userPW : "  + userPW);
		//login_service = new userService();
		if(login_service.userConfirm(userID, userPW)){
			//만약 true라면
			return "home";
		}
		else
			return "loginSystem/login";
	}
	
	@RequestMapping(value = "/memberJoin", method = RequestMethod.GET)
	public String Login_memberJoin_get(){
		System.out.println("회원가입 페이지 접속");
		
		return "loginSystem/memberJoin";
	}
	
	@RequestMapping(value = "/memberJoin", method = RequestMethod.POST)
	public String Login_memberJoin(Model model, HttpServletRequest request){
		System.out.println("회원 등록 실행");
		String userID = request.getParameter("id");
		String userPW = request.getParameter("passwd");
		String userMail = request.getParameter("mail");
		System.out.println("userID : "+ userID + " userPW :"  + userPW +" userMail : "+userMail);
		//등록 서비스 객체 실행
		System.out.println("등록 서비스 객체 실행");
		login_service = new userService();
		login_service.userRegister(userID, userPW, userMail);
		return "loginSystem/login";
	}
	
}
