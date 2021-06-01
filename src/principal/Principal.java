package principal;

import equipo.Arbitro;
import equipo.Jugador;

public class Principal {
	
	public static void main (String [] args) {
		
		Jugador jugador1 = new Jugador ("Kun", "Aguero", "33878595", "parado", "Barcelona", "9", "delantero");
		System.out.println(jugador1.getApellido());
		jugador1.correr();
		System.out.println("ahora está ");
		System.out.println(jugador1.getEstado());
		
		Arbitro arbitro1 = new Arbitro ("Juan", "Perez", "30987262", "caminando");
		System.out.println(arbitro1.getNombre());
		System.out.println(arbitro1.getApellido());
		arbitro1.sacarAmarilla();
		System.out.println(jugador1.getApellido());
				
	}

}
