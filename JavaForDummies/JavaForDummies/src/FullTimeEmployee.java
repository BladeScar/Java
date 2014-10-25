
public class FullTimeEmployee extends Employee {
	private double weeklySalary;
	private double benefitDeduction;
	
	public void setWeeklySalary(double weeklySalaryIn) {
		weeklySalary = weeklySalaryIn;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setBenefitDeduction( double benefitDeductionIn) {
		benefitDeduction = benefitDeductionIn;
	}
	
	public double getBenefitDeduction() {
		return benefitDeduction;
	}
	
	public double findPaymentAmount() {
		return weeklySalary - benefitDeduction;
	}
}
