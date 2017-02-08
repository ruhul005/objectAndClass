package objectAndClass;

public class Loan {

	//declaring instance variable	
	private double annualInterestRate;
	private int numbersOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	public Loan(){
		this(2.5,1,1000);
	}
	public Loan(double annualInterestRate,int numbersOfYears,double loanAmount){
		
		this.annualInterestRate=annualInterestRate;
		this.numbersOfYears=numbersOfYears;
		this.loanAmount=loanAmount;
		loanDate= new java.util.Date();
	}
	public double getAnnualInterestRate(){
			return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public int getNumbersOfYears(){
		return numbersOfYears;
}
	public void setNumbersOfYears(int numbersOfYears){
		this.numbersOfYears=numbersOfYears;
}
	public double getLoanAmount(){
		return loanAmount;
}
	public void setLoanAmount(double loanAmount){
	this.loanAmount=loanAmount;
}
	public double getMonthlyPayment(){
		double monthlyInterestRate=annualInterestRate/1200.0;
		double monthlyPayment=loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate, numbersOfYears*12)));
		return monthlyPayment;
	}
	public double getTotalPayment(){
		double totalPayment=getMonthlyPayment()*numbersOfYears*12;
		return totalPayment;	
	}
	public java.util.Date getLoanDate(){
		return loanDate;
	}

}
