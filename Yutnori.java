package com.sd.yutnori;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;

public class Yutnori extends Player {
    String[] mapPlayer;
	String[][] horse;

    private final JPanel gui = new JPanel(new BorderLayout(3, 3));
    private JButton[][] board = new JButton[8][8];
    private JPanel ABoard;
    private static final String COLS = "12345678";

    Yutnori() {
        initializeGui();
    }

    public final void initializeGui() {

        gui.add(new JLabel("?"), BorderLayout.LINE_START);

       ABoard = new JPanel(new GridLayout(0, 9));
        ABoard.setBorder(new LineBorder(Color.BLACK));
        gui.add(ABoard);

        Insets buttonMargin = new Insets(0,0,0,0);
        for (int ii = 0; ii < board.length; ii++) {
            for (int jj = 0; jj < board[ii].length; jj++) {
                JButton b = new JButton();
                b.setMargin(buttonMargin);
                
                ImageIcon icon = new ImageIcon(
                        new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));
                b.setIcon(icon);
                if ((ii == 0) || (ii == 7) || (jj == 0) || (jj == 7)) {
                    b.setBackground(Color.BLACK);
                } else {
                    b.setBackground(Color.WHITE);
                }
                board[jj][ii] = b;
            }
        }


        ABoard.add(new JLabel(""));
        
        for (int ii = 0; ii < 8; ii++) {
            ABoard.add(
                    new JLabel(COLS.substring(ii, ii + 1),
                    SwingConstants.CENTER));
        }
       
        for (int ii = 0; ii < 8; ii++) {
            for (int jj = 0; jj < 8; jj++) {
                switch (jj) {
                    case 0:
                        ABoard.add(new JLabel("" + (ii + 1),
                                SwingConstants.CENTER));
                    default:
                        ABoard.add(board[jj][ii]);
                }
            }
        }
    }

    public final JComponent getTheBoard() {
        return ABoard;
    }

    public final JComponent getGui() {
        return gui;
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                Yutnori yt =
                        new Yutnori();

                JFrame f = new JFrame("Java GUI Game");
                f.add(yt.getGui());
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setLocationByPlatform(true);

                f.pack();
                f.setMinimumSize(f.getSize());
                f.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }
    
    public void disOut() {
		mapPlayer = new String[32];
		horse = new String[32][4]; 
		for (int i = 0; i < horseA.length; i++) {
			if (horseA[i] != 0 || horseA[i] != 31) { 
				mapPlayer[horseA[i]] = "A";
				horse[horseA[i]][i] = String.valueOf(i);
			}
		}
		for (int i = 0; i < horseB.length; i++) {
			if (horseB[i] != 0 || horseB[i] != 31) {
				mapPlayer[horseB[i]] = "B";
				horse[horseB[i]][i] = String.valueOf(i);
			}
		}
		
		for (int i = 0; i < mapPlayer.length; i++) { 
			if (mapPlayer[i] == null) {
				mapPlayer[i] = "";
			}
		}
		for (int i = 0; i < horse.length; i++) {
			for (int j = 0; j < horse[i].length; j++) {
				if (horse[i][j] == null) {
					horse[i][j] = "";
				}
			}
		}
	
		System.out.print("[A]" + nameA + " : ");
		for (int i = 0; i < horseA.length; i++) {
			System.out.print(i + ". ");
			if (horseA[i] == 0) {
				System.out.print("Out  ");
			} else if (horseA[i] == 31) {
				System.out.print("Success  ");
			} else {
				System.out.print("Moving ");
			}
		}
		System.out.println();

		System.out.print("[B]" + nameB + " : ");
		for (int i = 0; i < horseB.length; i++) {
			System.out.print(i + ". ");
			if (horseB[i] == 0) {
				System.out.print("Out  ");
			} else if (horseB[i] == 31) {
				System.out.print("Success ");
			} else {
				System.out.print("Moving  ");
			}
		}
		System.out.println();
		System.out.println();

	}
    
    
}