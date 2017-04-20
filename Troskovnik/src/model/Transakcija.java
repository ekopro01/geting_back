package model;

public class Transakcija {
	
//	INICIJALNE VARIJABLE
	private Racun mjestoPrihoda;
	private Racun mjestoTroska;
	private int iznosTransakcije;
	private VrstaTransakcije vrstaTransakcije;
	
//	KONSTRUKTOR
	public Transakcija(Racun mjestoPrihoda, Racun mjestoTroska, int iznosTransakcije, VrstaTransakcije vrstaTransakcije){
		this.mjestoPrihoda = mjestoPrihoda;
		this.mjestoTroska = mjestoTroska;
		this.iznosTransakcije = iznosTransakcije;
		this.vrstaTransakcije = vrstaTransakcije;
	}
	
//	METODE
	public void obradiTransakciju(){
		if(mjestoPrihoda == null){
			mjestoTroska.smanjiStanje(iznosTransakcije);
		} else if (mjestoTroska == null){
			mjestoPrihoda.povecajStanje(iznosTransakcije);
		} else {
			mjestoTroska.smanjiStanje(iznosTransakcije);
			mjestoPrihoda.povecajStanje(iznosTransakcije);
		}
	}
	
	
	
//	GETTERS
	public Racun getMjestoPrihoda() {
		return mjestoPrihoda;
	}

	public Racun getMjestoTroska() {
		return mjestoTroska;
	}

	public int getIznosTransakcije() {
		return iznosTransakcije;
	}

	public VrstaTransakcije getVrstaTransakcije() {
		return vrstaTransakcije;
	}
}
