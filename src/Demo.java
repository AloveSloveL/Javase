import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] array=new int[10];
		int[] array1=new int[10];
		//1.��ӡ
		System.out.println(Arrays.toString(array));  
		//
		array=Arrays.copyOf(array, 15);
		array=Arrays.copyOf(array1, 15);
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array1));
		/*
		 * 3����
		 * ��һ��ǰ������,�������źõ�����,��Ϊ�õ��Ƕ��ַ�
		 * ��ָ������������ָ����Ԫ��,����Ҵ򷵻ظ�Ԫ���±�
		 * ����Ҳ�����Ԫ��.����-1,(��һ����-1,һ����<0����.)
		*/
		int index=Arrays.binarySearch(array,6);
		System.out.println("index"+index);
		
		//�Ƚϵ�ԭ���Ǵ��±�0��ʼ,������-1����,ȥ����������
		//ÿһ��λ�ϵ�Ԫ��,
		//
		// �Ƚ����������Ƿ���ͬ,
//		Arrays.equals(int[] a, int[] a2){
//			
//		}
		
		
		
		
		
		
		
	}
}
