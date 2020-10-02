import java.util.ArrayList;
import java.util.Arrays;
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
	public static byte validacionNaturalb() {
		return (byte)validacionNatural();
	}
	public static String validacionCarrera() {
		boolean err=false;
		String carrera;
		int i=0;
		do {
			if(i==0) {
				System.out.println("carrera:");
			}
			i++;
			carrera = input.nextLine().toLowerCase();
			if(carrera.contains("isc")||carrera.contains("iia")||carrera.contains("im")||carrera.contains("la")||carrera.contains("cp")){
				err=false;
				
			}else {
				if(i!=1) {
					System.out.println("no existe la carrera especificada, ingrese la carrera de nuevo");
				}
				err=true;
			}
		}while (err);
		return carrera;
	}
	public static Calendar validacionFecha() {
		int fch[]=new int[3];
		boolean err=false;
		do {
			err=false;
			System.out.println("fecha(dia/mes/año):");
			String entry = input.nextLine();
			try {
				fch[0]=Integer.parseInt(entry.substring(0,2));
				fch[1]=Integer.parseInt(entry.substring(3,5))-1;
				fch[2]=Integer.parseInt(entry.substring(6,10));
			} catch (Exception e) {
				System.out.println("entrada no valida, intente de nuevo");
				err=true;
			}
		}while(err);
		Calendar fecha = Calendar.getInstance();
		fecha.set(fch[2], fch[1], fch[0]);
		return fecha;
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

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", fechaInscripcion="
				+ fechaInscripcion.get(Calendar.DATE)+"/"+(fechaInscripcion.get(Calendar.MONTH)+1)+"/"+fechaInscripcion.get(Calendar.YEAR)+ "]";
	}

	
}

class ColeccionAlumnos implements Validacion{
	Scanner input = new Scanner(System.in);
	private Map<Integer, Alumno> mapAlumnos = new HashMap<Integer, Alumno>();

	public ColeccionAlumnos(Map<Integer, Alumno> mapAlumnos) {
		super();
		this.mapAlumnos = mapAlumnos;
	}
	public ColeccionAlumnos() {
	}



	public Map<Integer, Alumno> getMapAlumnos() {
		return mapAlumnos;
	}

	public void setMapAlumnos(Map<Integer, Alumno> mapAlumnos) {
		this.mapAlumnos = mapAlumnos;
	}
	
	public void llenarLista(int cantidad) {
		Map<Integer, Alumno> mapAlumnos = new HashMap<Integer, Alumno>();
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Alumno "+(i+1));
			System.out.println("nombre:");
			String nombre = input.nextLine();
			System.out.println("edad:");
			byte edad;
			edad = Validacion.validacionNaturalb();
			String carrera = Validacion.validacionCarrera();
			Calendar fechaInscripcion = Validacion.validacionFecha();
			Alumno a = new Alumno(nombre, edad, carrera, fechaInscripcion);
			System.out.println(a);
			mapAlumnos.put(i,a);
		}
		
		this.setMapAlumnos(mapAlumnos);
		
	}
	public void vaciarLista() {
		Map<Integer, Alumno> vacio=new HashMap<Integer, Alumno>();
		this.setMapAlumnos(vacio);
	}
	public void mostrarPorCarrera(String carrera) {
		System.out.println("filtro por carrera: "+carrera);
		Map<Integer, Alumno> mapAlumnos = this.getMapAlumnos();
		for(int i=0;i<mapAlumnos.size();i++) {
			Alumno at = mapAlumnos.get(i);
			if (at.getCarrera().contains(carrera)) {
				System.out.println(at);
			}
		}
	}
	public double calcularPromedioEdades() {
		Map<Integer, Alumno> mapAlumnos = this.getMapAlumnos();
		double promedio=0;
		for(int i=0;i<mapAlumnos.size();i++) {
			Alumno at = mapAlumnos.get(i);
			promedio = promedio +at.getEdad();
		}
		promedio = promedio/mapAlumnos.size();
		return promedio;
	}
	public void filtroFecha(Calendar fecha) {
	}
	
}

public class PruebaHashMap{

	public static void main(String[] args) {
		
		//String carrera = Validacion.validacionCarrera();
		//System.out.println(carrera);
		//Calendar fechaActual = Validacion.validacionFecha();
		//System.out.println(fechaActual.getTime());
		//ColeccionAlumnos ca = new ColeccionAlumnos();
		//ca.llenarLista(2);
		//ca.mostrarPorCarrera("isc");
		//System.out.println("promedio: "+ca.calcularPromedioEdades());
		
		int val = Validacion.validacionFecha().compareTo(Validacion.validacionFecha());
		System.out.println(val);
	}

}
