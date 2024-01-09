package Proyecto;

import java.util.Scanner;

public class AreaTriangulo {
static Scanner in=new Scanner(System.in);
static double l1=0;
static double l2=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcularArea();
	}
	public static void calcularArea() {
		System.out.println("Introduce base del triangulo");
		l1=in.nextInt();
		System.out.println("Introduce altura del triangulo");
		l2=in.nextDouble();
		System.out.println("El area del triangulo es "+ l1 + " x "+ l2 + " = "+ ((l1*l2)/2));
	}

}
