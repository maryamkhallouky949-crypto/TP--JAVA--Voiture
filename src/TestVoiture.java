
public class TestVoiture {

    public static void main(String[] args) {

        Voiture voiture1 = new Voiture();

        Voiture voiture2 = new Voiture(
            "Toyota",
            "Corolla",
            0,
            2023
        );

        Voiture voiture3 = new Voiture(voiture2);

        voiture1.afficherInformations();

        voiture2.afficherInformations();

        voiture3.afficherInformations();

        voiture2.accelerer(120);

        voiture2.freiner(30);

        voiture2.afficherInformations();
    }
}