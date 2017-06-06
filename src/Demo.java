import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] array=new int[10];
		int[] array1=new int[10];
		//1.打印
		System.out.println(Arrays.toString(array));  
		//
		array=Arrays.copyOf(array, 15);
		array=Arrays.copyOf(array1, 15);
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array1));
		/*
		 * 3查找
		 * 有一个前提条件,必须是排好的数组,因为用的是二分法
		 * 在指定的数组中找指定的元素,如果找打返回钙元素下标
		 * 如果找不到该元素.返回-1,(不一定是-1,一定是<0的数.)
		*/
		int index=Arrays.binarySearch(array,6);
		System.out.println("index"+index);
		
		//比较的原理是从下表0开始,到长度-1结束,去两个数组中
		//每一个位上的元素,
		//
		// 比较两个数组是否相同,
//		Arrays.equals(int[] a, int[] a2){
//			
//		}
		
		
		
		
		
		
		
	}
}
