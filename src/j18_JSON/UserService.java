package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
		//"생성하기도 귀찮다! 스태틱 줄게요"
	public static User createUser() {  //반환 자료형이 User 클래스
		List<String> hobby = new ArrayList<String>();
	//	hobby.addAll(Arrays.asList(new String[] {"수영", "넷플릭스", "야구보기", "강아지만지기"}));
		hobby.addAll(Arrays.asList(new String[] {"수영", "넷플릭스", "야구보기", "강아지 만지기"}));
		
		User user = User.builder()
				.userCode(1)
				.username(null)
				.password("1234")
				.name("조문기")
				.email("jmk@naver.com")
				.address("김해")
				.phone("010-4717-8209")
				.hobby(hobby)
				.build();
		return user;  //user객체를 반환
	}
}
