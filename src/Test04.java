import java.util.Arrays;

//双色球 
//
public class Test04 {
	public static void main(String[] args) {
		//声明变量
		int[][] array = new int[10][7];
		int j = 0;
		int i = 0;
		//双循环赋值
		for( i = 0;i<array.length;i++){//这里面有10个元素
			for( j = 0;j<array[i].length;j++){//里面的7个元素
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
		//打印10期中奖号码
		for(i=0;i<array.length;i++) {
			System.out.print("第" + (i + 1) +"期:");
			for(j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"     ");
			}
			System.out.println();
		}
		//生成的号码用于开奖
		int[] buy =new int[7];
		for(i=0;i<buy.length;i++){
			if(i<=5){
				buy[i]=(int)(Math.random()*33)+1;
			}else{
				buy[i]=(int)(Math.random()*16)+1;
			}
		}
		//打印购买的彩票
		System.out.println(Arrays.toString(buy));
		//4.比较是否中奖,去每一位元素进行比较,并统计
		int count=0;//相同的个数
		for(i=0;i<array.length;i++) {
			for(j=0;j<array[i].length;j++) {
				if(array[i][j]==buy[j])
				count++;
			}
		}
		if(count>=5){
			System.out.println("第" +(i+1)+"期中奖");
		}else{
			System.out.println("第" +(i+1)+"期未中奖,再来一注");
		}
		
	}

}
