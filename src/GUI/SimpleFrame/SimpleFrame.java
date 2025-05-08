package GUI.SimpleFrame;

import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class SimpleFrame {

    public static void frame_1() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("第一个窗口");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            frame.setLayout(new GridLayout(3, 2, 5, 5));

            JButton btn1 = new JButton("按钮1");
            JButton btn2 = new JButton("按钮2");
            JButton btn3 = new JButton("按钮3");

            Icon icon = UIManager.getIcon("FileView.floppyDriveIcon");

            JLabel label1 = new JLabel("打印", icon, JLabel.RIGHT);
            JLabel label2 = new JLabel(icon);
            JLabel label3 = new JLabel("我是标签", icon, JLabel.LEFT);

            frame.add(btn1);
            frame.add(label2);
            frame.add(label1);
            frame.add(btn2);
            frame.add(btn3);
            frame.add(label3);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    public static void frame_2() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("第二个窗口");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            frame.getContentPane().setBackground(java.awt.Color.YELLOW);
            frame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

            JButton btn1 = new JButton("按钮1");
            JButton btn2 = new JButton("按钮2");
            JButton btn3 = new JButton("按钮3");

            btn1.setBackground(java.awt.Color.RED);

            btn2.setBackground(java.awt.Color.LIGHT_GRAY);
            btn3.setBackground(java.awt.Color.LIGHT_GRAY);

            btn1.setOpaque(true);
            btn2.setOpaque(true);
            btn3.setOpaque(true);

            btn1.setFont(new java.awt.Font("微软雅黑", java.awt.Font.BOLD, 16));
            btn2.setFont(new java.awt.Font("微软雅黑", java.awt.Font.BOLD, 16));
            btn3.setFont(new java.awt.Font("微软雅黑", java.awt.Font.BOLD, 16));

            frame.add(btn1);
            frame.add(btn2);
            frame.add(btn3);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    public static void frame_3() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("第三个窗口");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            frame.setLayout(new java.awt.BorderLayout(10, 10));

            JButton btn1 = new JButton("按钮1");
            btn1.setBackground(java.awt.Color.RED);
            btn1.setForeground(java.awt.Color.WHITE);
            btn1.setOpaque(true);
            btn1.setFont(new java.awt.Font("微软雅黑", java.awt.Font.BOLD, 16));

            JButton btn2 = new JButton("按钮2");
            btn2.setForeground(new java.awt.Color(100, 100, 255));
            btn2.setOpaque(true);
            btn2.setFont(new java.awt.Font("微软雅黑", java.awt.Font.BOLD, 16));

            JButton btn3 = new JButton("按钮3");
            btn3.setOpaque(true);
            btn3.setFont(new java.awt.Font("微软雅黑", java.awt.Font.BOLD, 16));

            frame.add(btn1, java.awt.BorderLayout.SOUTH);
            frame.add(btn2, java.awt.BorderLayout.CENTER);
            frame.add(btn3, java.awt.BorderLayout.EAST);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

}
