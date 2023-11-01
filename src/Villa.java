public class Villa extends Ejendom{
    private int antalRum;
    private int beboedeKvm;

   public Villa(int antalRum, int beboedeKvm, double pris){
        super(pris);
        this.antalRum = antalRum;
        this.beboedeKvm = beboedeKvm;

    }

    @Override
    public void udskriv() {
        System.out.println("Villa:");
        System.out.println("Antal værelser: " + antalRum);
        System.out.println("Beboedekvm: " + beboedeKvm);
        System.out.println("Pris: " + pris);
        System.out.println("Pris per kvadrat meter: " + prisprkvadrat());
    }

    @Override
    public double prisprkvadrat(){
        return pris / beboedeKvm;
    }
}
