
public class Ch1P9 
{
	static boolean isSubString(String doub, String c)
	{
		char c1[]=doub.toCharArray();
		char c2[]=c.toCharArray();
		int i=0,j=0,k=0;
		while(i<c1.length && j< c1.length && k<c2.length)
		{
			j=i;
			while(k<c2.length && c2[k]==c1[j]) {k++; j++; }
			if(k<c2.length) {k=0; i=i+1;}
			else return true;
		}
		 
			return false;
	}
	public static void main(String args[])
	{
		String x= "waterbottle";
		String c= "erbottlewa";
		String doub= new String(x+x);
		
		if(x.length()==c.length() && isSubString(doub,c)) 
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}

}
