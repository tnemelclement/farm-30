package ferme;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


public class AppMain {
    public static void main(String[] args) {
        //Ecrans ecrans = new Ecrans();
        Fenetre fen = new Fenetre();
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


        for (Capteur ca : capteurs) {
            capt.add(new BlocCapt(ca), BorderLayout.CENTER);
        }


    }


    class Commander implements ActionListener {
        public void actionPerformed(ActionEvent arg0){
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Article bien commandé !");
        }
    }


}

