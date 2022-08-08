package j17_컬렉션.ArrayList.복습;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	private String username;
	private String password;
	private String name;
	private String email;
}
