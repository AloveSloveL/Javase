import java.util.Arrays;

/*
 * ��ϰ:
 *	��Ʋ�Ʊ
 *	 ÿ�ڲ�Ʊ��7����.
 *		7�����ֺ��������
 *		����1-33  ����6��
 *		����1-16 ����1��
 *	�ܹ����10��. 
 *	��ģ��һ������..��ͬ����70%���������н�.(Ҫ��5��������ͬ��.) 
 *  ѡ����: ���ظ�.
 */
public class Demo06 {
	public static void main(String[] args) {
		// --1. �ṩ������Ϊ�洢10�ڲ�Ʊ������
		int[][] ball = new int[10][7];
		// --2. ����ѭ�����������10�ڲ�Ʊ�ĸ�ֵ����
		for (int i = 0; i < ball.length; i++) {
			//--��7��Ԫ�ظ�ֵ. 6 1
			for (int j = 0; j < ball[i].length; j++) {
				if (j <=5) {//--ǰ6��  .���� 1-33
					ball[i][j] = (int)(Math.random()*33) + 1;
				}else{//��7�� .����   1-16
					ball[i][j] = (int)(Math.random()*16) + 1;
				}
			}
		}
		
		//--��ӡ10���н�����		
		for (int i = 0; i < ball.length; i++) {
			//--��7��Ԫ�ظ�ֵ. 6 1
			System.out.print("��" + (i + 1) +"��:");
			for (int j = 0; j < ball[i].length; j++) {
				System.out.print(ball[i][j]+"     ");
			}
			System.out.println();
		}		
		// --3. ���ɹ���Ĳ�Ʊ�������ڿ���
		int[] buy = new int[7];
		for (int i = 0; i < buy.length; i++) {
			if (i <= 5) {
				buy[i] = (int)(Math.random()*33) + 1;
			}else{
				buy[i] = (int)(Math.random()*6) + 1;
			}
		}
		//--��ӡ����Ĳ�Ʊ
		System.out.println(Arrays.toString(buy));
		
		// --4. �Ƚ��Ƿ��н�.ȡÿһλ��Ԫ�ؽ���һһ�Ƚ�.��ͳ����ͬ�ĸ���
		int count = 0; //--���ڼ�¼��ͬ�ĸ���
		
		for (int i = 0; i < ball.length; i++) {
			for (int j = 0; j < ball[i].length; j++) {				
				if (ball[i][j] == buy[j]) {
					count ++;
				}
			}
/*			if ((double)count / ball[i].length >=0.75) {
				
			}
*/	
			if (count >= 5) {
				System.out.println("��" +(i+1)+"���н�");
			}else{
				System.out.println("��" +(i+1)+"��δ�н�,����һע");
			}
		}	
	}
}
