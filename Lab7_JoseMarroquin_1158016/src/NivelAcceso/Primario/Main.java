package NivelAcceso.Primario;
//import java.util.Scanner;

import NivelDeAcceso.Usuario.Employee;
import NivelDeAcceso.Usuario.SalarieEmployee;

public class Main{

    public static void main(String[] args) {

    Employee objemployee = new Employee();  
    SalarieEmployee smp = new SalarieEmployee();
    	objemployee.name = "Jose";
    	objemployee.setHireRent(1999);
    	smp.setHireRent(1999);
    }
}