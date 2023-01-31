import javax.swing.*;
import java.awt.*;

public class HipHop extends JLabel {

    public HipHop(String st3){
        setText(st3);
        setPreferredSize(new Dimension(150,40));
        setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
    }
}