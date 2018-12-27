package GUI_TicTacToe;

import javafx.scene.control.RadioButton;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartNewGameWindow extends JFrame {
    private static final int WIN_WIDTH = 350;
    private static final int WIN_HEIGTH = 230;
    private static final int WIN_LENGTH = 3;
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;
    private static final String FIELD_SIZE_PREFIX = "Размер поля: ";
    private static final String WIN_LENGTH_PREFIX = "Выигрышная линия: ";


    private JRadioButton rbHumVSHum;
    private JRadioButton rbHumVSAI;
    private JSlider slFieldSize;
    private JSlider slWinLength;
    private GameWindows gameWindows;
    private JButton btnStartGame;

    StartNewGameWindow(GameWindows gameWindows) {
        this.gameWindows = gameWindows;
        Rectangle gameWindowBounds = gameWindows.getBounds();
        int pos_x = (int) gameWindowBounds.getCenterX() - WIN_WIDTH / 2;
        int pos_y = (int) gameWindowBounds.getCenterY() - WIN_HEIGTH / 2;
        setLocation(pos_x, pos_y);
        setResizable(false);
        setTitle("Настройки игры");
        setLayout(new GridLayout(10, 1));
        setSize(WIN_WIDTH, WIN_HEIGTH);
        addControlsGameMode();
        addControlsGameField();
        btnStartGame = new JButton("Начать игру!");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnStartGameClick();
            }
        });
        add(btnStartGame);
    }

    private void addControlsGameMode() {
        add(new JLabel("Выберите режим игры: "));
        rbHumVSAI = new JRadioButton("Игрок против компьютера");
        rbHumVSHum = new JRadioButton("Игрок против игрока");
        ButtonGroup gameMode = new ButtonGroup();
        gameMode.add(rbHumVSAI);
        gameMode.add(rbHumVSHum);
        rbHumVSAI.setSelected(true);
        add(rbHumVSHum);
        add(rbHumVSAI);
    }

    private void addControlsGameField() {
        JLabel lblFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);
        slFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        slFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = slFieldSize.getValue();
                lblFieldSize.setText(FIELD_SIZE_PREFIX + currentValue);
                slWinLength.setMaximum(currentValue);
            }
        });
        add(new JLabel("Выберите размер поля: "));
        add(lblFieldSize);
        add(slFieldSize);

        JLabel lblWinLength = new JLabel(WIN_LENGTH_PREFIX + WIN_LENGTH);
        slWinLength = new JSlider(WIN_LENGTH, MAX_FIELD_SIZE, WIN_LENGTH);
        slWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblWinLength.setText(WIN_LENGTH_PREFIX + slWinLength.getValue());
            }
        });
        add(new JLabel("Выберите выигрышную длину: "));
        add(lblWinLength);
        add(slWinLength);
    }

    private void btnStartGameClick() {
        int gameMode;
        if (rbHumVSAI.isSelected()) {
            gameMode = Map.GAME_MODE_NVA;
        } else if (rbHumVSHum.isSelected()) {
            gameMode = Map.GAME_MODE_HVH;
        } else {
            throw new RuntimeException("Используется неизвестный модификатор игры!");
        }
        int fieldSizeX = slFieldSize.getValue();
        int winLen = slWinLength.getValue();
        gameWindows.startNewGame(gameMode, fieldSizeX, fieldSizeX, winLen);
        setVisible(false);
    }
}
