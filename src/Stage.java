import javax.swing.*;
import java.awt.*;

public class Stage extends JFrame {
    public Stage(){
        Scene scene1 = new Scene();
        setSize(500,250);
        setTitle("Schalter und Zähler");
        setDefaultCloseOperation(3);
        setResizable(false);
        add(scene1);
        setVisible(true);
    }
}