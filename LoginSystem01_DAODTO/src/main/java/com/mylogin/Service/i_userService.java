package com.mylogin.Service;

public interface i_userService {
	
	void userRegister(String userID, String userPW, String Mail);
	boolean userConfirm(String userID, String userPW);
	void userModify();
	void userRemove();



}
