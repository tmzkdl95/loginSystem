package com.mylogin.Service;

import com.mylogin.DAO.loginDAO;

public class userService implements i_userService {
	
	public loginDAO dao;
	public void userRegister(String userID, String userPW, String Mail){
		System.out.println("dao 실행");
		dao = new loginDAO();
		dao.userInsert(userID, userPW, Mail);
	}
	@Override
	public void userModify() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void userRemove() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean userConfirm(String userID, String userPW) {
		// TODO Auto-generated method stub
		dao = new loginDAO();
		System.out.println("dao 생성 후 유저 확인중");
		dao.userConfirm(userID, userPW);
		return false;
	}


}
