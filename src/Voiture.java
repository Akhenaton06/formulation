public class Voiture  extends VehiculeAMoteur implements Videngeable{
    static int nbRoues=4;

    int nbPortes=5;
    TypeBoiteVitesse typeBoite;
    String couleur;
    int rapportCourant;

    Moteur moteur;




    Voiture(){
       super(new Moteur());
    }
    Voiture(int nbPortes){
        this();
        this.nbPortes=nbPortes;
        System.out.println("Une voiture est construite avec des portes");
    }
    Voiture(String couleur){
        this();
        this.couleur= couleur;
        System.out.println("Une voiture est construite avec une couleur");
    }
    Voiture(Moteur moteur){
        this();
    }
    Voiture(String carburation, int nbcylindre){
       this();
       moteur.carburation=carburation;
       moteur.nbCylindre= nbcylindre;
       this.moteur= moteur;
    }



    int accelerer(){
        System.out.println("J'accelère");
        return 100;
    }


    static void tourner(boolean droite, int angle){
        String droiteGauche= null;
        if(droite){
            droiteGauche="droite";
        }
        else {
            droiteGauche="gauche";
        }
        System.out.printf("Les %s roues de la voiture tournent à %s d'un angle de %d",nbRoues, droiteGauche, angle);
    }

    Ville transporter(Passager passager, Ville villeDeDepart, Ville... villeEtapes){
        System.out.println("La voiture  transporte un passager qui s'appelle "+ passager.nom +" "+ passager.prenom);
        System.out.println("Le passsager est parti de la ville de "+ villeDeDepart.nom);
        System.out.println("La premiere ville etape"+ villeEtapes[0].nom);
        System.out.println("La 3 ville etape "+ villeEtapes[2].nom);
        System.out.println("Il y a"+ villeEtapes.length+ " villes etapes");
        Ville villeDeDestination= new Ville();
        villeDeDestination.nom="Wellington";
        return villeDeDestination;
    }

    int passerRapport(boolean augmenter){
        if(augmenter){
            rapportCourant++;
        }
        else{
            rapportCourant--;
        }
          return rapportCourant;
    }



    void tourner (String droiteouGauche, int angle){
        System.out.println("La voiture va tourner à " + droiteouGauche+ " d'un angle de "+ angle);
    }


    @Override
    public void vidanger() {
        System.out.println("Deviser le bouchon sous la culasse et attendre que ça coule");
    }

    @Override
    void klaxonner() {
        System.out.println("TUtu!!");
    }
}
