
public class PracticalWork4 {

	public static void main(String[] args) {
		int[] array = { 8, 5, 10, -8, 20, 45, -56, 20, -45, 1 };
		int[] array2 = { 8, 5, 10, -8, 20, 45, -56, 20, -45 };
		boolean answer = areArrayTotalsEqual(array, array2);
		System.out.println(answer);

	}

	public static boolean areArrayTotalsEqual(int[] array, int[] array2) {
		if (array.length == array2.length && arraySum(array) == arraySum(array2)) {
			return true;
		} else {
			return false;
		}
	}

	public static int arraySum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

}
