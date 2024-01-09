package Proyecto;

import java.util.Scanner;
//Alumno1
public class AreaTriangulo {
static Scanner in=new Scanner(System.in);
static double l1=0;
static double l2=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcularArea_triangulo();
		calcularPerimetro_y_area_circunferencia();
	}
	
	
	public static void calcularArea_triangulo() {
		System.out.println("Introduce base del triangulo");
		l1=in.nextInt();
		System.out.println("Introduce altura del triangulo");
		l2=in.nextDouble();
		System.out.println("El area del triangulo es "+ l1 + " x "+ l2 + " = "+ ((l1*l2)/2));
	}
	//Alumno2
	
	public static void calcularPerimetro_y_area_circunferencia() {
		 double pi=Math.PI;
		 System.out.println("introduce el diametro de la circunferencia");
		 l1=in.nextDouble();
		 System.out.println("El perimetro de la circunferencia es: "+(l1*pi));
		 System.out.println("El area de la circunferencia es: "+((l1*l1)*pi));

	}

}
