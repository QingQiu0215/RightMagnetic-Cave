import java.util.ArrayList;
public class RightMagicCave2 
{
    public static boolean MagicCave(int [] A)
    {
    	ArrayList<Integer> arr=new ArrayList<Integer>(A.length);//creates an ArrayList
    	for(int i=0;i<A.length;i++)//add all elements into Arraylist arr from array A.
    		arr.add(A[i]);
    	int count=0;//the variable is to track the times of moving left or right.
    	int i=0;
    	while(count<arr.size())//if the times of moving exceed the size of arr, the while loop end.
    	{   		
    		if(arr.get(i)==0)//if it found the integer 0,return true.
    			return true; 
    		if(arr.get(i)%2==0)//if the value is even
    		{
    			if(arr.get(i)/2<A.length-i)//if the value/2 less than or equal to the right bound, it can move right.
    			{
    				i=i+arr.get(i)/2;//the index shall move right by value/2
    				count++;//moved one time, so increasing count.
    			}
    			//if the value/2 is beyond the right bound but less than the left bound, it can move left.
    			else if((arr.get(i)/2>=A.length-i)&&arr.get(i)/2<=i)
    			{
    				i=i-arr.get(i)/2;//the index shall move left by value/2
    				count++;//moved one time, so increasing count.
    			}
    			//if the value/2 is beyond the right and left bound, return false.
    			else if(arr.get(i)/2>=A.length-i&&arr.get(i)/2>i)
        			return false;
    		}
    		else if(arr.get(i)%2==1)//if the value is odd
    		{
    			if(arr.get(i)/2<A.length-i-1)//if the value/2+1 less than the right bound, it can move right.
    			{
    				i=i+arr.get(i)/2+1;//the index shall move right by value/2+1
    				count++;//moved one time, so increasing count.
    			}
    			//if the value/2+1 is beyond the right bound or equal to right bound but less than the left bound, it can move left.
    			else if((arr.get(i)/2>=A.length-i-1)&&arr.get(i)/2<i)
    			{
    				i=i-arr.get(i)/2-1;//the index shall move left by value/2+1
    				count++;//moved one time, so increasing count.
    			}
    			//if the value/2 is beyond the right and left bound, return false.
    			else if(arr.get(i)/2>=A.length-i-1&&arr.get(i)/2>=i)
    			{
        			return false;
    			}
    		}
    	}
    	return false;//above codes include all the cases, so the line just make compiler happy.
    }
    public static void main(String[] args)
	{  
    	//try 20 different game configurations.
    	int [] arr1={10,16,4,6,2,10,0};
		System.out.println("configuration 1: "+MagicCave(arr1));
		int [] arr2={8,16,10,4,6,10,2,12,8,0};
		System.out.println("configuration 2: "+MagicCave(arr2));
		int [] arr3={10,12,4,5,2,4,10,0};
		System.out.println("configuration 3: "+MagicCave(arr3));
		int [] arr4={8,16,10,4,6,10,2,12,8,9,16,10,4,6,10,2,12,8,0};
		System.out.println("configuration 4: "+MagicCave(arr4));
		int [] arr5={10,16,4,6,8,3,8,12,3,6,8,6,2,10,0};
		System.out.println("configuration 5: "+MagicCave(arr5));
		int [] arr6={2,4,5,3,2,0};
		System.out.println("configuration 6: "+MagicCave(arr6));
		int [] arr7={7,88,4,6,2,6,4,6,34,0};
		System.out.println("configuration 7: "+MagicCave(arr7));
		int [] arr8={0};
		System.out.println("configuration 8: "+MagicCave(arr8));
		int [] arr9={7,8,9,5,4,3,5,12,2,4,5,4,0};
		System.out.println("configuration 9: "+MagicCave(arr9));
		int [] arr10={6,10,6,4,3,4,0};
		System.out.println("configuration 10: "+MagicCave(arr10));
		int [] arr11={8,9,5,13,15,2,6,10,8,5,6,7,3,4,5,0};
		System.out.println("configuration 11: "+MagicCave(arr11));
		int [] arr12={6,5,7,3,4,9,8,6,7,8,3,2,5,0};
		System.out.println("configuration 12: "+MagicCave(arr12));
		int [] arr13={4,6,2,4,0};
		System.out.println("configuration 13: "+MagicCave(arr13));
		int [] arr14={2,2,3,5,3,2,0};
		System.out.println("configuration 14: "+MagicCave(arr14));
		int [] arr15={10,16,6,6,2,10,0};
		System.out.println("configuration 15: "+MagicCave(arr15));
		int [] arr16={7,6,9,9,7,8,4,5,3,4,3,0};
		System.out.println("configuration 16: "+MagicCave(arr16));
		int [] arr17={7,6,87,4,3,5,90,0};
		System.out.println("configuration 17: "+MagicCave(arr17));
		int [] arr18={6,4,3,2,6,8,4,0};
		System.out.println("configuration 18: "+MagicCave(arr18));
		int [] arr19={21,2,4,5,2,5,7,3,4,9,8,9,9,8,0};
		System.out.println("configuration 19: "+MagicCave(arr19));
		int [] arr20={7,6,4,3,54,3,0};
		System.out.println("configuration 20: "+MagicCave(arr20));
		
	}
}
