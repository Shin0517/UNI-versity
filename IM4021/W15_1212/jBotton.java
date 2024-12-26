package W15_1212;

import javax.swing.*;

public class jBotton {
    public static void main(String[] args) {
        String[] options = {"500x500", "300x300", "100x100"};
        int choice = JOptionPane.showOptionDialog(
            null,
            "What size window do you prefer?",
            "Window size",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        int width = 0;
        int height = 0;

        switch(choice){
            case 0:
                width = 500;
                height = 500;
                break;
            case 1:
                width = 300;
                height = 300;
                break;
            case 2:
                width = 100;
                height = 100;
                break;
            default:
                JOptionPane.showMessageDialog(null, "No vaild selection3. Exit.");
                System.exit(0);
        }

        JFrame frame = new JFrame("Windows Size");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }
    
}
