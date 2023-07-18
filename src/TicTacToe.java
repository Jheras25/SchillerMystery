/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener {
    private JPanel gamePanel;
    private List<JButton> buttons;
    private char[] board;
    private Random random;

    public TicTacToe() {
        gamePanel = new JPanel(new GridLayout(3, 3));
        buttons = new ArrayList<>();
        board = new char[9];
        random = new Random();

        for (int i = 0; i < 9; i++) {
            board[i] = '-';
        }
        
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            button.setFont(new Font("Arial", Font.BOLD, 50));
            button.addActionListener(this);
            gamePanel.add(button);
            buttons.add(button);
        }

        add(gamePanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void makeMove(int index, char player) {
        board[index] = player;
        buttons.get(index).setText(String.valueOf(player));
        buttons.get(index).setEnabled(false);
    }

    private void computerMove() {
        List<Integer> availableMoves = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            if (board[i] == '-') {
                availableMoves.add(i);
            }
        }
        if (!availableMoves.isEmpty()) {
            int randomIndex = random.nextInt(availableMoves.size());
            int move = availableMoves.get(randomIndex);
            makeMove(move, 'O');
        }
    }

    private boolean checkWin(char player) {
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

    private boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] == '-') {
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

        JButton restartButton = new JButton("nochmal");
        restartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("nochmal")){
                resetGame();
            }
        });
        gameOverPanel.add(restartButton, BorderLayout.SOUTH);

        setContentPane(gameOverPanel);
        revalidate();
    }

    private void resetGame() {
        for (JButton button : buttons) {
            button.setEnabled(false);
            button.setText("");
        }

        for (int i = 0; i < 9; i++) {
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TicTacToe();
        });
    }
}


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }*/