package equipo;

public class Jugador extends Equipo{
	
	private String club;
	private String dorsal;
	private String posicion;
	
	public Jugador (String nombre, String apellido, String dni, String estado, String club, String dorsal, String posicion) {
		super(nombre, apellido, dni, estado);
		this.setClub(club);
		this.setDorsal(dorsal);
		this.setPosicion(posicion);
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getDorsal() {
		return dorsal;
	}

	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public void patear() {
		System.out.println("Pateó la pelota");
	}
	
}
