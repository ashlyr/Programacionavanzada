
public class Pila {
	NodoPila Superior;
	
	public Pila(NodoPila nodoActual) {
		// TODO Auto-generated constructor stub
		
		Superior = nodoActual;
	}
	
	public void Agregar(NodoPila nodoActual)
	{
		nodoActual.siguiente=Superior;
		Superior = nodoActual;
	}
	
	public void Extraer()
	{
		
		Superior = Superior.siguiente;
	}

}
