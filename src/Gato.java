
public class Gato extends Animal
{
//Declaramos nuestra variable maullar como string porque es palabra	
String maullar;
	
	String maullar()
	{
//Retornar el valor de nuestra variable		
		return maullar;
	}
	
	Gato(String nombre, int edad) 
	{
//Mandamos a llamar las variables de la clase Animal para Gato 
//Para que el usuario ingrese Nombre y Edad del Gato
		super(nombre, edad);
	}


}
