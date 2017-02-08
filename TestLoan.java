package objectAndClass;
import java.util.Scanner;

public class TestLoan {
	public static void main (String[]args){
		Scanner input= new Scanner (System.in);
		System.out.print("Annual Interest RAte:");
		double annualInterestRate= input.nextDouble();
		System.out.println("Enter Years:");
		int numbersOfYears= input.nextInt();
		System.out.println("Enter Loan Amount");
		double loanAmount= input.nextDouble(); 
		
		Loan loan = new Loan(annualInterestRate, numbersOfYears, loanAmount);
		//System.out.printf("The loan was created on %s\n"
		//+"The monthly payment is %.2f\n The total payment is %.2f\n",loan.getLoanDate().toString(),loan.getMonthlyPayment(),loan.getTotalPayment());
		
		System.out.printf("monthly payment is=%.2f",loan.getMonthlyPayment());
		
		input.close();
		
		
		
	}
}
