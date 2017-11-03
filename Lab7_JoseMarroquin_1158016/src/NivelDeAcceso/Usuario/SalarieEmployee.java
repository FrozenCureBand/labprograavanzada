package NivelDeAcceso.Usuario;

public abstract class SalarieEmployee extends Employee{
	
	int annualSalarie;
	public SalarieEmployee() {
		name = "Jose";
		setHireRent(1999);
		country = "Guatemala";
	}
	@Override
	protected double monthlyPay() {
		// TODO Auto-generated method stub
		return 10000.0;
	}
	@Override
	public abstract double annualPay();
	}

}
