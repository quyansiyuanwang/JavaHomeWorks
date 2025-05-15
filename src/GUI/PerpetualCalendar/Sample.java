package GUI.PerpetualCalendar;

import java.awt.*;
import javax.swing.*;

public class Sample {

    public static void main() {
        JFrame frame = new JFrame("窗口");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 0, 0, 0);

        JButton btn1 = new JButton("按钮1");
        JButton btn2 = new JButton("按钮2");
        JButton btn3 = new JButton("按钮3");
        JButton btn4 = new JButton("按钮4");
        JButton btn5 = new JButton("按钮5");
        JButton btn6 = new JButton("按钮6");
        JButton btn7 = new JButton("按钮7");

        // 第一行
        gbc.gridy = 0;
        gbc.weighty = 0.15;

        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0.18;
        frame.add(btn1, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 0.36;
        frame.add(btn2, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.weightx = 0.18;
        frame.add(btn3, gbc);

        // 第二行
        gbc.gridy = 1;
        gbc.weighty = 0.85;

        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0.18;
        frame.add(btn7, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.18;
        frame.add(btn4, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.weightx = 0.18;
        frame.add(btn5, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.weightx = 0.28;
        frame.add(btn6, gbc);

        // gbc.gridx = 4;
        // gbc.gridwidth = 1;
        // gbc.weightx = 0.18;
        // frame.add(new JLabel(), gbc); // 占位
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
