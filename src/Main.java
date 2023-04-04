import java.util.*;

public class Main {

    public enum CodeMorse{
        E(" . "),O(" - - - "),S(" . . . "),T(" - "),W(" . - - ");
        private String nom;
        public String getNom(){
            return this.nom;
        }

        CodeMorse(String nom){
            this.nom=nom;
        }
    }

    public static void main(String... args) {


/*
       int [][] tableauEntier= new int[5][3];
       int temps;
        for (int lignes = 0; lignes < tableauEntier.length; lignes++) {
            temps=lignes;
            System.out.print("[ ");
            for (int col = 0; col < tableauEntier[lignes].length; col++) {
                tableauEntier[lignes][col]=temps++;
                System.out.print(tableauEntier[lignes][col]+ " ");
            }
            System.out.println("]");
        }


 */


/*

        String input="{}{}{{{}}";
        boolean resultat=false;
        int variableDeComparaison=0;
               for(int i=0; i<input.length(); i++){
                   if(input.charAt(i)== '{'){
                       variableDeComparaison++;
                   }
                   else {
                       variableDeComparaison--;
                       if (variableDeComparaison == 0) {
                           resultat = true;
                       }
                       else if(variableDeComparaison<=1){
                           variableDeComparaison=0;
                           resultat=false;
                       }
                   }
               }
       // System.out.println(resultat== true ? true: false);

               int[]a={1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
*/
/*
        String[] chaine12= new String[]{"..."};
        String chaine14= Arrays.toString(chaine12);
        String recompense= chaine14.substring(1, chaine14.length()-1);





        int sommeDesNombres=0;
        int variableDeMultiplication=1;
        int [] chaineTableau= new int[recompense.length()];
        for (int i = 0; i < chaineTableau.length; i++) {
            chaineTableau[i]=  Integer.parseInt(String.valueOf(recompense.charAt(i)));
        }
        for (int i = 0; i < chaineTableau.length; i++) {
            sommeDesNombres+= (chaineTableau[i]*variableDeMultiplication);
            variableDeMultiplication++;
        }
        System.out.println(sommeDesNombres%10);


 */

/*

        String[] nouveauTableauEnString= new String[]{"5"};
        String chaine14= Arrays.toString(nouveauTableauEnString);
        String recompense= chaine14.substring(1, chaine14.length()-1);
        int valeurDuTableau= Integer.parseInt(recompense);


        int[] tableauElementDesNombres= new int[valeurDuTableau];
        for (int i = 0; i < tableauElementDesNombres.length; i++) {
            tableauElementDesNombres[i]= i+1;

        }
         nouveauTableauEnString= new String[tableauElementDesNombres.length];
        for (int i = 0; i < nouveauTableauEnString.length; i++) {
            nouveauTableauEnString[i]= String.valueOf(tableauElementDesNombres[i]);
        }

        for (int i = 0; i < nouveauTableauEnString.length; i++) {
            if(tableauElementDesNombres[i]%3==0 && tableauElementDesNombres[i]%5==0)
                nouveauTableauEnString[i]= "FizzBuzz";
            else if(tableauElementDesNombres[i]%5==0)
                nouveauTableauEnString[i]= "Buzz";
            else if (tableauElementDesNombres[i]%3==0)
                nouveauTableauEnString[i]="Fizz";
        }

       String bb= Arrays.toString(nouveauTableauEnString);

        nouveauTableauEnString = new String[]{bb.substring(1,bb.length()-1)};

        for (String afficheTableau: nouveauTableauEnString
             ) {

            System.out.print(afficheTableau);

        }
*/
/*
        String[] chaine12= new String[]{"}"};
        String chaine14= Arrays.toString(chaine12);
        String recompense= chaine14.substring(1, chaine14.length()-1);
        try {
            if(!chaine14.startsWith("}")){

            }
        } catch (IllegalArgumentException exception){
            System.out.println("exception.toString()");

        }
*/
        /*

        String recompense="RILKE";
        String resultat="";
        boolean validationExistence=false;
        for (int i = 0; i < recompense.length(); i++) {

            for (CodeMorse code: CodeMorse.values()
            ) {
                try {
                    if(CodeMorse.valueOf(String.valueOf(recompense.charAt(i))).equals(code))
                        validationExistence= true;
                }catch (IllegalArgumentException ex){
                    validationExistence=false;
                    break;
                }


            }
            if(validationExistence){
                switch (CodeMorse.valueOf(String.valueOf(recompense.charAt(i)))){
                    case E:
                        resultat+= CodeMorse.E.getNom();
                        break;
                    case O:
                        resultat+=CodeMorse.O.getNom();
                        break;
                    case S:
                        resultat+=CodeMorse.S.getNom();
                        break;
                    case T:
                        resultat+= CodeMorse.T.getNom();
                        break;
                    case W:
                        resultat+= CodeMorse.W.getNom();
                        break;
                }
            }
            else {
                resultat+="?";
            }
        }
        System.out.println(resultat);

*/

/*
        TypeBoiteVitesse vitesse= TypeBoiteVitesse.AUTO;
        if(vitesse== TypeBoiteVitesse.AUTO){
            System.out.println("Bingo");
        }
      Voiture peugeot206= new Voiture();
      peugeot206.typeBoite= TypeBoiteVitesse.AUTO;

        System.out.println("le type de ma boite a vitesse est  "+ peugeot206.typeBoite.nomTypeBoite);
        System.out.println(peugeot206.typeBoite.ordinal());
        TypeBoiteVitesse semiAuto= TypeBoiteVitesse.valueOf("SEMI_AUTO");
        //recuperer l'element de l'enum par son nom de caractère
        System.out.println("La boite récupperer par le biais de la chaine de caractère est: " + semiAuto.nomTypeBoite);


 */

        /*
       VehiculeAMoteur voitureDeMichel= new Voiture("jaune",3);

       //Voiture voitureDeMichelSousFormeDeVoiture= (Voiture) voitureDeMichel;
        ((Voiture)voitureDeMichel).automatique=true;





        Moteur moteur= new Moteur();
        moteur.carburation="Diesel";
        moteur.nbCylindre=6;
        Voiture voitureDeJerome= new Voiture(moteur);

        System.out.println("Le nombre de cylindre de la coiture de jérôme est "+ voitureDeJerome.moteur.nbCylindre);
        Passager passager= new Passager();
        passager.nom="DUpont";
        passager.prenom="Vincent";
        ville auckland= new ville();
        auckland.nom="Auckland";
       ville destination= voitureDeMichel.transporter(passager, auckland);

        System.out.println("Le passager est arrive dans la ville de "+ destination.nom);
        System.out.println("Le nombre de roues d'un voiture en général est "+ ((Voiture)voitureDeMichel).nbRoues);
        Voiture.klaxonner();
        Voiture.tourner(false, 45);
         */
        //UsineDAssemblageVoiture ua= new UsineDAssemblageVoiture();
        //Voiture v= ua.assemble();


        Voiture peugeot206= new Voiture();
        peugeot206.couleur="rouge";

        Voiture peugeot207= new Voiture();
        peugeot207.couleur="Noire";

        Passager passager= new Passager();
        passager.nom="Dupond";
        passager.prenom="Michel";
        Ville depart= new Ville();
        depart.nom="Auckland";
        Ville etape1= new Ville();
        etape1.nom="Hamilton";
        Ville etape2= new Ville();
        etape2.nom="Taupe";
        Ville etape3= new Ville();
        etape3.nom="Wellington";


       // peugeot206.transporter(passager, depart, etape1,etape2,etape3);
       /* for (Voiture voiture: set) {
            System.out.println(voiture.couleur);
        }
*/

        Map<String, Voiture> map= new HashMap();
        map.put("206", peugeot206);
        map.put("207", peugeot207);

        Voiture v = map.get("207");

        //valeur que peut contenir dans un tabeau
        System.out.println(map.containsKey("207"));
        System.out.println(map.containsValue(peugeot206));

        for (Map.Entry<String, Voiture> entry : map.entrySet()) {
            String key= entry.getKey();
            Voiture value= entry.getValue();

            System.out.println("L'element suivant a une cle "+ key+" il s'agit d'une voiture de couleur "+ value.couleur);
        }

        //afficher juste les clés dans un map

        String key="206";
        for (String entry : map.keySet()) {
            if(entry.equals(key)) {
                System.out.println("La clé:"+ key+" est bel et bien dans la collection");
            }

        }

        //afficher juste les valeurs dans un map

        for (Voiture value : map.values()) {

            System.out.println("L'element suivant est une voiture de couleur "+ value.couleur);
        }

        List<String> list= new ArrayList();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Collections.replaceAll(list, "Two", "2");
        for (Object o: list) {
            System.out.println(o);
        }
        Set<Voiture> set= new HashSet();
        set.add(peugeot206);
        set.add(peugeot207);
        Iterator<Voiture> it= set.iterator();

        //hasNext permet d'afficher tant qu'il ya les objets dans la liste
        /*while (it.hasNext()){
            Voiture v= it.next();
            System.out.println(v.couleur);

        }
*/
        System.out.println(set.isEmpty());
        // System.out.println(set.size());
        //reccuperer l'index dans un set, mais les sets ajoutent en désordre
       // Voiture o=(Voiture) set.toArray()[1];
       // System.out.println("La voiture à l'index 2 est de couleur "+ o.couleur);



    }
}