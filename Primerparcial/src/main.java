import java.io.Console;
import java.util.Scanner;

public class main {
	
	Pila pilaActual;
	public void INICIO() {
		// TODO Auto-generated constructor stub
		double factorialPrueba = 12* Chudnovsky(20);
		System.out.print("EL numero pi es: " + factorialPrueba);
		
		//Solo ingresa 2 Monstruos
		int  vovlerMenuM = 0;
		while(vovlerMenuM<2)
		{
			System.out.print("Ingrese Nombre del monstruo" );
			Scanner entradaEscaner = new Scanner (System.in);
			String nombre = entradaEscaner.nextLine();
			System.out.print("Ingrese Elemento del monstruo" );
			String Elemento = entradaEscaner.nextLine();
			System.out.print("Ingrese Edad del monstruo" );
			int Edad = Integer.valueOf( entradaEscaner.nextLine());
			System.out.print("Ingrese color del monstruo" );
			String color = entradaEscaner.nextLine();
			
			Monstruo mActual = new Monstruo(nombre, Elemento, Edad, color);
			mActual.GenerarHabilidades();
			
			System.out.print("Se agregara a la pila el monstruo" );
			NodoPila nodoActual = new NodoPila(mActual);
			pilaActual.Agregar(nodoActual);
			vovlerMenuM++;
		}
		
		
		
	}
	public static void main(String[] args)
	{
		main inicio = new main();
		inicio.INICIO();

	}
	public double Chudnovsky(double k)
	{
		if(k == 0)
		{
			return 0;
		}
		else
		{
			
			return (Chudnovsky(k-1) + (Math.pow(-1,k) * (factorial(6*k)*(13591409+545140134*k))/(factorial(3*k)*(Math.pow(factorial(k), 3))*Math.pow(640320, (3*k + 3/2)))));
		}
	}

	public double factorial(double x)
	{
		if(x == 0)
		{
			return x * 1;
		}
		else
		{
			return (x*factorial(x-1));
		}
	}
}
