package employeeSalary;

public class SalaryMain extends CalculateSalary{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalaryMain ob=new SalaryMain();
		ob.setBasicPay(10000);
		ob.setBonus(2000);
		ob.setDed(1000);
		System.out.println("Basic Pay = "+ob.getBasicPay());
		System.out.println("Deductions = "+ob.getDed());
		System.out.println("Bonus = "+ob.getBonus());
		System.out.println("HRA = "+ob.calculateHra());
		System.out.println("PF = "+ob.calculatePf());
		System.out.println("Total Salary = "+ (ob.bp+ob.bonus+ob.hra-ob.ded-ob.pf));
	}

}
