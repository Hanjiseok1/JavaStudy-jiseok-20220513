package j10_클래스기본정리;

import j10_클래스기본정리.controller.UserManagementController;

// 임폴트를 하는 이유 - 컨트롤러를 쓰고싶은데 나랑 똑같은 패키지에 없어서 
public class UserManagementApplication {

	public static void main(String[] args) {
		UserManagementController userManagementController = new UserManagementController();
		userManagementController.createUser();
	}

}
