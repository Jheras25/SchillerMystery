import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Fenster implements ActionListener{
    JFrame f;
    JLabel label;
    int currentPanelIndex;
    List<JPanel> panels;



    public void Bild() {    
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,600);
        panels = new ArrayList<>();
        currentPanelIndex = 0;
        createPanel1();
        createPanel2();
        createPanel3();
		createPanel4();
        createPanel5();
        createPanel6();
        createPanel7();
        //createPanel8();
        //createPanel9();
        //createPanel10();


        showCurrentPanel();
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("weiter")){
            currentPanelIndex++;
            if(currentPanelIndex >= panels.size()){
                currentPanelIndex = 0;
            }
            showCurrentPanel();
        }
    }
    public void createPanel1(){
        JPanel panel1 =new JPanel();    
        panel1.setLayout(null);
        label= new JLabel("<html><body>Liebe/r zukünftige/r Schillerschüler/in,<br><br>herzlich willkommen am Schiller-Gymnasium! <br>Wir freuen uns sehr, euch als neue Mitglieder unserer Schulgemeinschaft <br>begrüßen zu dürfen. Mit diesem Brief möchten wir euch einen herzlichen Empfang bereiten<br> und euch einen ersten Eindruck von unserem Gymnasium vermitteln.<br> Wir sind uns sicher, dass ihr euren ersten Schultag genießen werdet.<br> Wir wünschen euch viel Spaß mit neuen Freund/innen und viel Erfolg beim lernen.<br> Mit vielen lieben Grüßen,<br><br>Euer Schiller-Gymnasium </body></html>");
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel1.add(label);

        JButton button = new JButton ("weiter");
        button.addActionListener(this);
        button.setBounds(350, 500, 100, 30);
        panel1.add(button);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (1).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel1.add(backgroundLabel);
        panels.add(panel1);
    }
    
    public void createPanel2() {
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        label= new JLabel("<html><body>Welche Fächer wollt ihr wählen?</body></html>");
        label.setForeground(Color.white);
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(label);

		JButton b1 = new JButton("Latein, Musik");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Latein, Musik")){
                    currentPanelIndex++;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b1.setBounds(250, 400, 150, 30);

        JButton b2 = new JButton("Mathe, Informatik");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Mathe, Informatik")){
                    currentPanelIndex= currentPanelIndex+2;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b2.setBounds(400, 400, 150, 30);

        JButton b3 = new JButton("Englisch, Biologie");
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Englisch, Biologie")){
                    currentPanelIndex= currentPanelIndex+3;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b3.setBounds(250, 450, 150, 30);

        JButton b4 = new JButton("Französisch, Sport");
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Französisch, Sport")){
                    currentPanelIndex= currentPanelIndex+4;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b4.setBounds(400, 450, 150, 30);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);

        panel2.add(b1);
        panel2.add(b2);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel2.add(backgroundLabel);
        panels.add(panel2);
    }
    
	public void createPanel3() {
        JPanel panel3 = new JPanel();
        panel3.setLayout(null);

		label= new JLabel("<html><body>Deine Klassenlehrerin ist Frau Stegmann</body></html>");
        label.setForeground(Color.white);
        label.setBounds(0, 220, 320, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel3.add(label);
       

        JButton b5= new JButton("weiter");
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("weiter")){
                    currentPanelIndex=currentPanelIndex+4;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b5.setBounds(110, 450, 100, 30);
        panel3.add(b5);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (3).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel3.add(backgroundLabel);
        panels.add(panel3);
    }

    public void createPanel4() {
        JPanel panel4 = new JPanel();
        panel4.setLayout(null);

		label= new JLabel("<html><body>Dein Klassenlehrer ist Herr Krehl</body></html>");
        label.setBounds(50, 220, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel4.add(label);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (1).png");

        JButton b6= new JButton("weiter");
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("weiter")){
                    currentPanelIndex=currentPanelIndex+4;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b6.setBounds(350, 450, 100, 30);
        panel4.add(b6);
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel4.add(backgroundLabel);
        panels.add(panel4);
    }
	
    public void createPanel5() {
        JPanel panel5 = new JPanel();
        panel5.setLayout(null);

		label= new JLabel("<html><body>Deine Klassenlehrerin ist Frau Brucher</body></html>");
        label.setForeground(Color.white);
        label.setBounds(0, 220, 320, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel5.add(label);

        JButton b7= new JButton("weiter");
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("weiter")){
                    currentPanelIndex=currentPanelIndex+4;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b7.setBounds(110, 450, 100, 30);
        panel5.add(b7);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (5).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel5.add(backgroundLabel);
        panels.add(panel5);
    }

    public void createPanel6() {
        JPanel panel6 = new JPanel();
        panel6.setLayout(null);

		label= new JLabel("<html><body>Dein Klassenlehrer ist Herr Wöltge</body></html>");
        label.setBounds(50, 220, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel6.add(label);

        JButton b8= new JButton("weiter");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("weiter")){
                    currentPanelIndex=currentPanelIndex+4;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(350, 450, 100, 30);
        panel6.add(b8);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (1).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel6.add(backgroundLabel);
        panels.add(panel6);
    }

    public void createPanel7(){
        JPanel panel7 = new JPanel();
        panel7.setLayout(null);

        label= new JLabel("<html><body>Du hast deine erste Unterrichtssstunde in der du Aufgaben machen wirst.<br><br>Erste Aufgabe: <br> Welches der Instrumente ist eine Violine?</body></html>");
        label.setBounds(50, 50, 700, 250);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel7.add(label);

        JButton b8= new JButton("");
        ImageIcon icon1 = new ImageIcon("MicrosoftTeams-image (4).png");
        b8.setIcon(icon1);
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("")){
                    currentPanelIndex=currentPanelIndex+4;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(175, 250, 100, 200);
        panel7.add(b8);

        JButton b9= new JButton("");
        ImageIcon icon2 = new ImageIcon("MicrosoftTeams-image (4).png");
        b9.setIcon(icon2);
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("")){
                    currentPanelIndex=currentPanelIndex+4;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b9.setBounds(300, 250, 100, 200);
        panel7.add(b9);

        ImageIcon backgroundImage1 = new ImageIcon("MicrosoftTeams-image (1).png");
        JLabel backgroundLabel = new JLabel(backgroundImage1);
        backgroundLabel.setBounds(0, 0, backgroundImage1.getIconWidth(), backgroundImage1.getIconHeight());
        panel7.add(backgroundLabel);
        panels.add(panel7);
    }


    private void showCurrentPanel(){
        f.getContentPane().removeAll();
        f.add(panels.get(currentPanelIndex));
        f.revalidate();
        f.repaint();
    }
    public static void main(String[] args){
        Fenster fenster = new Fenster();
        fenster.Bild();
    }
}