package NivelDeAcceso.Usuario;

public class Staff extends SalarieEmployee{

	@Override
	public double annualPay() {
		// TODO Auto-generated method stub
		return this.monthlyPay() * 12;
	}

}
