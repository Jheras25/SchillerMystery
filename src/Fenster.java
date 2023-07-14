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
        createPanel8();
        createPanel9();
        createPanel10();
        createPanel11();
        createPanel12();
        createPanel13();
        createPanel14();
        createPanel15();
        createPanel16();
        createPanel17();
        createPanel18();
        createPanel19();
        createPanel20();
        createPanel21();


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
                    currentPanelIndex=2;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b1.setBounds(250, 400, 150, 30);

        JButton b2 = new JButton("Deutsch, Informatik");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Deutsch, Informatik")){
                    currentPanelIndex= 3;
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
                    currentPanelIndex= 4;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b3.setBounds(250, 450, 150, 30);

        JButton b4 = new JButton("Mathe, Sport");
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Mathe, Sport")){
                    currentPanelIndex=5;
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
                    currentPanelIndex=6;
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

		label= new JLabel("<html><body>Dein Klassenlehrer ist Herr Czernohous</body></html>");
        label.setForeground(Color.white);
        label.setBounds(0, 220, 320, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel4.add(label);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (6).png");

        JButton b6= new JButton("weiter");
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("weiter")){
                    currentPanelIndex=12;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b6.setBounds(110, 450, 100, 30);
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
                    currentPanelIndex=18;
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

		label= new JLabel("<html><body>Dein Klassenlehrer ist Herr Steiger</body></html>");
        label.setForeground(Color.white);
        label.setBounds(0, 220, 320, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel6.add(label);

        JButton b8= new JButton("weiter");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("weiter")){
                    currentPanelIndex=currentPanelIndex+10;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(110, 450, 100, 30);
        panel6.add(b8);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel6.add(backgroundLabel);
        panels.add(panel6);
    }   
    public void createPanel7(){
        JPanel panel7 = new JPanel();
        panel7.setLayout(null);

        label= new JLabel("<html><body>Du hast deine erste Unterrichtssstunde in der du Aufgaben machen wirst.<br><br>Erste Aufgabe: <br> Welches der Instrumente ist eine Violine?</body></html>");
        label.setForeground(Color.white);
        label.setBounds(50, 50, 700, 250);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel7.add(label);

        JButton b8= new JButton("");
        ImageIcon icon1 = new ImageIcon("MicrosoftTeams-image (4).png");
        b8.setIcon(icon1);
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("")){
                    currentPanelIndex=7;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(200, 250, 100, 200);
        panel7.add(b8);

        JButton b9= new JButton("");
        ImageIcon icon2 = new ImageIcon("MicrosoftTeams-image (4).png");
        b9.setIcon(icon2);
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("")){
                    currentPanelIndex=8;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b9.setBounds(350, 250, 100, 200);
        panel7.add(b9);

        JButton b10= new JButton("");
        ImageIcon icon3 = new ImageIcon("MicrosoftTeams-image (4).png");
        b10.setIcon(icon3);
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("")){
                    currentPanelIndex=8;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b10.setBounds(500, 250, 100, 200);
        panel7.add(b10);

        ImageIcon backgroundImage1 = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage1);
        backgroundLabel.setBounds(0, 0, backgroundImage1.getIconWidth(), backgroundImage1.getIconHeight());
        panel7.add(backgroundLabel);
        panels.add(panel7);
    }

    public void createPanel8() {
        JPanel panel8 = new JPanel();
        panel8.setLayout(null);

		label= new JLabel("<html><body>Deine Antwort ist richtig</body></html>");
        label.setForeground(Color.WHITE);
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel8.add(label);

        JButton b8= new JButton("weiter");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("weiter")){
                    currentPanelIndex=9;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(350, 275, 100, 30);
        panel8.add(b8);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel8.add(backgroundLabel);
        panels.add(panel8);
    }

    public void createPanel9(){
        JPanel panel9 = new JPanel();
        panel9.setLayout(null);

        label= new JLabel("<html><body>Deine Antwort ist leider falsch<br>Probiere es noch einmal</body></html>");
        label.setForeground(Color.WHITE);
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel9.add(label);

        JButton b= new JButton("nochmal");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("nochmal")){
                    currentPanelIndex=6;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b.setBounds(350, 300, 100, 30);
        panel9.add(b);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel9.add(backgroundLabel);
        panels.add(panel9);

    }

    public void createPanel10(){
        JPanel panel10 = new JPanel();
        panel10.setLayout(null);

        label= new JLabel("<html><body>Zweite Aufgabe: <br> Welcher römische Gott hat einen Dreizack?</body></html>");
        label.setForeground(Color.white);
        label.setBounds(50, 120, 700, 250);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel10.add(label);

        JButton b8= new JButton("Vulcanus");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Vulcanus")){
                    currentPanelIndex=11;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(200, 300, 100, 50);
        panel10.add(b8);

        JButton b9= new JButton("Neptun");
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Neptun")){
                    currentPanelIndex=10;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b9.setBounds(350, 300, 100, 50);
        panel10.add(b9);

        JButton b10= new JButton("Merkur");
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Merkur")){
                    currentPanelIndex=11;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b10.setBounds(500, 300, 100, 50);
        panel10.add(b10);

        ImageIcon backgroundImage1 = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage1);
        backgroundLabel.setBounds(0, 0, backgroundImage1.getIconWidth(), backgroundImage1.getIconHeight());
        panel10.add(backgroundLabel);
        panels.add(panel10);
    }

    public void createPanel11() {
        JPanel panel11 = new JPanel();
        panel11.setLayout(null);

		label= new JLabel("<html><body>Deine Antwort ist richtig</body></html>");
        label.setForeground(Color.WHITE);
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel11.add(label);

        JButton b8= new JButton("weiter");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("weiter")){
                    currentPanelIndex=12;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(350, 275, 100, 30);
        panel11.add(b8);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel11.add(backgroundLabel);
        panels.add(panel11);
    }

    public void createPanel12(){
        JPanel panel12 = new JPanel();
        panel12.setLayout(null);

        label= new JLabel("<html><body>Deine Antwort ist leider falsch<br>Probiere es noch einmal</body></html>");
        label.setForeground(Color.WHITE);
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel12.add(label);

        JButton b= new JButton("nochmal");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("nochmal")){
                    currentPanelIndex=9;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b.setBounds(350, 300, 100, 30);
        panel12.add(b);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel12.add(backgroundLabel);
        panels.add(panel12);
    }


    public void createPanel13(){
        JPanel panel13 = new JPanel();
        panel13.setLayout(null);

        label= new JLabel("<html><body>Du hast deine erste Unterrichtssstunde in der du Aufgaben machen wirst.<br><br>Erste Aufgabe:<br> Wie viele Silben hat das Wort Schmetterling?</body></html>");
        label.setForeground(Color.white);
        label.setBounds(50, 120, 700, 250);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel13.add(label);

        JButton b8= new JButton("4");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("4")){
                    currentPanelIndex=14;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(200, 300, 100, 50);
        panel13.add(b8);

        JButton b9= new JButton("2");
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("2")){
                    currentPanelIndex=14;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b9.setBounds(350, 300, 100, 50);
        panel13.add(b9);

        JButton b10= new JButton("3");
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("3")){
                    currentPanelIndex=13;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b10.setBounds(500, 300, 100, 50);
        panel13.add(b10);

        ImageIcon backgroundImage1 = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage1);
        backgroundLabel.setBounds(0, 0, backgroundImage1.getIconWidth(), backgroundImage1.getIconHeight());
        panel13.add(backgroundLabel);
        panels.add(panel13);
    }

    public void createPanel14() {
        JPanel panel14 = new JPanel();
        panel14.setLayout(null);

		label= new JLabel("<html><body>Deine Antwort ist richtig! <br> <center> Schmet-ter-ling </center></body></html>");
        label.setForeground(Color.WHITE);
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel14.add(label);

        JButton b8= new JButton("weiter");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("weiter")){
                    currentPanelIndex=15;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(350, 275, 100, 30);
        panel14.add(b8);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel14.add(backgroundLabel);
        panels.add(panel14);
    }

    public void createPanel15(){
        JPanel panel15 = new JPanel();
        panel15.setLayout(null);

        label= new JLabel("<html><body>Deine Antwort ist leider falsch<br>Probiere es noch einmal</body></html>");
        label.setForeground(Color.WHITE);
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel15.add(label);

        JButton b= new JButton("nochmal");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("nochmal")){
                    currentPanelIndex=12;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b.setBounds(350, 300, 100, 30);
        panel15.add(b);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel15.add(backgroundLabel);
        panels.add(panel15);
    }

    public void createPanel16(){
        JPanel panel16 = new JPanel();
        panel16.setLayout(null);

        label= new JLabel("<html><body>Zweite Aufgabe:<br> Wofür steht die Abkürzung PC?</body></html>");
        label.setForeground(Color.white);
        label.setBounds(50, 120, 700, 250);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel16.add(label);

        JButton b8= new JButton("<html><body>Personal <br>Computer</body></html>");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("<html><body>Personal <br>Computer</body></html>")){
                    currentPanelIndex=16;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(200, 300, 100, 100);
        panel16.add(b8);

        JButton b9= new JButton("<html><body>Private <br>Computer</body></html>");
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("<html><body>Private <br>Computer</body></html>")){
                    currentPanelIndex=17;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b9.setBounds(350, 300, 100, 100);
        panel16.add(b9);

        JButton b10= new JButton("<html><body>Protected <br>Computer</body></html>");
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("<html><body>Protected <br>Computer</body></html>")){
                    currentPanelIndex=17;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b10.setBounds(500, 300, 100, 100);
        panel16.add(b10);

        ImageIcon backgroundImage1 = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage1);
        backgroundLabel.setBounds(0, 0, backgroundImage1.getIconWidth(), backgroundImage1.getIconHeight());
        panel16.add(backgroundLabel);
        panels.add(panel16);
    }

    public void createPanel17() {
        JPanel panel14 = new JPanel();
        panel14.setLayout(null);

		label= new JLabel("<html><body>Deine Antwort ist richtig!</center></body></html>");
        label.setForeground(Color.WHITE);
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel14.add(label);

        JButton b8= new JButton("weiter");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("weiter")){
                    currentPanelIndex=19;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(350, 275, 100, 30);
        panel14.add(b8);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel14.add(backgroundLabel);
        panels.add(panel14);
    }

    public void createPanel18(){
        JPanel panel18 = new JPanel();
        panel18.setLayout(null);

        label= new JLabel("<html><body>Deine Antwort ist leider falsch<br>Probiere es noch einmal</body></html>");
        label.setForeground(Color.WHITE);
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel18.add(label);

        JButton b= new JButton("nochmal");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("nochmal")){
                    currentPanelIndex=15;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b.setBounds(350, 300, 100, 30);
        panel18.add(b);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel18.add(backgroundLabel);
        panels.add(panel18);
    }

    public void createPanel19(){
        JPanel panel19 = new JPanel();
        panel19.setLayout(null);

        label= new JLabel("<html><body>Du hast deine erste Unterrichtssstunde in der du Aufgaben machen wirst.<br><br>Erste Aufgabe:<br> Was heißt Freitag auf Englisch?</body></html>");
        label.setForeground(Color.white);
        label.setBounds(50, 120, 700, 250);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel19.add(label);

        JButton b8= new JButton("Friday");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Friday")){
                    currentPanelIndex=19;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(200, 300, 100, 50);
        panel19.add(b8);

        JButton b9= new JButton("Friyay");
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Friyay")){
                    currentPanelIndex=20;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b9.setBounds(350, 300, 100, 50);
        panel19.add(b9);

        JButton b10= new JButton("Freiday");
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Freiday")){
                    currentPanelIndex=20;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b10.setBounds(500, 300, 100, 50);
        panel19.add(b10);

        ImageIcon backgroundImage1 = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage1);
        backgroundLabel.setBounds(0, 0, backgroundImage1.getIconWidth(), backgroundImage1.getIconHeight());
        panel19.add(backgroundLabel);
        panels.add(panel19);
    }

    public void createPanel20() {
        JPanel panel20 = new JPanel();
        panel20.setLayout(null);

		label= new JLabel("<html><body>Deine Antwort ist richtig! </center></body></html>");
        label.setForeground(Color.WHITE);
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel20.add(label);

        JButton b8= new JButton("weiter");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("weiter")){
                    currentPanelIndex=21;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b8.setBounds(350, 275, 100, 30);
        panel20.add(b8);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel20.add(backgroundLabel);
        panels.add(panel20);
    }

    public void createPanel21(){
        JPanel panel21 = new JPanel();
        panel21.setLayout(null);

        label= new JLabel("<html><body>Deine Antwort ist leider falsch<br>Probiere es noch einmal</body></html>");
        label.setForeground(Color.WHITE);
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel21.add(label);

        JButton b= new JButton("nochmal");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("nochmal")){
                    currentPanelIndex=18;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b.setBounds(350, 300, 100, 30);
        panel21.add(b);
        ImageIcon backgroundImage = new ImageIcon("MicrosoftTeams-image (2).png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        panel21.add(backgroundLabel);
        panels.add(panel21);
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