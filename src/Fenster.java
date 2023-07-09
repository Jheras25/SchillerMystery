import javax.swing.*;

public class Fenster {
	public static void main(final String... args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				final JFrame f = new JFrame();
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(800,600);
				JLabel label= new JLabel("<html><body>Liebe/r zukünftige/r Schillerschüler/in,<br><br>herzlich willkommen am Schiller-Gymnasium! Wir freuen uns sehr, euch als neue Mitglieder unserer Schulgemeinschaft <br>begrüßen zu dürfen. Mit diesem Brief möchten wir euch einen herzlichen Empfang bereiten und<br> euch einen ersten Eindruck von unserem Gymnasium vermitteln. Wir sind uns sicher, dass ihr euren ersten Schultag genießen werdet. Wir wünschen euch viel Spaß mit neuen Freund/innen und viel Erfolg beim lernen.<br> Mit vielen lieben Grüßen,<br><br>Euer Schiller-Gymnasium </body></html>");

                f.getContentPane().add(label);
                
    
                label.setHorizontalAlignment(JLabel.CENTER);
				f.setLocationRelativeTo(null);
				f.setVisible(true);

			}
		});
	}
}