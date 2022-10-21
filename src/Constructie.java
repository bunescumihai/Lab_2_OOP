public class Constructie {
    private int lungime;
    private int latime;
    private int inaltime;
    private int nrUsi = 0;
    private int nrFerestre = 0;

    public Constructie(int lungime, int latime, int inaltime) {
        this.inaltime = inaltime;
        this.lungime = lungime;
        this.latime = latime;
    }

    public void distrugeConstructie(){
        this.latime = 0;
        this.lungime = 0;
        this.inaltime = 0;
    }

    public void setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
    }

    public void setNrFerestre(int nrFerestre) {
        this.nrFerestre = nrFerestre;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public int getNrFerestre() {
        return nrFerestre;
    }

    public int getLungime() {
        return this.lungime;
    }

    public int getLatime() {
        return this.latime;
    }

    public int getInaltime() {
        return this.inaltime;
    }

    @Override
    public String toString(){
        return "lungime=" + this.lungime +
                ", latime=" + this.latime +
                ", inaltime=" + this.inaltime +
                ", nrUsi=" + this.nrUsi +
                ", nrFerestre=" + this.nrFerestre;
    }
}
