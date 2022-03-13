package ferme;

import java.util.ArrayList;

public class Data {
    private static ArrayList<Capteur> capteurs = new ArrayList<>();

    public static ArrayList<Capteur> getCapteurList() {
        return capteurs;
    }

    public static Capteur getCapteur(int id) {
        return capteurs.get(id);
    }

    static {
        capteurs = new ArrayList<>();
        capteurs.add(new Capteur(1, "Capteur d'humidite", "Dans la ferme", "Permet de connaitre l'humiditéde l'air de la ferme.", "%", 100));
        capteurs.add(new Capteur(2, "Capteur du silo", "Dans le silo à grain", "Permet de savoir quel est le niveau des grains dans le silo", "%", 100));
        capteurs.add(new Capteur(2, "Capteur température", "Dans la ferme", "Permet de savoir quelle est la température de la ferme","°C", 40));
        capteurs.add(new Capteur(2, "Anémomètre", "Sur le toit de la ferme", "Permet de savoir quelle est la vitesse du vent", "km/h", 50));
    }
}
