package arrayPrac;

public class ArrayApp {

	public static void main(String[] args) {
		long[] arr;
		arr = new long[100];
		int nElements = 0;
		int j = 0;
		long searchKey;
		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
		nElements = 10;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
			System.out.println("");
			
			searchKey = 66; 
			for( j=0; j<nElements; j++) // for each element,
			if(arr[j] == searchKey) // found item?
			break; // yes, exit before end
			if(j == nElements) // at the end?
			System.out.println("Can’t find " + searchKey); // yes
			else
			System.out.println("Found key:" + searchKey); // no
			
			
			searchKey = 55; // delete item with key 55
			for(j=0; j<nElements; j++) // look for it
			if(arr[j] == searchKey)
			break;
			for(int k=j; k<nElements-1; k++) // move higher ones down
			arr[k] = arr[k+1];
			nElements--;
			for(j=0; j<nElements; j++) // display items
				System.out.print( arr[j] + "");
				System.out.println("");
		}
	}

}
