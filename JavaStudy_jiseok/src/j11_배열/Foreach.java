package j11_배열;

public class Foreach {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if(numbers.length-1 != i) {
				System.out.print(", ");	
			}
		}
		System.out.println();
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + (numbers.length-1 != i ? ", " : ""));
		}
		System.out.println();
		
		int i = 0;
		for(int num : numbers) {//처음부터 끝까지 반복하는것. 배열에서 처음갓을 불러와 넘에 넣음
			System.out.print(num + (numbers.length-1 != i ? ", " : ""));
			i++;
		}
	}
}
