import java.util.Arrays;

//˫ɫ�� 
//
public class Test04 {
	public static void main(String[] args) {
		//��������
		int[][] array = new int[10][7];
		int j = 0;
		int i = 0;
		//˫ѭ����ֵ
		for( i = 0;i<array.length;i++){//��������10��Ԫ��
			for( j = 0;j<array[i].length;j++){//�����7��Ԫ��
				int num = (int)(Math.random()*33)+1;
				int blue = (int)(Math.random()*16)+1;
				array[i][j]=j; 
				if(j<6){
					array[i][j]=num;
				}else {
					array[i][j]=blue;
				}
			}
		}
		//��ӡ10���н�����
		for(i=0;i<array.length;i++) {
			System.out.print("��" + (i + 1) +"��:");
			for(j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"     ");
			}
			System.out.println();
		}
		//���ɵĺ������ڿ���
		int[] buy =new int[7];
		for(i=0;i<buy.length;i++){
			if(i<=5){
				buy[i]=(int)(Math.random()*33)+1;
			}else{
				buy[i]=(int)(Math.random()*16)+1;
			}
		}
		//��ӡ����Ĳ�Ʊ
		System.out.println(Arrays.toString(buy));
		//4.�Ƚ��Ƿ��н�,ȥÿһλԪ�ؽ��бȽ�,��ͳ��
		int count=0;//��ͬ�ĸ���
		for(i=0;i<array.length;i++) {
			for(j=0;j<array[i].length;j++) {
				if(array[i][j]==buy[j])
				count++;
			}
		}
		if(count>=5){
			System.out.println("��" +(i+1)+"���н�");
		}else{
			System.out.println("��" +(i+1)+"��δ�н�,����һע");
		}
		
	}

}
