import javax.swing.*;
import java.awt.*;

public class Schalter extends JLabel {

    public Schalter(String st1){
        setText(st1);
        setPreferredSize(new Dimension(150,40));
        setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
    }
}