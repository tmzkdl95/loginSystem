package com.mylogin.DAO;

import java.util.HashMap;

import com.mylogin.DTO.User;

public class loginDAO implements i_loginDAO {
	
	public HashMap<String,User> h;
	public User user;
	
	@Override
	public void userInsert(String userID, String userPW, String Mail) {
		// TODO Auto-generated method stub
		System.out.println("user set ����");
		h = new HashMap<String,User>();
		user = new User();
		user.setUserID(userID);
		user.setUserPW(userPW);
		user.setMail(Mail);
		h.put(userID, user);
		System.out.println("������ �Ϸ�Ǿ����ϴ�." + h);
	}

	@Override
	public boolean userConfirm(String userID, String userPW) {
		// TODO Auto-generated method stub
		System.out.println("userConfirm ����");
		//user = new User();
		//System.out.println("���� ��ü ���� �Ϸ�");
		System.out.println(h);
		System.out.println("���� ���� ��������...");
		if(h == null){System.out.println("NULL!!!"); return false;}
		else{ 
			  System.out.println("���� ���� ȹ��!");
			  System.out.println("���� ���� :" + h.get(userID));
			  return true;
		}
	}
	

}
	