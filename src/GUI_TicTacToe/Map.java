package GUI_TicTacToe;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int GAME_MODE_NVA = 0;
    public static final int GAME_MODE_HVH = 1;

    Map() {
        setBackground(Color.BLACK);
    }

    void startNewGame (int mode, int sizeX, int sizeY, int lineWin) {
        System.out.println("Запуск игры");
        System.out.println("mode: " + mode);
        System.out.println("size: " + sizeX);
        System.out.println("win line: " + lineWin);
    }
}
