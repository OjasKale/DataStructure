package arrayPrac;

public class BubbleSort {
	
	public static void main(String[] args) {
		int [] ar = { 3, 11, 2, 9, 1, 5 };
		System.out.print("The array is:");
		for (int i=0; i<ar.length;i++) {
			System.out.print(" " + ar[i]);	
		}
		System.out.println();
		bubblesort(ar);
	}
	
	public static void bubblesort(int ar[]){
		for (int i = (ar.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j <= i; j++)
		      {
		         if (ar[j-1] > ar[j])
		         {
		        	 System.out.println("Swapping:"+ar[j-1]+"<->"+ar[j]); 
		        	 int temp = ar[j-1];
		              ar[j-1] = ar[j];
		              ar[j] = temp;
		              
		         }	 
		     } 
		 }
		for (int i=0; i<ar.length;i++) {
			System.out.print(" " + ar[i]);	
		}
		
	}
}
