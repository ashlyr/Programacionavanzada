
public class Monstruo {
	String nombre;
	String elementoPrimario;
	int edad;
	String color;
	habilidad Habilidad1;
	habilidad Habilidad2;
	habilidad Habilidad3;
	habilidad Habilidad4;
	public Monstruo(String pnombre, String pelemento, int pedad, String pcolor) 
	{
		// TODO Auto-generated constructor stub
		nombre= pnombre;
		elementoPrimario = pelemento;
		edad = pedad;
		color = pcolor;
	}
	
	public void GenerarHabilidades()
	{
		Habilidad1 = new habilidad("Agigantarse");
		Habilidad2 = new habilidad("Caminar Lento");
		Habilidad3 = new habilidad("Golpear");
		
		if(elementoPrimario.toLowerCase() == "aire")
		{
			Habilidad4 = new habilidad("Volar");
		}
		else if(elementoPrimario.toLowerCase() == "fuego")
		{
			Habilidad4 = new habilidad("Quemar");
		}
		
	}

}
