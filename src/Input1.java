import javax.swing.*;
import java.awt.*;

public class Input1 extends JTextField {

    public Input1(String inp1){
        setText(inp1);
        setPreferredSize(new Dimension(300,40));
        setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
    }
}