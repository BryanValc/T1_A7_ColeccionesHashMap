import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Alumno{
	private String nombre;
	private byte edad;
	private String carrera;
	private int fechaInscripcion[]=new int[3];
	
	public Alumno(String nombre, byte edad, String carrera, int[] fechaInscripcion) {
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
	public int[] getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(int[] fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	
}


public class PruebaHashMap {

	public static void main(String[] args) {
		
		
		
	}

}
