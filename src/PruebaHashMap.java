import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Calendar;

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

class ColeccionAlumnos{
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
	
	public void llenarLista() {
	}
	public void vaciarLista() {
	}
	public void mostrarPorCarrera() {
	}
	public void calcularPromedioEdades() {
	}
	public void filtroFecha(Calendar fecha) {
	}
	
}

public class PruebaHashMap {

	public static void main(String[] args) {
		
		
		
	}

}
