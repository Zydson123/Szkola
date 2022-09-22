public class Uczen extends Osoba{
    private int nrUcznia;
    public static int liczbaUczniow;

    public Uczen(String imie, int wiek) {
        super(imie, wiek); //super - wywołanie konstruktoja klasy bazowej (w tym przypadku Osoba)
        liczbaUczniow++;
        this.nrUcznia = liczbaUczniow;

    }
}
