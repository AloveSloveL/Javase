
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
				System.out.println("�α�[��"+(i+1)+"��][��"+(j+1)+"�ڿ�]");
			}
		}

	}
}
