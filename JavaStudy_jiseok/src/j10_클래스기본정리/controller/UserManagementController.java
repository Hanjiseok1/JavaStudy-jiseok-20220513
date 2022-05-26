package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	//변수는 특별한 일 빼고는 private으로 줌
	private UserService userService;
	private User[] users; //User객체를 담을수있는 공간 5개를 만듬.
	
	public UserManagementController(UserService userService) {
		this.userService = userService;
		users = new User[2]; // null이 2개 들어있음
	}
	
	public void createUser() {
		int indexResult = findEmptyInUsers();
		if(indexResult != -1) {
			users[indexResult] = userService.insertUser();
			
			System.out.println("[새로 추가된 사용자]");
			System.out.println(users[indexResult].toString());
		}else {
			System.out.println("더 이상 사용자를 추가할 수 없습니다.");
		}
	}
	
	private int findEmptyInUsers() {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void updateUser() {
		
	}

}
