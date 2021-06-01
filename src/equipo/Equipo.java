package equipo;

public class Equipo {
	
	private String nombre;
	private String apellido;
	private String dni;
	private String estado;
	
	public Equipo (String nombre, String apellido, String dni, String estado) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setEstado(estado);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void caminar() {
		setEstado("caminando");
	}
	
	public void correr() {
		setEstado("corriendo");
	}
	
	public void frenar() {
		setEstado("parado");
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
