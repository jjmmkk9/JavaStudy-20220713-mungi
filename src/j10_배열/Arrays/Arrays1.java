package j10_배열.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays1 {

	public static void main(String[] args) {
		/*
		 * Arrays 클래스 사용법
		 *  -배열을 관리해주는 객체
		 *  1. 배열의 내용을 검색 후 인덱스를 반환받는 방법
		 *  	-binarySearch(찾고자하는 값)
		 *  2. 배열을 복사할때 사용하는 메소드
		 *   	-copyOf(복사하고자하는 배열, 새로 생성할 배열의 크기)
		 *  3. 배열을 복사할 때 원하는 범위만 복사해주는 메소드
		 *  	-copyOfRange(복사하고자하는 배열, 시작인덱스, 마지막 인덱스)
		 *  4. 배열을 초기화하고 원하는 값으로 모두 채우는 메소드
		 *  	-fill(초기화하고자하는 배열, 채울 값)
		 *  5. 배열을 정렬하는 방법
		 *  	-sort(정렬하고자하는 배열)
		 *  
		 *  배열은 numbers. 찍어도 우리가 쓸만한게 잘 없음 
		 *  그래서 배열은 Arrays 클래스를 통해서 사용해야한다. 
		 */
		System.out.println("얕은 복사");
		int[] numbers = {1, 9, 2, 8, 3, 7, 4, 6, 5};
//얕은 복사 = 내용을 복사하는게 아닌 주소만 복사하는 것
		int[] numbers2 = numbers;
		printArray(numbers);
		printArray(numbers2);
		//여기는 통으로 복사 돼서 numbers2에만 100이 들어가지 않음
		numbers2[0] = 100;
		printArray(numbers);
		printArray(numbers2);
		
		System.out.println("깊은 복사");
//깊은 복사 = 주소를 통으로 복사한게 아니라 내용을 각자 복사해준것.
		
		int[] numbers3 = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			numbers3[i] = numbers[i];
		}
		printArray(numbers3);
		numbers3[0] = 200;
		printArray(numbers);
		printArray(numbers3);
		
		System.out.println("\nArrays.copyOf(numbers, numbers.length)");
		int[] numbers4 = Arrays.copyOf(numbers, numbers.length);
		printArray(numbers4);
		
		System.out.println("\nArrays.copyOfRange(numbers, 1, 5)");
		int[] numbers5 = Arrays.copyOfRange(numbers, 1, 5);
		printArray(numbers5);
		
//오름차순
		Arrays.sort(numbers4);
		System.out.println("\nArrays.sort(numbers4)");
		printArray(numbers4);
//내림차순
		int num = 10;
		Integer[] numArray = {1, 2, 3, 4, 5};
							//Collections 는 Integer 자료형 써야한다.
		Arrays.sort(numArray, Collections.reverseOrder());
		System.out.println("\nArrays.sort(numArray, Collections.reverseOrder())");
		printArray(numArray);
		
//배열 초기화 후 채우기
		Arrays.fill(numbers5, 10);
		System.out.println("\nArrays.fill(numbers5, 10)");
		printArray(numbers5);
		
//값의 위치 찾기 - > search 하기 전에 무족건 정렬 먼저 해줌
		Arrays.sort(numbers);
		int index = Arrays.binarySearch(numbers, 5);
		System.out.println("\nint index = Arrays.binarySearch(numbers, 5)");
		printArray(numbers);
		System.out.println("index: " + index);
		
		
	}
	//printArray 메소드: 배열을 받아와서 반복문으로 배열 출력
	public static void printArray(int[] arr) {
		System.out.print("Array: [ ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			// 제일 마지막 인덱스는 arr.length - 1이다. 마지막에는 ", " 안찍힘
			if(i != arr.length - 1) {
			System.out.print(", ");
			}
		}
		System.out.println(" ]");
	}
	//오버로딩이죠 자료형이 다르니까 동일 메소드명 사용 가능~
	public static void printArray(Integer[] arr) {
		System.out.print("Array: [");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			if(i != arr.length - 1) {
			System.out.print(", ");
			}
		}
		System.out.println(" ]");
	}
}
