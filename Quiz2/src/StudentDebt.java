import java.util.Scanner;

public class StudentDebt {
	private int tuitionTotal = 0;
	private int tuitionHold = 0;
	private double tuitionIncreases = 0.0;
	private double APR = 0.0;
	private int term = 0;
	
	public StudentDebt(){
		//empty
	}

	public int calculateTuition(int tuition, double increase){
		int total = tuition;
		for (int i=1;i<3;i++){
			total+=(total*(1+increase));
		}
		return (total);
	}
	public double calculateMonthlyIR(double apr){
		return(apr/12.0);
	}
	
	public double calculateMonthlyPayments(double monthlyInterestRate, int numberOfPeriods, int tuitionTotal){
		collectInput();
		tuitionTotal = calculateTuition(tuitionHold, tuitionIncreases);
		double monthlyPayment = (monthlyInterestRate/(1-Math.pow(1+monthlyInterestRate,-numberOfPeriods)))*tuitionTotal;
		
		System.out.printf("The total tuition due is $%d, and your monthly payment is $%.2f.",tuitionTotal,monthlyPayment);
		return(monthlyPayment);
	}
	
	public int getTuitionTotal(int tuition){
		return(tuitionHold);
	}
	
	public void collectInput(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter initial tuition cost: ");
		tuitionHold = in.nextInt();
		
		System.out.println("Enter percentage increases for tuition (as decimal): ");
		tuitionIncreases = in.nextDouble();
		
		System.out.println("Enter repayment APR (as decimal): ");
		APR = in.nextDouble();
		
		System.out.println("Enter repayment term (years): ");
		term = in.nextInt();
		
		in.close();
	}
	
	public int getmontlyterm(int term){
		return (term*12);
	}
}
