
public class Absolute 
{
   public static void subtractValue(int [] arr,int x)
   {
	   int count=0;
	   System.out.println("All pairs of elements of the array that subtract exactly to absolute value of "+Math.abs(x)+" are:");
	   for(int i=0;i<arr.length-1;i++)
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(Math.abs(arr[i]-arr[j])==Math.abs(x))
			   {
				   System.out.println("Indices "+i+" & "+j+" with values "+arr[i]+" & "+arr[j]);
				   count++;
			   }
		   }
	   }
	   if(count==0)
		   System.out.println("There is no such pair in the array.");
   }
   public static void main(String[] args)
   {
	   int [] arr={13,1,-8,21,0,-9,-54,17,31,81,-46};
	   subtractValue(arr,-8);
   }
}
