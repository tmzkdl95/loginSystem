package com.mylogin.DAO;

import java.util.HashMap;

import com.mylogin.DTO.User;

public class loginDAO implements i_loginDAO {
	
	public HashMap<String,User> h;
	public User user;
	
	@Override
	public void userInsert(String userID, String userPW, String Mail) {
		// TODO Auto-generated method stub
		System.out.println("user set 실행");
		h = new HashMap<String,User>();
		user = new User();
		user.setUserID(userID);
		user.setUserPW(userPW);
		user.setMail(Mail);
		h.put(userID, user);
		System.out.println("가입이 완료되었습니다." + h);
	}

	@Override
	public boolean userConfirm(String userID, String userPW) {
		// TODO Auto-generated method stub
		System.out.println("userConfirm 접속");
		//user = new User();
		//System.out.println("유저 객체 생성 완료");
		System.out.println(h);
		System.out.println("유저 정보 얻어오는중...");
		if(h == null){System.out.println("NULL!!!"); return false;}
		else{ 
			  System.out.println("유저 정보 획득!");
			  System.out.println("유저 정보 :" + h.get(userID));
			  return true;
		}
	}
	

}
	