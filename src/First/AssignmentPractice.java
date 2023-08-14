package First;

import java.util.*;

public class AssignmentPractice {
public static void main(String[] args) {
	//1. Take three numbers from the user and print the sum of total+
	Scanner sc=new Scanner(System.in);
	System.out.println("Question no.1");
	System.out.println("Enter the first number");
	int x=sc.nextInt();
	System.out.println("Enter the second number");
	int y=sc.nextInt();
	System.out.println("Enter the third number");
	int z=sc.nextInt();
	int l=x+y+z;
	System.out.println("Addition"+l);

	
	//2.W.A.J.P to Take three numbers from the user and print the greatest number//
	System.out.println("Question no.2");
	int j,k,m;
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the first greatest number");
	 j=sc.nextInt();
	System.out.println("Enter second greatest number");
	 k=sc.nextInt();
	System.out.println("Enter third greatest number");
	 l=sc.nextInt();
	if(j>k && j>l)
	System.out.println("Max number"+j);
	else if (k>l && k>j)
	System.out.println("Max number"+k);
	if (l>j && l>k)
	System.out.println("Max number"+l);
		




	//3.W.A.J.P in Java to display the first 10 natural numbers using while loop.
	System.out.println("Question no.3");
		System.out.println("Print 10 natural number"); 
		int S;
		S=1;
		while(S<=10) {
		System.out.println(S);
		S++;	
	}

	//4.W.A.J.P to find factorial for Given Number		
	System.out.println("Question no.4");	
	System.out.println("factorial number");
	Scanner Sc1=new Scanner(System.in);
	int n;
	int f1=1;
	n=sc.nextInt();
	for (int i=1;i<=n;i++) {
		f1=f1*i;
		System.out.println(f1);
	}

	// 5.W.A.J.P to check given number is Prime or not?
	System.out.println("Question no.5");
	System.out.println("Prime number or not");
	 int p, count=0;
	Scanner sc2=new Scanner (System.in);
	 p=sc2.nextInt();
	for (int i=1;i<=p;i++) {
		if (p%i==0) {
			count++;
	}
	}
	if (count==2) {
		System.out.println(" Prime Number ");
	}
	else
	System.out.println("Not Prime Number");


	// 6.W.A.J.P to check given number is Armstrong or not?
		System.out.println("Question no.6");
		int A, arms=0,remin,c;
	System.out.println("Number is Armstrong or not " );
	System.out.println("Use onlt 3 Digits");
	Scanner sc3 = new Scanner (System.in);
	A = sc3.nextInt();
	c=A;
	 while (A>0) {
		 remin=A%10;
		 arms= (remin*remin*remin)+arms;
		 A=A/10;
	 }
	  
		  if (c==arms) {
			  System.out.println("It is Armstrong Number"); }
			  else  
				  System.out.println("It is not Armstrong number");
		 while (arms<=99)
			 System.out.println("");
		  if (arms<=999) {
			  System.out.println("Valid");}
			  else
				  System.out.println("Invalid");
		
		
	// 7. W.A.J.P for create Fibonacci Series.
		System.out.println("Question no.7");
		System.out.println("Print Fibonacci Series");
		Scanner sc5= new Scanner (System.in);
		int x1=1;
		int y1=0;
		int n2;
		int sum2=1;
		n2=sc5.nextInt();
		while (sum2<=n2) {
			System.out.println(sum2);
			x1=y1;
			y1=sum2;
			sum2=x1+y1;
		}
		
		
//		8. W.A.J.P to Print pattern Given Below
//	     
//	    Pattern :1    	         
//		   1
//		   12
//		   123
//		   1234
//		   12345	
		
		System.out.println("Question no.8");
		System.out.println("Print Pattern no. 1");
		int l1 = 5;
		for (int i3=1;i3<=l1;i3++) {
			for (int j1=1;j1<=i3;j1++) {
				System.out.print(j1+ " ");
			}
			System.out.println();
		}
		
//	       Pattern: 2	
	//
//		    1
//		    01
//		    101
//		    0101
//		    10101
		
		System.out.println("Print Pattern no.2");
		
		for(int r1=1;r1<=5;r1++) {
			for(int c1=1;c1<=r1;c1++) {
				if((r1+c1)%2 == 0) {
					System.out.print("1");
				}
					else {
		          System.out.print("0");
		}
			} 
			System.out.println();	
		  }

	//
//	     Pattern :3	
	//	
//	       1
//	      2 2
//	     3 3 3
//	    4 4 4 4
		  	
		System.out.println("Print Pattern no.3");
		
		int n3=4;
		for (int i4=1;i4<=n3;i4++) {    
			for (int k2=1;k2<=n3-i4;k2++) {    // for space 
				System.out.print(" ");
			}
			for (int k2=1;k2<=i4;k2++) {
			System.out.print(i4+ " ");
		}
		System.out.println();
		}  
		
		
//	     Pattern :4 
		
//		       *
//		     * * *
//		   * * * * *
//		     * * *
//		       *
		System.out.println("Print Pattern no.4");
		int s5 = 3;
	    // upper half
	    for (int i7 = 1; i7 <= s5; i7++) {      
	      for (int e = s5; e > i7; e--) {
	        System.out.print(" ");
	      }
	      for (int o1 = 0;o1<i7 * 2-1; o1++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    // lower half
	     for (int i7=1; i7 <= s5-1; i7++) {
	       for (int e = 0; e<i7; e++) {
	        System.out.print(" ");
	      }
	      for (int o1 =(s5-i7)*2-1; o1>0; o1--) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	  }
	
			

		
//		9. WAP to compute the sum of the first 100 prime numbers.
   
	int counter1;
	int sum1=0;{
		System.out.println("Question no.9");
		System.out.println("Print sum first 100 prime number");
		
	for (int num6=1; num6<=100; num6++) 
	{
		counter1=0;
		for(int v5=2; v5<= num6/2; v5++) 
		{
			if(num6 % v5 ==0) 
			{	
				counter1++;
				break;
			}
		}
			if(counter1 ==0 && num6!=1) 
			{	
				sum1 = sum1 + num6;
			}
		}
	      System.out.println("the sum of prime number: " + sum1);
	      
//  9.    WAP to sum values of an array.
	      
	     int arr[] = {1,2,3,4,5,6,7,8,9};
	     int sum4 = 0;
	     for (int t1 : arr)
	    	 sum4 +=t1;
	     System.out.println(sum4);
	          
	}
	
	}	
	
	
		
	
