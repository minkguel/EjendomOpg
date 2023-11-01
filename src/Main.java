import java.util.ArrayList;
public class Main {

    public static void main(String [] args) {
        ArrayList<Ejendom> ejendomme = new ArrayList<>();


        Villa villa1 = new Villa(4, 110, 100000);
        Butik butik1 = new Butik(200000, 70, 90);
        Etage etage1 = new Etage(65, 2, 250000);

        ejendomme.add(villa1);
        ejendomme.add(butik1);
        ejendomme.add(etage1);

        for (Ejendom ejendom : ejendomme) {
            ejendom.udskriv();
            System.out.println();
        }
    }
}
