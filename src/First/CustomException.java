package First;
	import java.util.Scanner;
// 27.W.A.J.P. to create a custom exception if Customer withdraw amount
//	which is greater than account balance then program will show custom
//	exception otherwise amount will deduct from account balance.
//	Account balance is:2000 Enter withdraw
//	amount:2500
//	Sorry, insufficient balance, you need more 500 Rs.To perform
//	this transaction
	
	
	
	class InsufficientException extends Exception{
		double balance;
		double withdrawbal;
	public InsufficientException(String msg) {
		super(msg);
		}
	void withdraw() {
			double balance = 2000.00;
			System.out.println("Current Balance: "+balance);
			try {
			System.out.print("Enter withdraw amount: ");
			Scanner in = new Scanner(System.in);
			double withdrawlamt = in.nextDouble();
			if(withdrawlamt>balance) {
				double lessamt = withdrawlamt-balance;
				throw new InsufficientException("Sorry, insufficient balance, you need more "+ lessamt);
			}
	else {
		System.out.println("Transaction successfully completed");

			}

			double remainingbal = balance-withdrawlamt;
			System.out.println("Your withdrawal Amount is : "+withdrawlamt);
			System.out.println("After transaction your current balance is : "+remainingbal);

		//double lessamt =withdrawlamt-balance;
     //System.out.println("you need more amount "+lessamt);

		}
		catch(InsufficientException e){
			 System.out.println(e.getMessage());

		 }

		}

		}

	public class CustomException {
		private static String lessamt;
	public static void main(String args[])  {
		InsufficientException ie=new InsufficientException("Sorry, insufficient balance, you need more"+ lessamt);
	 ie.withdraw();

	}

	}

