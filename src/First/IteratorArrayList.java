package First;
import java.util.*;
public class IteratorArrayList {
//19.  WAP to iterate through all elements in an array list	
	
	public static void main(String[] args) {
		 List<Integer> names = Arrays.asList(6,8,7,5,2,4,8,7);
		 for (int i=0; i<names.size();i++) {
			 System.out.print(names.get(i) + " ");
		 }
				 

//// 20 .WAP to update specific array element by given element.

ArrayList<String> names1= new ArrayList<String>();
names1.add("Maruti");
names1.add("Lemborgini");
names1.add("WolksWagon");
names1.add("Ferrari");
names1.add("Toyota");

names1. remove ("Maruti");
System.out.println(names1);


// 21.  WAP to Copy one array into another 

		 int a[] = { 4,5,5,9,6, };	        int b[] = new int[a.length];
	        b = a;
	        b[0]++;
	  
	        System.out.println("Contents of a[] ");
	        for (int i = 0; i < a.length; i++)
	            System.out.print(a[i] + " ");  
	        System.out.println("\n\nContents of b[] ");
	        for (int i = 0; i < b.length; i++)
	            System.out.print(b[i] + " ");
	    

	
	// 22. WAP to reverse an array of integer values
	        int [] arr = new int [] {1,5,6,9,7};
	        System.out.println("main array");
	        int s;
	        for(s =0; s<arr.length;s++){
	        System.out.print(arr[s]+ " ");
	        }
       System.out.println();
        System.out.println("Array in reverse order");
	        for ( s= arr.length-1;s>=0;s--) {
	        	System.out.print(arr[s]+ " ");
	        }

	        
 // 23. WAP to find the second largest element in an array
	        
		int arr1 []= {10,52,63,41,87,98};
		int size = arr1.length;
		Arrays.sort(arr1);
		System.out.println("sorted array:"+ Arrays.toString(arr1));
		int hvm= arr1[size-3];
		System.out.println("second largest element is "+hvm);
		
		
// 24. W.A.J.P. which will ask the user to enter his/her marks (out of 100).
//		Define a method that will display grades according to the marks
//		entered as below:
//		Marks Grade
//		91-100 AA
//		81-90 AB
//		71-80 BB
//		61-70 BC
//		51-60 CD
//		41-50 DD
//		<=40 Fail	
		
	System.out.println("enter marks");
	Scanner sc =new Scanner (System.in);
	int Marks = sc.nextInt();
	if ( Marks <=40 ) {
		System.out.println("Fail");
	} else if (Marks >= 40 && Marks <=50 ) {
		System.out.println("DD ");
		} else if (Marks >= 51 && Marks <=60 ) {
			System.out.println("CD ");
		}else if (Marks >= 61 && Marks <=70 ) {
			System.out.println("BC");
		}else if (Marks >= 71 && Marks <=80 ) {
			System.out.println("BB ");
		}else if (Marks >= 81 && Marks <=90 ) {
			System.out.println("AB ");
		}else if (Marks >= 40 && Marks <=50 ) {
			System.out.println("AA ");
		} else {
			System.out.println("Invalid Value");
		}
		
		
		

		
}
}
