package testPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class SaveListener implements ActionListener {

	private JTextArea textArea;
	
	public SaveListener( JTextArea textArea ) {
		this.textArea = textArea;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println( textArea.getText() );
		System.out.flush();
	}

}
