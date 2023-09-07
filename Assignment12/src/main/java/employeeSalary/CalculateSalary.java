package employeeSalary;

public class CalculateSalary extends Salary
{
double hra,pf;
public double calculateHra() {
	
	hra=.05*(super.bp);
	return hra;
	
}
public double calculatePf() {
	pf=.2*(super.bp);
	return pf;
	
}
}
