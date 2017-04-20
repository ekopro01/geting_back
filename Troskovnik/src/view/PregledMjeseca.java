package view;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class PregledMjeseca extends JPanel {
	
//	INICIJALNE VARIJABLE
	
	JTextArea textArea = new JTextArea();

	public PregledMjeseca(){
		Border border = BorderFactory.createTitledBorder("Pregled mjeseca");
		setBorder(border);
		
		setLayout(new BorderLayout());
		add(textArea, BorderLayout.CENTER);
	}
}
