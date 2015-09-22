import static org.junit.Assert.*;

import org.junit.Test;

public class StudentDebtTest {

	@Test
	public void testGetmontlyterm() {
		//i decided to call the function statically to calculate the monthly payments
		StudentDebt debt = new StudentDebt();
		
		//here's a test of my monthly term method
		assertEquals(debt.getmontlyterm(12),144);
		assertEquals(debt.calculateTuition(13500, 0.05),56733);
		assertEquals(debt.calculateMonthlyPayments(0.04, 20, 12520),3833.68);
	}

}
