import java.util.Arrays;

//ð������
/*
 * �Ƚ�˼·:
 * 1.ð������ĺ���˼����С������ð,�ô�����³�
 * 2.
 * 
 * 
*/
public class Demo02 {
	public static void main(String[] args) {
	
	int[] array = new int[]{46,90,78,57,82,83,51,69,44,51,24,79,78};	
	//ð��
	for(int i =0;i < array.length;i++){//���ƱȽ��ִ�
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
