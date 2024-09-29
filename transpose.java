import java.util.*;
class transpose{
	public static void main(String args[]){
	int x[][],y[][],i,j,m,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Order of the matrix:");
	m=sc.nextInt();
	n=sc.nextInt();
	x=new int[m][n];
	y=new int[n][m];
	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
			x[i][j]=sc.nextInt();
		}
	}
	System.out.println("---------------- matrix----------------");
	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
				System.out.print("\t"+x[i][j]);
		}
			System.out.println("");
	}
	for(i=0;i<m;i++){
		for(j=0;j<n;j++)
			y[j][i]=x[i][j];
		}
	System.out.println("---------------- transpose----------------");
	for(i=0;i<n;i++){
		for(j=0;j<m;j++){
				System.out.print("\t"+y[i][j]);
		}
			System.out.println("");
	}		
}
}