import java.util.Arrays;

/*
 * 练习:
 *	设计彩票
 *	 每期彩票有7个数.
 *		7个数分红球和蓝球
 *		红球1-33  红球6个
 *		蓝球1-16 篮球1个
 *	总共设计10期. 
 *	在模拟一个开奖..相同率在70%以上算是中奖.(要有5个数是相同的.) 
 *  选功能: 不重复.
 */
public class Demo06 {
	public static void main(String[] args) {
		// --1. 提供数组做为存储10期彩票的容器
		int[][] ball = new int[10][7];
		// --2. 利用循环向数组完成10期彩票的赋值操作
		for (int i = 0; i < ball.length; i++) {
			//--给7个元素赋值. 6 1
			for (int j = 0; j < ball[i].length; j++) {
				if (j <=5) {//--前6个  .红球 1-33
					ball[i][j] = (int)(Math.random()*33) + 1;
				}else{//第7个 .蓝球   1-16
					ball[i][j] = (int)(Math.random()*16) + 1;
				}
			}
		}
		
		//--打印10期中奖号码		
		for (int i = 0; i < ball.length; i++) {
			//--给7个元素赋值. 6 1
			System.out.print("第" + (i + 1) +"期:");
			for (int j = 0; j < ball[i].length; j++) {
				System.out.print(ball[i][j]+"     ");
			}
			System.out.println();
		}		
		// --3. 生成购买的彩票号码用于开奖
		int[] buy = new int[7];
		for (int i = 0; i < buy.length; i++) {
			if (i <= 5) {
				buy[i] = (int)(Math.random()*33) + 1;
			}else{
				buy[i] = (int)(Math.random()*6) + 1;
			}
		}
		//--打印购买的彩票
		System.out.println(Arrays.toString(buy));
		
		// --4. 比较是否中奖.取每一位的元素进行一一比较.并统计相同的个数
		int count = 0; //--用于记录相同的个数
		
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
				System.out.println("第" +(i+1)+"期中奖");
			}else{
				System.out.println("第" +(i+1)+"期未中奖,再来一注");
			}
		}	
	}
}
