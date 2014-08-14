
public class Loro extends Animal
{
//Declaramos nuestra variable hablar como string porque es palabra	
String hablar;
	
	String hablar()
	{
//Retornar el valor de nuestra variable	
		return hablar;
	}
	
	Loro(String nombre, int edad) 
	{
//Mandamos a llamar las variables de la clase Animal para Loro
//Para que el usuario ingrese Nombre y Edad del Loro	
		super(nombre, edad);
	}
	
}
