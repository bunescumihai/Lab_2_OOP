public class Main {
    public static void main(String[] args) {
        Bloc bloc = new Bloc(60,30,35);
        System.out.println(bloc.toString());

        bloc.setApartament(new Apartament(8,8,0, 1));
        bloc.setApartament(new Apartament(8,8,1, 1));
        bloc.setApartament(new Apartament(8,8,2, 1));
        bloc.setApartament(new Apartament(8,8,3, 1));
        System.out.println(bloc.toString());

        Apartament apartament = bloc.getApartament(0);
        apartament.setNrFerestre(5);
        apartament.setNrCamere(3);
        apartament.setNrBai(2);
        apartament.setLatime(9);
        apartament.setLungime(10);
        apartament.setNrLocuitori(5);
        System.out.println("\n\n" + bloc.toString());

        Casa casaMea = new Casa(20,7,5);
        casaMea.setCost(20000);
        casaMea.setNrCamere(4);
        casaMea.setNrLocuitori(5);
        casaMea.setNrUsi(9);
        casaMea.setNrFerestre(10);
        System.out.println("Casa mea are :\n" + casaMea.toString());

    }
}