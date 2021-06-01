package equipo;

public class CuerpoTecnico extends Equipo{
	
	private String club;
	
	public CuerpoTecnico (String nombre, String apellido, String dni, String estado, String club) {
		super(nombre, apellido, dni, estado);
		this.setClub(club);
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	
	public void traerAgua(){
		System.out.println("Alcanza agua a jugador");
	}
	
	public void masajear() {
		System.out.println("Masajea a jugador");
	}
	
	

}
