import java.util.Scanner;
public class Calculadora {
	
	public static void main (String[] args){
		int opcion, opA, opB, res;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("\nIntroduce el codigo de operacion: \n"
								+ "1 para suma \n" 
								+ "2 para resta \n"
								+ "3 para multiplicacion \n"
								+ "4 para division \n"
								+ "0 para salir del programa");
			opcion = sc.nextInt();
			
			if (opcion != 0){
				switch (opcion){
				case 1: System.out.println("Introduce el primer sumando");
						opA = sc.nextInt();
						System.out.println("Introduce el segundo sumando");
						opB = sc.nextInt();
						System.out.println(opA + " + " + opB + " = " + Calculos.sumar(opA, opB));
						break;
				case 2: System.out.println("Introduce el minuendo");
						opA = sc.nextInt();
						System.out.println("Introduce el sustrayendo");
						opB = sc.nextInt();
						System.out.println(opA + " - " + opB + " = " + Calculos.restar(opA, opB));
						break;
				case 3: System.out.println("Introduce el primer multiplicando");
						opA = sc.nextInt();
						System.out.println("Introduce el segundo multiplicando");
						opB = sc.nextInt();
						System.out.println(opA + " * " + opB + " = " + Calculos.multiplicar(opA, opB));
						break;
				case 4: System.out.println("Introduce el dividendo");
						opA = sc.nextInt();
						System.out.println("Introduce el divisor");
						opB = sc.nextInt();
						System.out.println(opA + " / " + opB + " = " + Calculos.division(opA, opB));
						break;
				default: System.out.println("Codigo de operacion incorrecto");
				}
			}
			
			
		}while (opcion != 0);
	}
}
