package package01;

public class array {

	public static void main(String[] args) {
		int [][]a=new int[][]{{1,2}};
		int [][]b=new int[][]{{2,3,3},{1,2,3}};

		int N=a.length;
		int M=a[0].length;
		int O=b[0].length;
		int[][] c=new int[1][3];
		for(int i=0;i<N;i++){
		for(int j=0;j<O;j++){
		for(int k=0;k<M;k++){
		c[i][j]+=a[i][k]*b[k][j];
		}}}
		for(int i=0;i<N;i++){
			for(int j=0;j<O;j++){
			System.out.println(c[i][j]);
			}
		}

	}

}
