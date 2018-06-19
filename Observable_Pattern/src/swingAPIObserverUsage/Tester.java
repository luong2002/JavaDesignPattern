package swingAPIObserverUsage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tester extends JFrame{
	JPanel myPanel;
	
	
	public static void main(String[] args) {
		Tester test = new Tester();
		test.execute();
	}
	
	public void execute() {
		myPanel = new JPanel();
		JButton myButton = new JButton( "Click Me" );
		JButton lambdaButton = new JButton( "Lambda Button" );
		lambdaButton.addActionListener( anything -> System.out.println( "Short lambda click" ));
		myButton.addActionListener( new DoListening() );
		myPanel.add(lambdaButton);
		myPanel.add(myButton);
		this.add( myPanel );
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	public class DoListening implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println( "Someone just click on me" );
		}
		
		
	}
	
}
