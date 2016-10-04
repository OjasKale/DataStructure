package arrayPrac;

public class SelectionSort {

	public static void main(String[] args) {
		int [] ar = { 3, 11, 2, 9, 1, 5 };
		selectionSort(ar);
	}
	static void selectionSort(int[] ar){
		   System.out.println(ar.length);
		
		for (int i = 0; i < (ar.length - 1); i++)
		   {
		      int min = i;
		      for (int j = i+1;j < ar.length; j++)
		            if (ar[j] < ar[min]) min = j;
		      int temp = ar[i];
		      ar[i] = ar[min];
		      ar[min] = temp;
		   }
	
	for (int i = 0; i < ar.length; i++) {
		System.out.print(" "+ar[i]);
	}
	
	}

}
