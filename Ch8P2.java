
public class Ch8P2 {

	static int recu(int [][]a,int i,int j)
	{
		if(i>=a.length || j>=a[0].length)
		return 0;
		else if(i==a.length-1 && j==a[0].length-1)
			return 1;
		else if(a[i][j]==-1) 
			return 0; 
		else
		{
			return recu(a,i+1,j)+recu(a,i,j+1);
		}
	}
	public static void main(String[] args) {
		int [][] a= {{0,0,0,0},{0,-1,-1,0},{-1,0,0,0}};
		//i max=2 j max=3
		System.out.println(a.length+ " "+a[0].length);
		System.out.println(recu(a,0,0));
		
	}

}
