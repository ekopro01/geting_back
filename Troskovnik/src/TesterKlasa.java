import model.Baza;
import model.Racun;
import model.Transakcija;
import model.VrstaRacuna;
import model.VrstaTransakcije;
import controller.Blagajnik;


public class TesterKlasa {

	
	public void run(){
		
		Blagajnik blagajnik = new Blagajnik();
		
		Racun tekuci = new Racun("Tekuæi", VrstaRacuna.TEKUCI, 100);
		Racun ziro = new Racun("Ziro", VrstaRacuna.ZIRO, 75);
		Racun devizni = new Racun("Devizni", VrstaRacuna.DEVIZNI, 30);
		
		blagajnik.spremiRacun(tekuci);
		blagajnik.spremiRacun(ziro);
		blagajnik.spremiRacun(devizni);
		
		blagajnik.zaprimiTransakciju(new Transakcija(null, tekuci, 100, VrstaTransakcije.TROSAK));
		blagajnik.zaprimiTransakciju(new Transakcija(tekuci, null, 250, VrstaTransakcije.PRIHOD));
		
		System.out.println(blagajnik.getStanjeRacuna("Tekuæi"));
		
		System.out.println(tekuci.equals("Tekuæi"));
		
	}
}
