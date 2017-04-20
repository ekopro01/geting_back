package view;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class PregledPrometa extends JPanel {
	
//	INICIJALNE VARIJABLE
	JTextArea textArea = new JTextArea();

	public PregledPrometa(){
		Border border = BorderFactory.createTitledBorder("Pregled prometa");
		setBorder(border);
		
		setLayout(new BorderLayout());
		add(textArea, BorderLayout.CENTER);
	}
}
