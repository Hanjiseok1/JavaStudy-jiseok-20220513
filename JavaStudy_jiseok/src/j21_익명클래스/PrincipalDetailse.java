package j21_익명클래스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrincipalDetailse {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		
		
		
		//익명클래스: 따로 클래스가 정의가 되지 않고 바로 구현을 함. 또한 한번만 사용 할 경우 익명클래스를 이용함. 구현내용이 달라져야할때 사용함
		GrantedAuthority grantedAuthority = new GrantedAuthority() { 
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				
				return roles;
			}
			
		};
		
		GrantedAuthority grantedAuthority3 = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				
				return roles;
			}
		};
		
			GrantedAuthority grantedAuthority2 = new GrantedAuthorityImpl();
			
			grantedAuthority.getRoles(strList).forEach(r -> {System.out.println(r);}); //매개변수가 하나인 경우 괄호를 생략할수있음.
			grantedAuthority2.getRoles(strList).forEach(r -> {System.out.println(r);});
			grantedAuthority3.getRoles(strList).forEach(r -> {System.out.println(r);});
			
			
	}
	
}
