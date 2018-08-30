import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Lista Estudiante");
	
		//crear la lista
		
		List listaEstudiante = new ArrayList();
	
		Estudiantes Est1= new Estudiantes("Osvaldo","100neta");
		Estudiantes Est2= new Estudiantes("Jesus","101neta");
		Estudiantes Est3= new Estudiantes("Alberto","102neta");
	
		//lista estudiante
		
		listaEstudiante.add(Est1);
		listaEstudiante.add(Est2);
		listaEstudiante.add(Est3);
		
	for (Object o : listaEstudiante) {
		Estudiantes c = (Estudiantes) o;
		System.out.println("Información" + c);
	}
	System.out.println("\n");
	System.out.println("Ordenamiento Set");

	//Set
	
	Set EstudiantesSet = new HashSet();
	EstudiantesSet.add(Est1);
	EstudiantesSet.add(Est2);
	EstudiantesSet.add(Est3);
	
	for (Object o : EstudiantesSet) {
		Estudiantes c = (Estudiantes) o;
		System.out.println("Información SET \t" + c);
	}
	
	// mapa
	
	
	}
	
}
