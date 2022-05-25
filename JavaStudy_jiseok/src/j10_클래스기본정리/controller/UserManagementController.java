package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	//변수는 특별한 일 빼고는 private으로 줌
	private UserService userService;
	
	public UserManagementController() {
		userService = new UserService();
	}
	
	public void createUser() {
		User user = userService.insertUser();
		
		System.out.println("[새로 추가된 사용자]");
		System.out.println(user.toString());
	}
	
	
	public void updateUser() {
		
	}

}
