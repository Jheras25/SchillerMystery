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
				
				panel1 = new JPanel();
				panel1.setLayout(null);


				label= new JLabel("<html><body>Liebe/r zukünftige/r Schillerschüler/in,<br><br>herzlich willkommen am Schiller-Gymnasium! <br>Wir freuen uns sehr, euch als neue Mitglieder unserer Schulgemeinschaft <br>begrüßen zu dürfen. Mit diesem Brief möchten wir euch einen herzlichen Empfang bereiten<br> und euch einen ersten Eindruck von unserem Gymnasium vermitteln.<br> Wir sind uns sicher, dass ihr euren ersten Schultag genießen werdet.<br> Wir wünschen euch viel Spaß mit neuen Freund/innen und viel Erfolg beim lernen.<br> Mit vielen lieben Grüßen,<br><br>Euer Schiller-Gymnasium </body></html>");
				label.setBounds(50, 50, 700, 400); 
				label.setHorizontalAlignment(SwingConstants.CENTER);

                panel1.add(label);
				JLabel backgroundLabel = Hintergrund();
     			panel1.add(backgroundLabel);
				

				button = new JButton ("weiter");
				button.addActionListener(this);
				button.setBounds(350, 500, 100, 30);
                panel1.add(button);

                f.add(panel1);
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
	public JLabel Hintergrund (){
		ImageIcon backgroundImage = new ImageIcon("hintergrundbild.jpg");
		JLabel backgroundLabel = new JLabel(backgroundImage);
		backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
		return backgroundLabel;
	}
		
	public static void main(String[] args){
		Fenster fenster = new Fenster();
		fenster.Bild();
	}
}
