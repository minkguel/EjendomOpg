public class Butik extends Ejendom {
    private int beboelsesAreal;
    private int butiksAreal;



    public Butik(double pris, int beboelsesAreal, int butiksAreal) {
        super(pris);
        this.beboelsesAreal = beboelsesAreal;
        this.butiksAreal = butiksAreal;

    }

    @Override
    public void udskriv() {
        System.out.println("Butik:");
        System.out.println("BeboelsesAreal: " + beboelsesAreal);
        System.out.println("ButiksAreal: " + butiksAreal);
        System.out.println("Pris: " + pris);
        System.out.println("Pris per kvadrat meter:" + prisprkvadrat());
    }

    @Override
    public double prisprkvadrat(){
        return pris / (beboelsesAreal + butiksAreal);
    }
}
