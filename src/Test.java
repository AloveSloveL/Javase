import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		// 1.������������
		int[] array = new int[10];
		int[] array1 = new int[10];
		array[0] = 1;
		array1[0] = 1;
		// 2.�����������
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array1));
		// 3.�Ա�ÿһ��Ԫ�ز������±�
		if (array.length != array1.length) {
			System.out.println("���Ȳ�ͬ,���鲻��ͬ");
			return;// �˳�Ӧ��
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != array1[i]) {
					System.out.println("���鲻��ͬ");
					return;
 				}

			}
		}

	}
}
