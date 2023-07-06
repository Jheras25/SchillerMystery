import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Fenster {
	public static void main(final String... args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				final JFrame f = new JFrame();
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(800,600);
				JLabel label= new JLabel("<html><body>Liebe/r zukünftige/r Schillerschüler/in,<br>wir freuen uns dir mitteilen zu können</body></html>");

                f.getContentPane().add(label);
                
    
                label.setHorizontalAlignment(JLabel.CENTER);
				f.setLocationRelativeTo(null);
				f.setVisible(true);

			}
		});
	}
}