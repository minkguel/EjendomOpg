public class Etage extends Ejendom {

    private int beboelsesAreal;
    private int etager;


    public Etage(int beboelsesAreal, int etager, int pris){
        super(pris);
        this.beboelsesAreal = beboelsesAreal;
        this.etager = etager;

    }

    @Override
    public void udskriv() {
        System.out.println("Etage:");
        System.out.println("Beboelses Areal: " + beboelsesAreal);
        System.out.println("Etager: " + etager);
        System.out.println("Pris: " + pris);
        System.out.println("Pris per kvadrat meter: " + prisprkvadrat());
    }

    @Override
    public double prisprkvadrat(){
        return pris / beboelsesAreal;
    }
}
