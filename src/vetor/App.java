package vetor;

public class App {

	public static void main(String[] args) {

		int[] numbers = { 5, 4, 2, 1, 3 };

		for (int o : numbers) {
			System.out.println(o);
		}
		
		
		int[] arr = { 10, -1, 20, 35, 40, 15, 6, 57, 98, 900 };
		
		for (int i = 0; i < arr.length; i++) System.out.println("Element at index " + i + ": " + arr[i]);

	}

}

