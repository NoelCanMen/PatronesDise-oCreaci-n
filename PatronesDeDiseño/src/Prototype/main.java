package Prototype;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona a1 =new Persona("Juan", 18);
		
		Persona a2= a1.clonar();
		
		
		System.out.println(a1.getNombre()+ " "+a1.getEdad());
		System.out.println(a2.getNombre()+ " "+a2.getEdad());
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		if(a1==a2){
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son diferentes");
		}
	}

}
