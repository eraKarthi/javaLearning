public class GenericMethodTest {

	public static <T> void printArray(T[] inputArray) {

		for (T element : inputArray) {
			System.out.printf("%s", element);

		}
		System.out.println("");
	}

	public static void main(String args[]) {

		Integer[] intArray = { 1, 2, 3, 4 };
		Double[] doubleArray = { 1.1, 2.1 };
		Character[] charArray = { 'a', 'b' };

		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
	}

}
