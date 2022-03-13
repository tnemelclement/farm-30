package ferme;

import javax.swing.*;
import java.awt.*;

public class Footer extends JPanel {
    JButton humidBtn = new JButton("HUMIDITE");
    JButton siloBtn = new JButton("SILO");
    JButton tempBtn = new JButton("TEMPERATURE");
    JButton userBtn = new JButton("UTILISATEUR");
    JButton homeBtn = new JButton("MENU PRINCIPAL");

    //footer.add(new JButton("REFRESH"));
    Footer() {
        add(humidBtn);
        add(siloBtn);
        add(tempBtn);
        add(userBtn);
        add(homeBtn);
    }



}
