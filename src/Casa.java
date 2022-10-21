public class Casa extends Constructie{
    private int cost = 0;
    private int nrLocuitori = 0;
    private int nrCamere = 1;

    public Casa(int lungime, int latime, int inaltime){
        super(lungime,latime,inaltime);
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setNrLocuitori(int nrLocuitori) {
        this.nrLocuitori = nrLocuitori;
    }

    public int getCost() {
        return cost;
    }

    public int getNrLocuitori() {
        return nrLocuitori;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    @Override
    public String toString(){
        return super.toString()+
                ", cost="+this.cost +
                ", nrLocuitori="+this.nrLocuitori +
                ", nrCamere="+this.nrCamere;
    }
}
