
public class Demo03 {
	public static void main(String[] args) {
		int[][] table = new int[5][7];
		for(int i = 0; i < table.length;i++){
			for(int j = 0;j<table[i].length;j++){
				table[i][j] = j;
			}
		}
		for(int i = 0;i<table.length;i++){
			for(int j = 0;j<table[i].length;j++){
				System.out.println("课表[第"+(i+1)+"天][第"+(j+1)+"节课]");
			}
		}

	}
}
