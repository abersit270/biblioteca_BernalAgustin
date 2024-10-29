package tarea1;
import java.util.Scanner;
public class SumarDos_Numeros {

	public static void main(String[]args) {
		System.out.println("Ingrese dos números para sumarlos");
		Scanner lector=new Scanner(System.in);
		
		System.out.println("Introduzca 2 valores para realizar la suma");

		double valor1=Double.parseDouble(lector.nextLine());
		double valor2=Double.parseDouble(lector.nextLine());
		double resultado= valor1+valor2;
		System.out.println("La suma de sus valores es " + resultado);
		lector.close();

		if(resultado%2==0){
			System.out.println("Su número es PAR");
		}
		else{
			System.out.println("Su número es impar");
		}
		
	}
}
