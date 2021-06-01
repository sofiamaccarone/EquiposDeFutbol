package equipo;

public class Arbitro extends Equipo{
	
	public Arbitro (String nombre, String apellido, String dni, String estado) {
		super (nombre, apellido, dni, estado);
	}
	
	public void sacarAmarilla() {
		System.out.println("Amonesta a jugador");
	}
	
	public void sacarRoja() {
		System.out.println("Expulsa jugador");
	}
	
	public void cobrarFault() {
		System.out.println("Fault!");
	}
	
	public void cobrarOffside() {
		System.out.println("Off Side!");
	}

}
