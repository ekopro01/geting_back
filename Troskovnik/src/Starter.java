import javax.swing.SwingUtilities;

import view.MainFrame;


public class Starter {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				
				new MainFrame();
			}
		});
		
		TesterKlasa test = new TesterKlasa();
		test.run();

	}

}
