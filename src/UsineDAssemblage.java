public class UsineDAssemblage {

    VehiculeAMoteur assemble(){
        Moteur moteur= new Moteur();
        VehiculeAMoteur vam= new Voiture(moteur);
        return vam;
    }


}
