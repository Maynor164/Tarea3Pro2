
public class Animal 
{
//Declaramos nuestras variables
String nombre;
int edad;
	
	Animal(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad =  edad;
	}
	
//Funcion para obtener el nombre de nuestro Animal
	String getNombre()
	{
		return nombre;
	}
	
//Funcion para obtener el nombre de nuestro Animal
	int getEdad()
	{
		return edad;
	}
	
//Funcion para dar el nombre de nuestro Animal
	void setNombre(String nombre)
	{
	
		this.nombre = nombre;
	}
	
//Funcion para dar el nombre de nuestro Animal
	void setEdad(int edad)
	{
		
		this.edad = edad;
	}
	
}
