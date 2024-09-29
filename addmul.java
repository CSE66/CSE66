import java.util.*;
class add{

	public static void main(String args[]){
		int n,m,i,j,p,q;
		int x[][],y[][],z[][];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the order of the 1st matrix:");
		n=sc.nextInt();
		m=sc.nextInt();
		System.out.println("enter the order of the 2nd matrix:");
		p=sc.nextInt();
		q=sc.nextInt();		
		x=new int[n][m];
		y=new int[p][q];
		z=new int[n][m];
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
			x[i][j]=sc.nextInt();
		for(i=0;i<m;i++)
			for(j=0;j<m;j++)
			y[i][j]=sc.nextInt();
		if(n!=p||m!=q){
			System.out.println("Matrices haven't the same order! !");
		}
		else{
			
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
					z[i][j]=x[i][j]+y[i][j];
		System.out.println("\t\t----------------Matrices---------------");		
		for(i=0;i<n;i++){
			for(j=0;j<m;j++)
					System.out.print(z[i][j]+"\t");
			System.out.println(" ");
		}				
		}		
	}
}