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
        JLabel backgroundLabel = Hintergrund();
        panel1.add(backgroundLabel);

        JButton button = new JButton ("weiter");
        button.addActionListener(this);
        button.setBounds(350, 500, 100, 30);
        panel1.add(button);
        panels.add(panel1);
    }
    public JLabel Hintergrund (){
        ImageIcon backgroundImage = new ImageIcon("hintergrundbild.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        return backgroundLabel;
    }
    public void createPanel2() {
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        label= new JLabel("<html><body>Welche Fächer wollt ihr wählen?</body></html>");
        label.setBounds(50, 50, 700, 400);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(label);
        JLabel backgroundLabel = Hintergrund();
        panel2.add(backgroundLabel);
        JButton b1 = new JButton("Button 1");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Button 1")){
                    currentPanelIndex++;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b1.setBounds(250, 400, 100, 30);
        JButton b2 = new JButton("Button 2");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Button 2")){
                    currentPanelIndex= currentPanelIndex+2;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b2.setBounds(400, 400, 100, 30);
        panel2.add(b1);
        panel2.add(b2);
        panels.add(panel2);
    }
    public void createPanel3() {
        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        JButton b5= new JButton("Button 5");
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand().equals("Button 5")){
                    currentPanelIndex=currentPanelIndex+2;
                    if(currentPanelIndex >= panels.size()){
                        currentPanelIndex = 0;
                    }
                    showCurrentPanel();
                }
            }
        });
        b5.setBounds(350, 300, 100, 30);
        panel3.add(b5);
        panels.add(panel3);
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