import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Notepad {
    private JButton clear;
    private JPanel start;
    private JTextArea background;
    private JButton Start;
    private JButton copy;
    private JButton home;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Notepad");
        frame.setContentPane(new Notepad().start);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //this.setLoctionRelativeTo( nu)
    }

    public Notepad() {
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
              clear.setText(null);
            }
        });

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        background.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                super.componentResized(componentEvent);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
