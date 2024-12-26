import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HealthRecord{
    public static void main(String[] args) {
        JFrame frame = new JFrame("簡易健康紀錄表");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1)); 

        JCheckBox exerciseCheckBox = new JCheckBox("今天有運動");
        JCheckBox sleepCheckBox = new JCheckBox("有足夠的睡眠");
        JCheckBox waterCheckBox = new JCheckBox("喝足夠的水");

        panel.add(exerciseCheckBox);
        panel.add(sleepCheckBox);
        panel.add(waterCheckBox);

        JButton submitButton = new JButton("提交紀錄");
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder result = new StringBuilder("你的健康紀錄:\n");
                boolean anySelected = false;

                if (exerciseCheckBox.isSelected()) {
                    result.append("\u2713 今天有運動\n");
                    anySelected = true;
                }
                if (sleepCheckBox.isSelected()) {
                    result.append("\u2713 有足夠的睡眠\n");
                    anySelected = true;
                }
                if (waterCheckBox.isSelected()) {
                    result.append("\u2713 喝足夠的水\n");
                    anySelected = true;
                }

                if (!anySelected) {
                    result.append("? 尚未完成任何項目");
                }

                JOptionPane.showMessageDialog(frame, result.toString(), "紀錄結果", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
