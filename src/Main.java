import java.util.Arrays;
import java.util.Objects;

public class Main {

      public static int sumNUmber(int x){
          if(x>0)
              return x+ sumNUmber(x-1);
          else
              return 0;
      }


    public static int sum(int[] tab1, int[] tab2) {
          int sommeNombre=0;
          int incrementation=(int)Math.pow(10, tab1.length-1);
        for (int i = 0; i <tab1.length; i++) {
            sommeNombre+= Math.multiplyExact(tab1[i], incrementation);
            incrementation/=10;
        }

        incrementation=(int)Math.pow(10, tab2.length-1);
        for (int i = 0; i <tab2.length; i++) {
            sommeNombre+= Math.multiplyExact(tab2[i], incrementation);
            incrementation/=10;
        }
        return  sommeNombre;
    }

      public static double moyenne(double... number){
          double resultat=0;
          for (int i = 0; i < number.length; i++) {
              resultat+=number[i];
          }
          return resultat/2;
      }


    public static double max( double... number){

          double max=number[0];
        for (int i = 0; i < number.length; i++) {
            if(max< number[i])
                max= number[i];
        }

        return max;
    }

    public static String inverChaine(String chaine){
        String newStr = "";

        for(int i = chaine.length() -1; i >= 0; i--)
        {
            newStr +=  chaine.charAt(i)+ " ";
        }
        return newStr;
    }

    public static Double[][] multiply(Double[][] matA, Double[][] matB) {

        if (matA[0].length == matB.length) {
            Double[][] resultatMatrixe= new Double[matA.length][matB[0].length];
            for (int i = 0; i < resultatMatrixe.length; i++) {
                for (int j = 0; j < resultatMatrixe[i].length; j++) {
                    double somme = 0;
                    for (int n = 0; n < matA[i].length; n++) {
                        somme += matA[i][n] * matB[n][j];
                    }
                    resultatMatrixe[i][j] = somme;
                }
            }
            return  resultatMatrixe;
        }
        else
            return new Double[][] { { Double.NaN } };
    }


    public static float average(float[] tab) {
        float MoyenneTab=0f;
        for(int i=0; i<tab.length; i++){
            MoyenneTab+= tab[i];
        }
        return Math.floorDiv((long) MoyenneTab,tab.length);
    }

    public static float max(float... tab) {
        float valeurMax=tab[0];
        for(int i=0; i<tab.length; i++){
            if(valeurMax<tab[i])
                valeurMax=tab[i];
        }

        return valeurMax;
    }

    public static float min(float... tab) {
        float valeurMin=tab[0];
        for(int i=0; i<tab.length; i++){
            if(valeurMin>tab[i])
                valeurMin=tab[i];
        }
        return valeurMin;
    }


    public static void printMat(double[][] mat) {
        for (double[] row : mat) {
            System.out.print("[ ");
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {

        Double b=null;

    }


}