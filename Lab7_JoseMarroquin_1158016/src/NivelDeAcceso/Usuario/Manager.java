package NivelDeAcceso.Usuario;

public class Manager extends SalarieEmployee{

	@Override
	public double annualPay() {
		// TODO Auto-generated method stub
		return this.monthlyPay() * 1.2;
	}

}
