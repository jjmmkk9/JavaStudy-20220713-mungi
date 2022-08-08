package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.NonFinal;

//@NoArgsConstructor
@RequiredArgsConstructor  //final 상수 쓰면 얘 밖에 못씀 
@AllArgsConstructor
public class User {

	private String email;
	private String name;
	@NonNull
	private String userName;
	@NonNull
	private String password;
	
	}

