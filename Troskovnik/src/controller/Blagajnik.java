package controller;

import java.util.List;

import model.Baza;
import model.Racun;
import model.Transakcija;

public class Blagajnik {
	
//	INICIJALNE VARIJABLE
	private static Baza baza = Baza.getInstanca();
	
//	KONSTRUKTOR
	public Blagajnik(){
		System.out.println("Blagajnik kreiran");
	}
	
//	METODE
	public void spremiRacun(Racun racun){
		baza.dodajRacun(racun);
	}
	
	public void zaprimiTransakciju(Transakcija transakcija){
		transakcija.obradiTransakciju();
		baza.spremiTransakciju(transakcija);
	}
	
	public int getStanjeRacuna(String imeRacuna){
		return baza.getStanjeRacuna(imeRacuna);
	}
	
	public static List<Racun> getPopisRacuna(){
		return baza.getPopisRacuna();
	}
}
