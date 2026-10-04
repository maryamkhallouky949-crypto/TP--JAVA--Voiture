
public class Voiture {

    private String marque;
    private String modele;
    private double vitesse;
    private int annee;



public Voiture() {
 this.marque = "Inconnue";
 this.modele = "Standard";
 this.vitesse = 0.0;
 this.annee = 2024;
}
public Voiture(String marque, String modele, double vitesse, int annee) {
  this.marque = marque;
  this.modele = modele;
  this.vitesse = vitesse;
  this.annee = annee;
}
public Voiture(Voiture autreVoiture) {
   this.marque = autreVoiture.marque;
   this.modele = autreVoiture.modele;
   this.vitesse = autreVoiture.vitesse;
   this.annee = autreVoiture.annee;
}
public String getMarque() {
    return marque;
}

public String getModele() {
    return modele;
}

public double getVitesse() {
    return vitesse;
}

public int getAnnee() {
    return annee;

}
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void accelerer(double augmentation) {

        if (augmentation > 0) {
            this.vitesse += augmentation;

            System.out.println("Nouvelle vitesse : " + vitesse + " km/h");

        } else {
            System.out.println("Erreur : l'augmentation doit être positive.");
        }
    }
    public void freiner(double reduction) {

        if (reduction > 0) {

            if (this.vitesse - reduction < 0) {
                this.vitesse = 0;
            } else {
                this.vitesse -= reduction;
            }

            System.out.println("Nouvelle vitesse : " + vitesse + " km/h");

        } else {
            System.out.println("Erreur : la réduction doit être positive.");
        }
    }
    
    public void afficherInformations() {

        System.out.println("Informations de la voiture");
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Vitesse : " + vitesse + " km/h");
        System.out.println("Année : " + annee);
    }
    
    
    
    
}






