package poo1semana3;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numDia = 0; // valor que ingresa el usuario mediante el teclado.

		System.out.println("Ingrese un numero de la semana (1-7) :_");

		numDia = scanner.nextint();

		switch (numDia) {

		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Lunes");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");

		default:
			System.out.println("Domingo");
			break;

		}
		scanner.close();

	}

}
