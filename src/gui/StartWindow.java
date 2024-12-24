package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class StartWindow extends JFrame {

    private JButton rulesButton;

    public StartWindow() {
        // Set window title and size
        setTitle("Minesweeper");
        setSize(350,140); // Adjusted size to fit three buttons horizontally
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create Easy, Hard, and Game Rules buttons
        JButton btnEasy = new JButton("Easy");
        JButton btnHard = new JButton("Hard");

        // ActionListener for Easy button
        btnEasy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGameWindow(false); // false: Easy Mode
            }
        });

        // ActionListener for Hard button
        btnHard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGameWindow(true); // true: Hard Mode
            }
        });

        // ActionListener for Game Rules button
        rulesButton = new JButton("Game Rules");
        rulesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showGameRules();
            }
        });

        // Set the layout manager for the frame (FlowLayout.CENTER will center the buttons)
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));  // 10px horizontal gap, 30px vertical gap

        // Add buttons to the frame
        add(btnEasy);
        add(btnHard);
        add(rulesButton);

        // Center the window on screen
        setLocationRelativeTo(null);
    }

    // Method to open the game window with specified difficulty (Easy or Hard)
    private void openGameWindow(boolean isHardMode) {
        Gui gameWindow = new Gui(isHardMode);
        gameWindow.setVisible(true);
        dispose(); // Close the Start window when opening the game window
    }

    // Method to show the game rules in a dialog box
    private void showGameRules() {
        String rules = "<html><h3>Minesweeper Game Rules</h3>"
                + "<ul>"
                + "<li>Click on a tile to reveal it.</li>"
                + "<li>Each revealed tile shows a number that indicates how many mines are adjacent to it.</li>"
                + "<li>If you click on a tile with a mine, you lose the game.</li>"
                + "<li>Your goal is to reveal all the non-mine tiles without clicking on a mine.</li>"
                + "<li>You can mark a tile as a potential mine by right-clicking and placing a flag.</li>"
                + "<li>The game ends when you either reveal all safe tiles or click on a mine.</li>"
                + "</ul>"
                + "<h4>Difficulty Levels:</h4>"
                + "<ul>"
                + "<li>Easy: Small grid with fewer mines.</li>"
                + "<li>Hard: Larger grid with more mines.</li>"
                + "</ul>"
                + "</html>";

        // Display the game rules in a message dialog
        JOptionPane.showMessageDialog(this, rules, "Game Rules", JOptionPane.INFORMATION_MESSAGE);
    }
}
