package GUI_TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindows extends JFrame {
    private static final int WIDTH_WIN = 407;
    private static final int HEIGTH_WIN = 455;
    private static final int POS_X = 900;
    private static final int POS_Y = 100;
    private static Map map;
    private static StartNewGameWindow startNewGameWindow;


    GameWindows() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH_WIN, HEIGTH_WIN);
        setLocation(POS_X, POS_Y);
        setTitle("Крестики-Нолики");
        setResizable(false);

        JPanel panel = new JPanel(new GridLayout(1, 2));
        JButton btnNewGame = new JButton("Новая игра");
        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGameWindow.setVisible(true);
            }
        });
        JButton btnExitGame = new JButton("Завершить игру");
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(btnNewGame);
        panel.add(btnExitGame);
        add(panel, BorderLayout.SOUTH);

        map = new Map();
        add(map, BorderLayout.CENTER);
        startNewGameWindow = new StartNewGameWindow(this);



        setVisible(true);
    }

    void startNewGame(int mode, int sizeX, int sizeY, int lineWin) {
        map.startNewGame(mode, sizeX, sizeY, lineWin);
    }
}
