import java.awt.event.*;
import javax.swing.*;

public class Button implements ActionListener {
    int i = 0;
    JButton b = new JButton("weiter");
    


    public void actionPerformed(ActionEvent e) {
        i++;
        b.setText("" + i);
    }

}