import java.util.ArrayList;
import java.util.List;

public class Bloc extends Casa{
    private int nrApartamente = 0;
    private int nrEtaje = 0;
    private List<Apartament> listaDeApartamente= new ArrayList<Apartament>();


    public Bloc(int lungime, int latime, int inaltime){
        super(lungime,latime,inaltime);
        this.nrEtaje = inaltime/3;
    }

    public void setNrApartamente(int nrApartamente) {
        this.nrApartamente = nrApartamente;
    }

    public void setNrEtaje(int nrEtaje) {
        this.nrEtaje = nrEtaje;
    }

    public int getNrApartamente() {
        return nrApartamente;
    }

    public int getNrEtaje() {
        return nrEtaje;
    }

    public void setApartament(Apartament apartament){
        this.listaDeApartamente.add(apartament);
        this.nrApartamente++;
    }

    public Apartament getApartament(int numarulApartamentului){
        return this.listaDeApartamente.get(numarulApartamentului);
    }

    public String toString(){
        return super.toString() +
                ", nrApartamente=" + this.nrApartamente +
                ", nrEtaje=" + this.nrEtaje +
                this.listaDeApartamente;
    }
}
