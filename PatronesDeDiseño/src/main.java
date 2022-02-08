
public class main {

	public static void main(String[] args) {
		
		EjemploSingleton e1=EjemploSingleton.getInstance();
		EjemploSingleton e2=EjemploSingleton.getInstance();
		
		e1.SetNombre("Juan");
		e2.SetNombre("Pepe");
		
		System.out.println(e1 + e1.getNombre());
		System.out.println(e2+ e2.getNombre());
	}

}
