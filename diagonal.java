import java.util.*;
class diagonal{
	public static void main(String args[]){
	int x[][],i,j,m,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("!!! PLEASE TRY TO ENTER A SQUARE MATRIX !!!");
	System.out.println("Order of the matrix:");
	m=sc.nextInt();
	x=new int[m][m];
	for(i=0;i<m;i++)
		for(j=0;j<m;j++)
			x[i][j]=sc.nextInt();
		
	System.out.println("---------------- matrix----------------");
	for(i=0;i<m;i++){
		for(j=0;j<m;j++){
				System.out.print("\t"+x[i][j]);
				if(i==j){
					sum=sum+x[i][j];
				}
		}
			System.out.println("");
	}
	System.out.println("the sum of diagonal; elements:"+sum);
  }	
}