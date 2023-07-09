import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenster implements ActionListener{
	JFrame f;
	JButton button;
	JLabel label;
	JPanel panel1;
	JPanel panel2;
	public void Bild() {
			
				f = new JFrame();
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(800,600);
				label= new JLabel("<html><body>Liebe/r zukünftige/r Schillerschüler/in,<br><br>herzlich willkommen am Schiller-Gymnasium! Wir freuen uns sehr, euch als neue Mitglieder unserer Schulgemeinschaft <br>begrüßen zu dürfen. Mit diesem Brief möchten wir euch einen herzlichen Empfang bereiten und<br> euch einen ersten Eindruck von unserem Gymnasium vermitteln. Wir sind uns sicher, dass ihr euren ersten Schultag genießen werdet. Wir wünschen euch viel Spaß mit neuen Freund/innen und viel Erfolg beim lernen.<br> Mit vielen lieben Grüßen,<br><br>Euer Schiller-Gymnasium </body></html>");
            
				panel1 = new JPanel();
				
                panel1.add(label);

				button = new JButton ("weiter");
				button.addActionListener(this);
                panel1.add(button);
                f.add(panel1);
                

				f.setSize(1300,900);
				f.setVisible(true);

			}
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == this.button){
			panel2 = new JPanel();
			f.getContentPane().removeAll();
			f.add(panel2);
			f.revalidate();
			f.repaint();
		}
	}
	public static void main(String[] args){
		Fenster fenster = new Fenster();
		fenster.Bild();
	}
}
