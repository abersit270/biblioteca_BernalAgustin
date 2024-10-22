package tarea1;
import java.util.Scanner;
public class SumarDos_Numeros {

	public static void main(String[]args) {
		System.out.println("Ingrese dos números para sumarlos");
		Scanner lector=new Scanner(System.in);
		double valor1=Double.parseDouble(lector.nextLine());
		double valor2=Double.parseDouble(lector.nextLine());
		
		System.out.println("La suma de sus valores es" +valor1+valor2);
		lector.close();
	}
}
