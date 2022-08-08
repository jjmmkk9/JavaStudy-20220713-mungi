package j16_제네릭;

import lombok.Data;

@Data					//Type > Element  Type이 상위
public class GenericTest<K, V> {
	private K key;
	private V value;


}
