import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {

		int[] array = new int[] { 46, 90, 78, 57, 82, 83, 51, 69, 44, 51, 24, 79, 78 };
		// ц╟ещ
		int i = 0;
		while (i < array.length) {
			int j = 0;
			while (j < array.length - 1 - i) {
				int temp = 0;
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(array));

	}
}
