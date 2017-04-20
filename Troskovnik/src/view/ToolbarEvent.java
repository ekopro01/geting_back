package view;

import java.util.EventObject;

import model.VrstaTransakcije;

public class ToolbarEvent extends EventObject {

	private VrstaTransakcije vrstaTransakcije;
	
	public ToolbarEvent(Object arg0, VrstaTransakcije vrstaTransakcije) {
		super(arg0);
		this.vrstaTransakcije = vrstaTransakcije;
	}
	
	public VrstaTransakcije getVrstaTransakcije(){
		return vrstaTransakcije;
	}

}
