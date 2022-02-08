package Builder;

import Builder.Persona;

public class main {

	public static void main(String[] args) {
		

		Persona persona1 = Persona.builder().nombre("juan").edad(15).build();
		
		
		//Persona a2 =new Persona("Juan", 18);
		
		//System.out.println(persona1);

		}

}
