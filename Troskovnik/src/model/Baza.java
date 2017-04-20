package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baza {

//	INICIJALNE VARIJABLE
	private static Baza instanca = new Baza();
	private ArrayList<Racun> bazaRacuna = new ArrayList<Racun>();
	private ArrayList<Transakcija> bazaTransakcija = new ArrayList<Transakcija>();
	
//	KONSTRUKOTR
	private Baza(){
		System.out.println("Baza kreirana");
	}
	
//	METODE
	public void dodajRacun(Racun racun){
		bazaRacuna.add(racun);
	}
	
	public void spremiTransakciju(Transakcija transakcija){
		bazaTransakcija.add(transakcija);
	}
	
//	GETTERS
	public static Baza getInstanca(){
		return instanca;
	}
	
	public int getStanjeRacuna(String racun){
		if (!bazaRacuna.contains(racun)){
			System.out.println(bazaRacuna.contains(racun));
			return 0;
		} 
		else return bazaRacuna.get(bazaRacuna.indexOf(racun)).getStanjeRacuna();
	}
	
	public List<Racun> getPopisRacuna(){
		return Collections.unmodifiableList(bazaRacuna);
	}
	
	
	

}
