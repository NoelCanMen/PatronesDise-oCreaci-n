package Prototype;


public class Persona{
	
	private String nombre;
    private int edad;
 
    public Persona(String nom, int edad) {
    	
        nombre=nom;
        this.edad=edad;
    }
 
    public String getNombre() {
    	
        return nombre;
    }
 
    public int getEdad() {
    	
        return edad;
    }
    
    public void setNombre(String nombreCliente) {
    	
        nombre=nombreCliente;
    }
 
    public void setEdad(int edad) {
    	
        this.edad=edad;
    }
    
    public Persona clonar()
    {
    	return new Persona(this.nombre, this.edad);
    }
    
}
