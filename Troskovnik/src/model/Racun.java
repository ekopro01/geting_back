package model;

public class Racun {

	// INICIJALNE VARIJABLE

	private int stanjeRacuna;
	private VrstaRacuna vrstaRacuna;
	private String imeRacuna;

	// KONSTRUKTOR

	public Racun(String imeRacuna, VrstaRacuna vrstaRacuna, int stanjeRacuna) {
		this.imeRacuna = imeRacuna;
		this.vrstaRacuna = vrstaRacuna;
		this.stanjeRacuna = stanjeRacuna;
		System.out.println("Kreiran je raèun: " + imeRacuna + "\n" + 
							"Vrsta raèuna je: " + vrstaRacuna + "\n" + 
							"Stanje raèuna je: " + stanjeRacuna);
	}

	// METODE
	@Override
	public String toString() {
		return imeRacuna;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((imeRacuna == null) ? 0 : imeRacuna.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		String other = (String) obj;
		if (imeRacuna == null) {
			if (other != null)
				return false;
		} else if (!imeRacuna.equals(other))
			return false;
		return true;
	}

	public void povecajStanje(int iznos){
		stanjeRacuna+=iznos;
		System.out.println("Transakcija je provedena" + "\n" + 
							"Stanje raèuna " + imeRacuna + " je: " + stanjeRacuna);
	}
	
	public void smanjiStanje(int iznos){
		if (iznos <= stanjeRacuna){
			stanjeRacuna-=iznos;
			System.out.println("Transakcija je provedena" + "\n" + 
					"Stanje raèuna " + imeRacuna + " je: " + stanjeRacuna);
		} else {
			System.out.println("Nedovoljno stanje na raèunu");
		}
	}
	
	// GETTERS

	public int getStanjeRacuna() {
		return stanjeRacuna;
	}

	public VrstaRacuna getVrstaRacuna() {
		return vrstaRacuna;
	}

	public String getImeRacuna() {
		return imeRacuna;
	}
}
