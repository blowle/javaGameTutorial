import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {

    public Snake() {
        initUI();
    }

    private void initUI() {

        this.add(new Board());

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Snake ex = new Snake();
            ex.setVisible(true);
        });
    }
}
