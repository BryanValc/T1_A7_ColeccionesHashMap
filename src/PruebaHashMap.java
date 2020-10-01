import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Calendar;

interface Validacion{
	Scanner input = new Scanner(System.in);
	public static int validacionNatural() {
		int ret = 0;
		boolean err = false;
		do {
			try {
				ret = input.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("entrada no valida, intente de nuevo:");
				input.nextLine();
				err=true;
			}
			if (ret>0) {
				err=false;
			}else {
				System.out.println("solo números naturales");
				err=true;
			}
		}while(err);
		return ret;
	}
}

class Alumno{
	private String nombre;
	private byte edad;
	private String carrera;
	private Calendar fechaInscripcion;
	
	public Alumno(String nombre, byte edad, String carrera, Calendar fechaInscripcion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.carrera = carrera;
		this.fechaInscripcion = fechaInscripcion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Calendar getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Calendar fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

}

class ColeccionAlumnos implements Validacion{
	private Map<String, Alumno> mapAlumnos = new HashMap<String, Alumno>();

	public ColeccionAlumnos(Map<String, Alumno> mapAlumnos) {
		super();
		this.mapAlumnos = mapAlumnos;
	}

	
	public Map<String, Alumno> getMapAlumnos() {
		return mapAlumnos;
	}

	public void setMapAlumnos(Map<String, Alumno> mapAlumnos) {
		this.mapAlumnos = mapAlumnos;
	}
	
	public void llenarLista(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			System.out.println("edad:");
			
		}
	}
	public void vaciarLista() {
		Map<String, Alumno> vacio=new HashMap<String, Alumno>();
		this.setMapAlumnos(vacio);
	}
	public void mostrarPorCarrera() {
	}
	public void calcularPromedioEdades() {
	}
	public void filtroFecha(Calendar fecha) {
	}
	
}

public class PruebaHashMap{

	public static void main(String[] args) {
		
		
		
	}

}
