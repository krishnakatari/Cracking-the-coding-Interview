import java.util.*;



//MagicIndex: A magic index in an array A[0...n-1] is defined to be an index such that A[i] = i. 
//Given a sorted array of distinct integers
// write a method to find a magic index, if one exists, in array A.
 
//recursive soln
public class Ch8P3 {
static List<Integer> arl=new ArrayList<Integer>();
static List<Integer> arl2=new ArrayList<Integer>();

static void recu(int low,int high,int [] a)
	{
		int mid=(low+high)/2;
		if(low>high) return ;
		if(a[mid]==mid) {arl.add(mid); recu(low+1,mid-1,a); recu(mid+1,high,a);}
		if(a[mid]>mid) {recu(low,mid-1,a);}
		if(a[mid]<mid) {recu(mid+1,high,a);}
		
	}
	static void recu2(int low,int high,int [] a)
	{
		int mid=(low+high)/2;
		if(low>high) return ;
		if(a[mid]==mid) {arl2.add(mid); recu(low+1,mid-1,a); recu(mid+1,high,a);}
		if(a[mid]>mid) {recu(low,mid-1,a); recu(a[mid],high,a);
		}
		
		if(a[mid]<mid) {    recu(low,a[mid],a);
			recu(mid+1,high,a);}
		
	}
	public static void main(String[] args) 
	{
		
		int []a= {-2, 1, 2, 3, 4, 6, 7, 10, 20, 30, 40, 50};
		        // 0  1	 2  3  4  5  6   7   8   9	10	11
		int low=0,high=a.length-1,mid=(low+high)/2;
		recu(low,high,a);
		System.out.println(arl);
		int []b= {-2, 1, 2, 3, 4, 6, 6,  7, 11, 11, 11, 11, 50};
        		// 0  1	 2  3  4  5  6   7   8   9	10	11  12
		recu2(0,b.length-1,b);
		System.out.println(arl2);

		
	}

}
