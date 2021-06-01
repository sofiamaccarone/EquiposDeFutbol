package equipo;

public class DirTecnico extends Equipo{
	
	private String club;
	
	public DirTecnico (String nombre, String apellido, String dni, String estado, String club) {
		super(nombre, apellido, dni, estado);
		this.setClub(club);
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	
	public void darOrdenes() {
		System.out.println("EEEEHHHHH, PATEAAAAA");
	}
	
	public void insultarArbitro() {
		System.out.println("QUE COBRAAAAS, GIL!?");
	}
	
	public void hacerCambios() {
		System.out.println("Cambia jugador");
	}

}
