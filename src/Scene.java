import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scene extends JPanel implements ActionListener {

    Schalter Schalter1;
    Countdown Countdown1;
    HipHop HipHop1;

    Input1 Eingabe1;
    Input2 Eingabe2;
    Input3 Eingabe3;

    Button Button1;

    boolean first = true;
    boolean schalter = false;
    int zaehler = 0;
    int countdown = 10;

    public Scene(){
        setPreferredSize(new Dimension(500,250));
        setBackground(new Color(0xDDDDDD));

        Schalter1 = new Schalter("Schalter:");
        add(Schalter1);
        Eingabe1 = new Input1("");
        add(Eingabe1);

        Countdown1 = new Countdown("Countdown:");
        add(Countdown1);
        Eingabe2 = new Input2("");
        add(Eingabe2);

        HipHop1 = new HipHop("Hip-Hop:");
        add(HipHop1);
        Eingabe3 = new Input3("");
        add(Eingabe3);

        Button1 = new Button("Click Me...");
        add(Button1);
        Button1.addActionListener(this);



    }

    public void actionPerformed(ActionEvent e){

        zaehler += 1;

        if(first == true){
            first = false;
            Eingabe1.setText("PROGRAMM STARTET");
        } else {
            Eingabe1.setText("PROGRAMM LÄUFT");
        }

        if(countdown > 0){
            String cdown = "" + countdown;
            Eingabe2.setText(cdown);
            countdown = countdown - 1;
        } else if (countdown == 0) {
            Eingabe2.setText("OK");
        }

        if(zaehler % 2 == 0){
            Eingabe3.setText("HOP");
        } else {
            Eingabe3.setText("HIP");
        }


    }
}