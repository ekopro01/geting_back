package view;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class GotoviComboBox extends JComboBox<String>{
	
	public GotoviComboBox(List<?> lista){
		DefaultComboBoxModel model = new DefaultComboBoxModel();
		
		for(Object element : lista){
			model.addElement(element.toString());
		}
		this.setModel(model);
	}
	
}