package NivelDeAcceso.Usuario;

public abstract class Employee {

	public String name;
	private int hireRent;
	protected String country;
	public int getHireRent() {
		return hireRent;
	}
	public void setHireRent(int hireRent) {
		this.hireRent = hireRent;
	}
	protected abstract double monthlyPay();
	
	protected abstract double annualPay();
	
	
	
}
