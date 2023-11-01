abstract class Ejendom {
    protected double pris;

    public Ejendom(double pris) {
        this.pris = pris;
    }



    public abstract void udskriv();

    public abstract double prisprkvadrat();
}
