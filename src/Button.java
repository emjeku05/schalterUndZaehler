import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Button extends JButton {
    public Button(String b1){
        setText(b1);
        setSize(145,40);
        setPreferredSize(new Dimension(145,40));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setEnabled(true);
    }
}