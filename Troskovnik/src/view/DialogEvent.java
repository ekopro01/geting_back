package view;

import java.util.EventObject;

import model.VrstaTransakcije;

public class DialogEvent extends EventObject {
	
	private String mjestoTroska;
	private String mjestoPrihoda;
	private String iznos;
	
	public DialogEvent(Object arg, String mjestoTroska, String mjestoPrihoda, String iznos){
		super(arg);
		this.mjestoTroska = mjestoTroska;
		this.mjestoPrihoda = mjestoPrihoda;
		this.iznos = iznos;
	}

	public String getMjestoTroska() {
		return mjestoTroska;
	}

	public String getMjestoPrihoda() {
		return mjestoPrihoda;
	}

	public String getIznos() {
		return iznos;
	}
}
