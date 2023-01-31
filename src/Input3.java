import javax.swing.*;
import java.awt.*;

public class Input3 extends JTextField {

    public Input3(String inp3){
        setText(inp3);
        setPreferredSize(new Dimension(300,40));
        setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
    }
}