
public class Colegio {

	private String nombre;
	private int numeroAlumnos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(int numeroAlumnos) {
		this.numeroAlumnos = numeroAlumnos;
	}

	@Override
	public String toString() {
		return "Colegio [nombre=" + nombre + ", numeroAlumnos=" + numeroAlumnos + "]";
	}

}
