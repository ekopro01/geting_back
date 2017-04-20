package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import model.VrstaTransakcije;

public class MainFrame extends JFrame implements  ToolbarListener, DialogListener {
	
//	INICIJALNE VARIJABLE
	
	private Toolbar toolbar = new Toolbar();
	private PregledRacuna pregledRacuna = new PregledRacuna();
	private PregledMjeseca pregledMjeseca = new PregledMjeseca();
	private PregledPrometa pregledPrometa = new PregledPrometa();
	private TransakcijaDialog transakcijaDialog;
	
	
//	KONSTRUKTOR
	public MainFrame(){
		super("Troškovnik");
		setSize(1920, 1080);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		add(toolbar, BorderLayout.NORTH);
		add(pregledRacuna, BorderLayout.WEST);
		add(pregledMjeseca, BorderLayout.CENTER);
		add(pregledPrometa, BorderLayout.EAST);
		toolbar.setToolbarListener(this);
		
	}
	
	

	@Override
	public void toolbarEventOccurred(ToolbarEvent event) {
			System.out.println("Gumb stisnut");
			transakcijaDialog = new TransakcijaDialog(this, event.getVrstaTransakcije());
			transakcijaDialog.setDialogListener(this);
	}



	@Override
	public void dialogEventOccured(DialogEvent dialogEvent) {
		// TODO Auto-generated method stub
		
	}
		
}
	
	
	
	

