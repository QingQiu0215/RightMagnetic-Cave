
public class RightMagicCave1 
{
	public static int count=0;//the variable is to track the times of moving left or right.
	public static boolean MagicCave(int [] A,int i)
	{
	    count++;
		if(A[i]==0)
			return true;
		if(count>=A.length)//if the times of moving exceed or equal to the length of A, return false.
			return false;
		if(A[i]%2==0)//if the value is even
		{
			if(A[i]/2<A.length-i)//if the value/2 less than or equal to the right bound, it can move right.
				return MagicCave(A,i+A[i]/2);//return the method with i increases to i+A[i]/2
			else if((A[i]/2>=A.length-i)&&A[i]/2<=i)//if the value/2 is beyond the right bound but less than the left bound, it can move left.
				return MagicCave(A,i-A[i]/2);//return the method with i decrease to i-A[i]/2
		}
		if(A[i]%2==1)//if the value is odd
		{
			if(A[i]/2<A.length-i-1)//if the value/2+1 less than the right bound, it can move right.
				return MagicCave(A,i+A[i]/2+1);//return the method with i increases to i+A[i]/2+1
			else if((A[i]/2>=A.length-i-1)&&A[i]/2<i)//if the value/2+1 is beyond the right bound or equal to right bound but less than the left bound, it can move left.
				return MagicCave(A,i-A[i]/2-1);//return the method with i decrease to i-A[i]/2-1
		}
			return false;		
	}
	public static void main(String[] args)
	{
		//try 20 different game configurations.
		int [] arr1={10,16,4,6,2,10,0};
		System.out.println("configuration 1: "+MagicCave(arr1,0));
		count=0;
		int [] arr2={8,16,10,4,6,10,2,12,8,0};
		System.out.println("configuration 2: "+MagicCave(arr2,0));
		count=0;
		int [] arr3={10,9,4,7,2,8,0};
		System.out.println("configuration 3: "+MagicCave(arr3,0));
		count=0;
		int [] arr4={8,16,10,4,6,10,2,12,8,9,16,10,4,6,10,2,12,8,0};
		System.out.println("configuration 4: "+MagicCave(arr4,0));
		count=0;
		int [] arr5={10,16,4,6,8,3,8,12,3,6,8,6,2,10,0};
		System.out.println("configuration 5: "+MagicCave(arr5,0));
		count=0;
		int [] arr6={2,4,5,3,2,0};
		System.out.println("configuration 6: "+MagicCave(arr6,0));
		count=0;
		int [] arr7={7,88,4,6,2,6,4,6,34,0};
		System.out.println("configuration 7: "+MagicCave(arr7,0));
		count=0;
		int [] arr8={0};
		System.out.println("configuration 8: "+MagicCave(arr8,0));
		count=0;
		int [] arr9={7,8,9,5,4,3,5,12,2,4,5,4,0};
		System.out.println("configuration 9: "+MagicCave(arr9,0));
		count=0;
		int [] arr10={6,10,6,4,3,4,0};
		System.out.println("configuration 10: "+MagicCave(arr10,0));
		count=0;
		int [] arr11={8,9,5,13,15,2,6,10,8,5,6,7,3,4,5,0};
		System.out.println("configuration 11: "+MagicCave(arr11,0));
		count=0;
		int [] arr12={6,5,7,3,4,9,8,6,7,8,3,2,5,0};
		System.out.println("configuration 12: "+MagicCave(arr12,0));
		count=0;
		int [] arr13={4,6,5,4,0};
		System.out.println("configuration 13: "+MagicCave(arr13,0));
		count=0;
		int [] arr14={2,2,3,5,3,2,0};
		System.out.println("configuration 14: "+MagicCave(arr14,0));
		count=0;
		int [] arr15={10,16,6,6,2,10,0};
		System.out.println("configuration 15: "+MagicCave(arr15,0));
		count=0;
		int [] arr16={7,6,9,9,7,8,4,5,3,4,3,0};
		System.out.println("configuration 16: "+MagicCave(arr16,0));
		count=0;
		int [] arr17={7,6,87,4,3,5,90,0};
		System.out.println("configuration 17: "+MagicCave(arr17,0));
		count=0;
		int [] arr18={6,4,3,2,6,8,4,0};
		System.out.println("configuration 18: "+MagicCave(arr18,0));
		count=0;
		int [] arr19={21,2,4,5,2,5,7,3,4,9,8,9,9,8,0};
		System.out.println("configuration 19: "+MagicCave(arr19,0));
		count=0;
		int [] arr20={7,6,4,3,54,3,0};
		System.out.println("configuration 20: "+MagicCave(arr20,0));
		count=0;
	}
}
