package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.VrstaTransakcije;

public class Toolbar extends JPanel {

	// INICIJALNE VARIJABLE
	JButton prihodButton = new JButton("Prihod");
	JButton trosakButton = new JButton("Trošak");
	JButton transferButton = new JButton("Transfer");
	ToolbarListener toolbarListener;

	// KONSTRUKTOR

	public Toolbar() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(prihodButton);
		add(trosakButton);
		add(transferButton);

		prihodButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (toolbarListener != null) {
					ToolbarEvent event = new ToolbarEvent(this,
							VrstaTransakcije.PRIHOD);
					toolbarListener.toolbarEventOccurred(event);
				}
			}
		});

		trosakButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (toolbarListener != null) {
					ToolbarEvent event = new ToolbarEvent(this,
							VrstaTransakcije.TROSAK);
					toolbarListener.toolbarEventOccurred(event);
				}
			}
		});

		transferButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (toolbarListener != null) {
					ToolbarEvent event = new ToolbarEvent(this,
							VrstaTransakcije.TRANSFER);
					toolbarListener.toolbarEventOccurred(event);
				}
			}
		});

	}

	// GETTERS I SETTERS

	public void setToolbarListener(ToolbarListener listener) {
		toolbarListener = listener;
	}

}
