package GUI.PerpetualCalendar;

import java.awt.*;
import javax.swing.*;

public class PerpetualCalendar extends JFrame {

    public PerpetualCalendar() {
        setTitle("万年历");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Top panel with buttons
        JPanel topPanel = new JPanel();
        JButton prevButton = new JButton("上月");
        JButton nextButton = new JButton("下月");
        topPanel.add(prevButton);
        topPanel.add(nextButton);

        // Calendar header
        String[] headers = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        JPanel headerPanel = new JPanel(new GridLayout(1, 7));
        for (String header : headers) {
            JLabel label = new JLabel(header, SwingConstants.CENTER);
            label.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            headerPanel.add(label);
        }

        // Calendar grid (empty for now)
        JPanel calendarPanel = new JPanel(new GridLayout(6, 7));
        // 2005年10月1日是周六（星期六），即第7列
        int daysInMonth = 31;
        int startDayOfWeek = 6; // 0=周日, 6=周六
        int day = 1;
        for (int i = 0; i < 42; i++) {
            JLabel dayLabel;
            if (i < startDayOfWeek || day > daysInMonth) {
                dayLabel = new JLabel("", SwingConstants.CENTER);
            } else {
                dayLabel = new JLabel(String.valueOf(day), SwingConstants.CENTER);
                day++;
            }
            calendarPanel.add(dayLabel);
        }

        // Footer
        JLabel footerLabel = new JLabel("日历: 2005年10月", SwingConstants.CENTER);

        // Layout
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(headerPanel, BorderLayout.NORTH);
        centerPanel.add(calendarPanel, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(footerLabel, BorderLayout.SOUTH);
    }

    public static void main() {
        SwingUtilities.invokeLater(() -> {
            new PerpetualCalendar().setVisible(true);
        });
    }
}
