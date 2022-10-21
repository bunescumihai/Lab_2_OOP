public class Apartament extends Casa{
    private int suprafata;
    private int nrBai = 1;
    private int nrApartamentului;
    private int nrEtaj;

    public Apartament(int lungime, int latime, int nrApartamentului, int nrEtaj){
        super(lungime, latime, 2);
        this.suprafata = lungime*latime;
        this.nrApartamentului = nrApartamentului;
        this.nrEtaj = nrEtaj;
    }

    public void setNrBai(int nrBai){
        this.nrBai = nrBai;
    }

    public int getNrBai(){
        return this.nrBai;
    }

    public int getSuprafata() {
        return suprafata;
    }

    @Override
    public void setLungime(int lungime){
        super.setLungime(lungime);
        this.suprafata = getLungime() * getLatime();
    }

    @Override
    public void setLatime(int latime){
        super.setLatime(latime);
        this.suprafata = getLungime()*getLatime();
    }

    public String toString(){
        return "\nApartamentul " + this.nrApartamentului + "{\n" + super.toString() +
                ", suprafata=" + this.suprafata +
                ", nrBai=" + this.nrBai +
                "\n}";
    }

}
