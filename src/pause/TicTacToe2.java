/*package pause;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;

public class TicTacToe2 extends JFrame implements ActionListener{
    public JPanel gameboard;
    public List<JButton> buttons;
    public char[] board;
    public Random random;
    public JFrame f;

    public TicTacToe2(){
        gameboard = new JPanel(new GridLayout(3,3));
        buttons = new ArrayList<>();
        board = new char[9];
        random = new Random();
        for (int i=0;i<9;i++){
            JButton b= new JButton();
            b.setFont(new Font("Arial",Font.BOLD,50));
            b.addActionListener(this);
            gameboard.add(b);
            buttons.add(b);
        }
        add(gameboard, BorderLayout.CENTER);
        setVisible(true);
    }
    public void makeMove(int index, char player){
        board[index] = player;
        buttons.get(index).setText(String.valueOf(player));
        buttons.get(index).setEnabled(false);
    }
    public void computerMove(){
        List<Integer> availableMoves = new ArrayList<>();
        for (int i = 0; i < 9;i++) {
            if  (board[i] == '-'){
                availableMoves.add(i);
            }
        }
        if (!availableMoves.isEmpty()){
            int randomIndex = random.nextInt(availableMoves.size());
            int move = availableMoves.get(randomIndex);
            makeMove(move, 'O');
        }
    }
    public boolean checkWin(char player){
        if ((board[0] == player && board[1] == player && board[2] == player) ||
            (board[3] == player && board[4] == player && board[5] == player) ||
            (board[6] == player && board[7] == player && board[8] == player) ||
            (board[0] == player && board[3] == player && board[6] == player) ||
            (board[1] == player && board[4] == player && board[7] == player) ||
            (board[2] == player && board[5] == player && board[8] == player) ||
            (board[0] == player && board[4] == player && board[8] == player) ||
            (board[2] == player && board[4] == player && board[6] == player)) {
                return true;
            }
        return false;
    }
    public boolean isBoardFull(){
        for (int i = 0; i < 9; i++){
            if (board[i] == '-'){
                return false;
            }
        }
        return true;
    }

    private void showGameOverPanel(String message) {
        JPanel gameOverPanel = new JPanel();
        gameOverPanel.setLayout(new BorderLayout());

        JLabel messageLabel = new JLabel(message);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gameOverPanel.add(messageLabel, BorderLayout.CENTER);

        JButton restartButton = new JButton("Restart");
        restartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });
        gameOverPanel.add(restartButton, BorderLayout.SOUTH);

        setContentPane(gameOverPanel);
        revalidate();
    }
    public void resetGame() {
        for (JButton b:buttons){
            b.setEnabled(true);
            b.setText("");
        }
        for (int i = 0; i < 9; i++){
            board[i] = '-';
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        int index = buttons.indexOf(button);
        if (board[index] == '-') {
            makeMove(index, 'X');
            if (checkWin('X')) {
                showGameOverPanel("You won!");
            } else if (isBoardFull()) {
                showGameOverPanel("It's a tie!");
            } else {
                computerMove();
                if (checkWin('O')) {
                    showGameOverPanel("Computer won!");
                } else if (isBoardFull()) {
                    showGameOverPanel("It's a tie!");
                }
            }
        }
    }
    public static void main (String[] args){
        SwingUtilities.invokeLater(() -> {
            new TicTacToe2();
        });
    }
}*/
