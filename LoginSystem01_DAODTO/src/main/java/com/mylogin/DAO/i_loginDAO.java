package com.mylogin.DAO;

public interface i_loginDAO {
	public void userInsert(String userID, String userPW, String Mail);
	public boolean userConfirm(String userID,String userPW);

}
