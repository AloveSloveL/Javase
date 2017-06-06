import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		// 1.声明两个数组
		int[] array = new int[10];
		int[] array1 = new int[10];
		array[0] = 1;
		array1[0] = 1;
		// 2.输出两个数组
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array1));
		// 3.对比每一个元素并声明下标
		if (array.length != array1.length) {
			System.out.println("长度不同,数组不相同");
			return;// 退出应用
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != array1[i]) {
					System.out.println("数组不相同");
					return;
 				}

			}
		}

	}
}
