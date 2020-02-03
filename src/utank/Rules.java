package utank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules {
    public Rules() {
        JFrame jFrame = new JFrame("Introduction");
        jFrame.setBounds(0, 0, 500, 500);

        JPanel jPanel = new JPanel();
        JLabel text = new JLabel("The game consists of two tanks...............");
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                FirstFrame firstFrame = new FirstFrame();
            }
        });
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });

        jPanel.add(text);
        jPanel.add(backButton);
        jPanel.add(exitButton);
        jFrame.add(jPanel);
        jFrame.setVisible(true);


    }
}
