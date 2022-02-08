
public class EjemploSingleton {

	private static EjemploSingleton instance;
	private static String nombre;
    private EjemploSingleton(){
 
    }
    public static EjemploSingleton getInstance(){
        if(instance==null){
            instance=new EjemploSingleton();
        }
        return instance;
    }
    
    public String getNombre()
    {
    	return nombre;
    }
    public void SetNombre(String nom)
    {
    	nombre=nom;
    }

}
