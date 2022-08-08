package j19_익명클래스.role;

import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class PrincipalDetailse {
	@NonNull
	private User user;  //user가 리스트임
	
	public Collection<? extends GrantedAuthority> getAuthorities(){
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();  //비어있는 컬렉션에 
		
		user.getRoleList().forEach(r -> {
			authorities.add(() -> r);
		});
		return authorities;
	}
	
	public String getUsername () {
		return user.getUsername();
	}
	public String getPassword () {
		return user.getPassword();
	}
//	public static void main(String[] args) {
//		
//		String strRoles = "USER_ROLE, ADMIN_ROLE, MANAGER_ROLE";
////		String[] roleArray = strRoles.split(", ");
//		
//		//공백을 제거
////		strRoles = strRoles.replaceAll(" ", "");
//		
//		//쉼표로 자르기 -> 배열로
//		String[] roleArray = strRoles.replaceAll(" ", "").split(",");
//	
//		
//		List<String> roles = new ArrayList<String>();
//		roles.addAll(Arrays.asList(roleArray)); // ->  반복문 안돌리고 바로 배열을 리스트로 asList
//		
//		System.out.println(roles);
//		
//		Collection<String> roleDatas = new GrantedAuthority() {
//			
//			@Override
//			public Collection<String> getRoles(List<String> roles) {
//				List<String> roleList = new ArrayList<String>();
//				roleList.addAll(roles);
//				return roleList;
//			}
//		}.getRoles(roles);
//		System.out.println(roles);
//		}
	
	}


