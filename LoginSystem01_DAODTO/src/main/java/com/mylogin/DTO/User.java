package com.mylogin.DTO;

public class User {

	String userID;
	String userPW;
	String Mail;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userPW=" + userPW + ", Mail=" + Mail + "]";
	}
	
	
}
