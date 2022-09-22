public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");

        //System.out.println(jas.getImie()); //nie można bo klasa osoba jest abstrakcyjna

        //klasy abstrakcyjne są po to żeby mięć zmienne dla każdej innej klasy odrazu

        //brak modyfikatora dostępu to pakiet - nie public

        //protected - to taki private ale nie tylko w ramach klasy tylko jeszcze z dodatkiem klas dziedziczących

        //w konstrutorze jeżeli chcesz użyc supera to super musi być w pierwszej linijce konstruktora inaczej będzie komiczna ilość błędów

        //System.out.println(jas);
        Uczen Janek = new Uczen("jas", 11);
        System.out.println(Janek);
        Nauczyciel wit1 = new wychowawca("Witold", 21, "zawodowe");
        System.out.println(wit1);
    }
}