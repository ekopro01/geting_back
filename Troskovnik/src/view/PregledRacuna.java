package view;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class PregledRacuna extends JPanel {
	
//	INICIJALNE VARIJABLE
	
	JTextArea textArea = new JTextArea();
	
	public PregledRacuna(){
		Border border = BorderFactory.createTitledBorder("Pregled racuna");
		setBorder(border);
		
		setLayout(new BorderLayout());
		add(textArea, BorderLayout.CENTER);
	}

}
