public abstract class VehiculeAMoteur extends  Vehicule{
    int vitesse;
    Moteur moteur;



    VehiculeAMoteur(Moteur moteur){
        this.moteur=moteur;
        System.out.println("Une voiture est construite sans paramètre");
    }

    int accelerer(int vitesseEnPLus){
        System.out.println("J'accelère");
        return this.vitesse+= vitesseEnPLus;
    }

    Ville transporter(Passager passager, Ville villeDeDepart){
        System.out.println("Le vehicule  transporte un passager qui s'appelle "+ passager.nom +" "+ passager.prenom);
        System.out.println("Le passsager est parti de la ville de "+ villeDeDepart.nom);
        Ville villeDeDestination= new Ville();
        villeDeDestination.nom="Wellington";
        return villeDeDestination;
    }
}
