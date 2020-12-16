package com.rakaneth.wolfsden;


import com.valkryst.VTerminal.component.VFrame;
import com.valkryst.VTerminal.component.VPanel;
import com.valkryst.VTerminal.plaf.VProgressBarUI;
import com.valkryst.VTerminal.plaf.VTerminalLookAndFeel;

import javax.swing.*;
import javax.swing.plaf.ProgressBarUI;
import java.awt.*;

public class App {
    public static void main(final String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(VTerminalLookAndFeel.getInstance());

        final int rows = 40;
        final int cols = 100;

        final VPanel panel = new VPanel(cols, rows);
        final VFrame frame = new VFrame(panel);
        final JLabel label = new JLabel("Test Text");
        final JProgressBar progressBar = new JProgressBar();
        progressBar.setToolTipText("A tooltip.");
        progressBar.setValue(50);

        panel.add(label);
        panel.add(progressBar);
        frame.setResizable(false);
        frame.setTitle("Wolf's Den 2.5");
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.repaint();
    }
}
