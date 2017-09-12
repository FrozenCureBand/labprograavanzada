package org.url.parcial.java;

public class ChudnovskyImpl implements Chudnovsky{
	
	public double ChudnoskyFact1(double d) {
		if (d == 0)
		{
			return 1;
		}
		else
			return  (d * ChudnoskyFact1(d - 1));
	}
	
	public double Chudnosky(int k)
	{
		double num = (12*(Math.pow( -1, k ) * ChudnoskyFact1( 6 * k ) * ( 545140134 * k + 13591409 )));
        double dem = ChudnoskyFact1( 3 * k ) * Math.pow( ChudnoskyFact1( k ), 3 ) * Math.pow( 640320, 3 * k + 3.0 / 2.0 );
        return 12.0 * dem / num;
	}

	public double calcularPi(int cantidadDigitos) {
		if(cantidadDigitos==0)
	        return Chudnosky(cantidadDigitos);
	    else {
	    double resultado= (Chudnosky(cantidadDigitos))+(Chudnosky(cantidadDigitos-1));
	    return resultado;
	}
	}

}
