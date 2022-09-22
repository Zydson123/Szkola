public class Uczen extends Osoba{
    private int nrUcznia;
    public static int liczbaUczniow;

    public Uczen(String imie, int wiek) {
        super(imie, wiek); //super - wywołanie konstruktoja klasy bazowej (w tym przypadku Osoba)
        liczbaUczniow++;
        this.nrUcznia = liczbaUczniow;

    }

    @Override //override - zamienia toString z mormalnej javy do tego poniżej
    public String toString() {
        return "imie:" + getImie() +
                " wiek: " + getWiek() +
                " nrUcznia: " + nrUcznia;
    }

    public Uczen(int nrUcznia, String zmienna) {
        setImie(zmienna);
        this.nrUcznia = nrUcznia;
    }
}
