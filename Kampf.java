package vorlage;


import java.util.Arrays;
import java.util.Random;

public class Kampf {
	Einheit[] alleEinheiten = {new Mensch(), new Goblin(), new Elf(), new Drache()};

	private Einheit[] einheiten;

	public static void main(String[] args){
		Kampf kampf = new Kampf(15);
		System.out.println("Kampfaufstellung: ");
		System.out.println(kampf);
		System.out.println("\nDer Kampf beginnt!");
		if(kampf.allesSchafe())
			System.out.println("Ausnahmsweise gewinnen die Schafe mangels anderer Interessenten!\n\n");
		else {
			Einheit gewinner = kampf.kaempfen();
			System.out.println(gewinner + " beendet das Gefecht mit einem letzten beherzten Schlag!\n\n");
			System.out.println("Verbleibende Kaempfer: ");
			System.out.println(kampf);
		}
	}

	private void sortiere(Einheit[] einheitArray){
		Arrays.sort(einheitArray);
	}
	public Kampf(int laenge){
		//ToDo
		einheiten = new Einheit[laenge];
		Random random = new Random();
		for (int i = 0; i < laenge; i++) {
			einheiten[i] = alleEinheiten[random.nextInt(alleEinheiten.length)];
		}
		Arrays.sort(einheiten);
	}
	
	public Kampf(Einheit[] einheiten) {
		//ToDo
	}
	
	private boolean allesSchafe() {
		//ToDo
		return false;
	}
	
	public String toString() {
		//ToDo
		return null;
	}
	
	
	private Einheit findeNaechstesZiel(int angreiferPosition) {
		//ToDo
		return null;
	}
	
	public Einheit kaempfen(){
		//ToDo
		return null;
	}
		
}