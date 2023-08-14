package First;
import java.util.*;
public class AssignmentPage2 {
public static void main(String[] args) {
	
// 10.  WAP to calculate the average value of array elements
	System.out.println("Question 10");
	System.out.println("average value of array element");
	double [] arr= {18,25,64,87,73};
	double length =arr.length;
	double sum=0;
	for (int i=0;i<length;i++) {
		sum=sum+arr[i];		
}
	System.out.println(sum);
	double average =sum / length ;
	System.out.println(average);
	  
	
// 11. WAP to find the index of an array element
	System.out.println("Question 11");
	System.out.println("Find index of an array element");
	String [] colour = {"green","red","brown","yellow"};
	int index = 0;
	for(int p=1;p<colour.length;p++) {
		if (colour[p]=="red") {
		System.out.println();
		index=p;
		}
	}
		System.out.println(index);
		
	

// 12.  WAP to find the maximum and minimum value of an array
	
System.out.println("Question no.12");
System.out.println("find the maximum and minimum value of an array");
     int[] nuber1= {12,52,84,21,35,};
     Arrays.sort(nuber1);
     
    		System.out.println("min" + nuber1[0] +"\nmax" + nuber1 [4]);
    		  
    	  
      

 // 13. WAP to Compare Two String.
System.out.println("Question no. 13");
    		String a = "BHUMIT";
            String b = "BHumit";

           if(a.equals(b)){
               System.out.println("Both strings are equal.");
            } else {
              System.out.println("Both strings are not equal.");
            }          

  
// 14. WAP to concatenate a given string to the end of another string.
 
	String h = "Galaxy says: How are you Planet ? ";
	String k1 ="Planet says :Chilling bro"	;
	System.out.println(h+k1);


// 15.WAP to demonstrate try catch block.
System.out.println("Question no. 15");
System.out.println("Demostraate try catch block");
	try {
		Scanner sc= new Scanner (System.in)	;
		int tom = sc.nextInt();
		System.out.println("Enter tom");
		int tom2= sc.nextInt();		System.out.println("enter tom2");
		int multi = (tom*tom);		System.out.println(multi);
	} catch (InputMismatchException e) {
		System.out.println("value should be numeric");
		
		
		
// 16. WAP to demonstrate multiple catch blocks
	System.out.println("Question no.16");
	System.out.println("Demostrate multple catch blocks");
		try {			Scanner sc1= new Scanner (System.in);
			int jerry = sc1.nextInt();			System.out.println("e");
			int jerry2= sc1.nextInt();
			int divide = (jerry/jerry2);
			System.out.println(divide);
		} catch (ArithmeticException e1) {
       System.out.println("dominator can not be zero");
		}
	       catch (InputMismatchException e1) {
			System.out.println("dominator should be numeric value");
	       }
		catch (Exception e1) {
			System.out.println("Error");
			
		}
		 }
}     	
}	
	
	
		
		
		
		
		
		
		
		
		
	
		

	


   














	
	

	
	
	
	


