import java.util.Arrays;

//冒泡排序
/*
 * 比较思路:
 * 1.冒泡排序的核心思想让小的往上冒,让大的往下沉
 * 2.
 * 
 * 
*/
public class Demo02 {
	public static void main(String[] args) {
	
	int[] array = new int[]{46,90,78,57,82,83,51,69,44,51,24,79,78};	
	//冒泡
	for(int i =0;i < array.length;i++){//控制比较轮次
		for(int j = 0;j<array.length-1-i;j++){
			int temp = 0;
			if(array[j]>array[j+1]){
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				
			}

		}
		
		System.out.println(Arrays.toString(array));
	}
		
		
		
		
		
	}
}
