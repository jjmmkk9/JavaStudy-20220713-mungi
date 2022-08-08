package j18_JSON;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	/*
	 * serialize는 객체를 json으로 변환할 때 
	 * deserialize json을 객체로 변환할 때 
	 */
	@Expose(serialize = true, deserialize = true)
	private int userCode;
	@Expose(serialize = true, deserialize = true)
	@SerializedName("userId")  //이름을 바꿀래
	private String username;
	@Expose(serialize = false, deserialize = true)
	private String password;  //password를 공개안하고 싶으면 자료형 앞에 transient
	@Expose(serialize = true, deserialize = true)
	private String name;
	@Expose(serialize = true, deserialize = false)
	private String email;
	@Expose(serialize = true, deserialize = true)
	private String address;
	@Expose(serialize = true, deserialize = true)
	private String phone;
	@Expose(serialize = true, deserialize = true)
	private List<String> hobby;
	
}
