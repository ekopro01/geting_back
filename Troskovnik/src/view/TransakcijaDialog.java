package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.VrstaTransakcije;
import controller.Blagajnik;

public class TransakcijaDialog extends JDialog {
	
	private JPanel unosPrihodaPanel = new JPanel();
	private JPanel unosTroskaPanel = new JPanel();
	private JPanel unosTransferaPanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	private JButton okButton;
	private JButton cancelButton;
	private GotoviComboBox prihodRacunComboBox;
	private GotoviComboBox trosakRacunComboBox;
	private JTextField iznos;
	private VrstaTransakcije vrstaTransakcije;
	private DialogListener dialogListener;
	
	public TransakcijaDialog(JFrame parent, VrstaTransakcije vrstaTransakcije){
		super(parent, "Unesi transakciju", true);
		this.vrstaTransakcije = vrstaTransakcije;
		
		setSize(400, 200);
		setLayout(new BorderLayout());
		
		okButton = new JButton("OK");
		cancelButton = new JButton("Cancel");
		prihodRacunComboBox = new GotoviComboBox(Blagajnik.getPopisRacuna());
		trosakRacunComboBox = new GotoviComboBox(Blagajnik.getPopisRacuna());
		iznos = new JTextField(10);
		
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);
		add(buttonPanel, BorderLayout.SOUTH);

		if (vrstaTransakcije.equals(VrstaTransakcije.PRIHOD)){
			add(unosPrihodaPanel, BorderLayout.CENTER);
			createPrihodLayout();
		} else if (vrstaTransakcije.equals(VrstaTransakcije.TROSAK)){
			add(unosTroskaPanel, BorderLayout.CENTER);
			createTrosakLayout();
		} else if(vrstaTransakcije.equals(VrstaTransakcije.TRANSFER)){
			add(unosTransferaPanel, BorderLayout.CENTER);
			createTransferLayout();
		}
		
		setVisible(true);
		
		okButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("OK na dialogu stisnut");
				if(dialogListener != null){
					String prihod = (String) prihodRacunComboBox.getSelectedItem();
					String trosak = (String) trosakRacunComboBox.getSelectedItem();
					String iznosTransakcije = iznos.getText();
					
					DialogEvent dialogEvent = new DialogEvent(this, prihod, trosak, iznos.getText());
					System.out.println(prihod + trosak + iznosTransakcije);
				}
			}	
		});
		
		cancelButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		
	}
	
	public void setDialogListener(DialogListener dialogListener){
		this.dialogListener = dialogListener;
	}
	
	
	private void createPrihodLayout(){

		GridBagConstraints gc = new GridBagConstraints();
		
		unosPrihodaPanel.setLayout(new GridBagLayout());
		
//		POÈETNO POSTAVLJANJE 
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(2, 5, 2, 5);
//		PRVI RED
		unosPrihodaPanel.add(new JLabel("Odaberi raèun"), gc);
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		unosPrihodaPanel.add(prihodRacunComboBox, gc);
//		DRUGI RED
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		unosPrihodaPanel.add(new JLabel("Unesi iznos prihoda"), gc);
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		unosPrihodaPanel.add(iznos, gc);
	}
	
	private void createTrosakLayout(){
		GridBagConstraints gc = new GridBagConstraints();
		
		unosTroskaPanel.setLayout(new GridBagLayout());
		
//		POÈETNO POSTAVLJANJE 
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(2, 5, 2, 5);
//		PRVI RED
		unosTroskaPanel.add(new JLabel("Odaberi raèun"), gc);
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		unosTroskaPanel.add(trosakRacunComboBox, gc);
//		DRUGI RED
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		unosTroskaPanel.add(new JLabel("Unesi iznos troška"), gc);
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		unosTroskaPanel.add(iznos, gc);
	}
	
	private void createTransferLayout(){
		
		GridBagConstraints gc = new GridBagConstraints();
		
		unosTransferaPanel.setLayout(new GridBagLayout());
		
//		POÈETNO POSTAVLJANJE 
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(2, 5, 2, 5);
//		PRVI RED
		unosTransferaPanel.add(new JLabel("Odaberi raèun tereèenja"), gc);
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		unosTransferaPanel.add(trosakRacunComboBox, gc);
//		DRUGI RED
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		unosTransferaPanel.add(new JLabel("Odaberi raèun odobrenja"), gc);
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		unosTransferaPanel.add(prihodRacunComboBox, gc);
//		TRECI RED
		gc.gridx = 0;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.LINE_END;
		unosTransferaPanel.add(new JLabel("Unesi iznos transfera"), gc);
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		unosTransferaPanel.add(iznos, gc);
	}
}
