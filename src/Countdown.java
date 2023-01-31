import javax.swing.*;
import java.awt.*;

public class Countdown extends JLabel {

    public Countdown(String st2){
        setText(st2);
        setPreferredSize(new Dimension(150,40));
        setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
    }
}