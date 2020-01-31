import javax.swing.*;
import java.awt.*;


/*
    this class include main method.
 */
public class Application extends JFrame {

    public Application() {
        initUI();
    }

    private void initUI() {

        add(new Board());

        setSize(250, 200);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);    // center

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Application app = new Application();
            app.setVisible(true);
        });
    }

}
