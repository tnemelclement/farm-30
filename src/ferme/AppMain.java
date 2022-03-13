package ferme;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


public class AppMain {
    public static void main(String[] args) {
        Ecrans ecrans = new Ecrans();
    }
}

class Ecrans extends JFrame {
    public ArrayList<Capteur> capteurs = new ArrayList<Capteur>();
    private JPanel container = new JPanel();
    private JLabel ecran = new JLabel();

    JLabel title;



    public Ecrans() {
        this.setSize(1000, 700);
        this.setTitle("FARM 3.0");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        initComposant();
        this.setContentPane(container);
        this.setVisible(true);


    }

    private void initComposant(){
        title = new JLabel("FARM 3.0"); // Affiche le titre.
        title.setFont(new Font("Arial", Font.BOLD, 50));
        title.setForeground(Color.black);

        JPanel capt = new JPanel();
        JPanel footer = new JPanel();

        capt.setLayout(new GridLayout(2, 2));
        footer.add(new JButton("REFRESH"));

        capteurs.add(new Capteur(1, "Capteur d'humidite", "Dans la ferme", "Permet de connaitre l'humiditéde l'air de la ferme.", "%", 100));
        capteurs.add(new Capteur(2, "Capteur du silo", "Dans le silo à grain", "Permet de savoir quel est le niveau des grains dans le silo", "%", 100));
        capteurs.add(new Capteur(2, "Capteur température", "Dans la ferme", "Permet de savoir quelle est la température de la ferme","°C", 40));
        capteurs.add(new Capteur(2, "Anémomètre", "Sur le toit de la ferme", "Permet de savoir quelle est la vitesse du vent", "m/s", 100));

        for (Capteur ca : capteurs) {
            capt.add(new BlocCapt(ca), BorderLayout.CENTER);
        }

        container.add(title, BorderLayout.NORTH);
        container.add(capt, BorderLayout.CENTER);
        container.add(footer, BorderLayout.SOUTH);
    }


    class Commander implements ActionListener {
        public void actionPerformed(ActionEvent arg0){
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Article bien commandé !");
        }
    }


}

