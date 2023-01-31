import javax.swing.*;
import java.awt.*;

public class Input2 extends JTextField {

    public Input2(String inp2){
        setText(inp2);
        setPreferredSize(new Dimension(300,40));
        setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
    }
}