package com.mylogin.loginapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mylogin.Service.userService;

@Controller
public class loginController {

	userService login_service; //���� ��ü ����
	
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
			//���� true���
			return "home";
		}
		else
			return "loginSystem/login";
	}
	
	@RequestMapping(value = "/memberJoin", method = RequestMethod.GET)
	public String Login_memberJoin_get(){
		System.out.println("ȸ������ ������ ����");
		
		return "loginSystem/memberJoin";
	}
	
	@RequestMapping(value = "/memberJoin", method = RequestMethod.POST)
	public String Login_memberJoin(Model model, HttpServletRequest request){
		System.out.println("ȸ�� ��� ����");
		String userID = request.getParameter("id");
		String userPW = request.getParameter("passwd");
		String userMail = request.getParameter("mail");
		System.out.println("userID : "+ userID + " userPW :"  + userPW +" userMail : "+userMail);
		//��� ���� ��ü ����
		System.out.println("��� ���� ��ü ����");
		login_service = new userService();
		login_service.userRegister(userID, userPW, userMail);
		return "loginSystem/login";
	}
	
}
