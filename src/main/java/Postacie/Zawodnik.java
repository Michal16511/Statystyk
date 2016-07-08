package Postacie;
import ObslugaKonsoli.Operacje;
import michal.rys.commons.ConsoleScannerSingleton;

/**
 * Created by Michal on 2016-07-06.
 */
public class Zawodnik extends Postac {
    public String nazwisko, imie, narodowosc, wiek, wzrost, waga, liczbaMeczy, liczbaKartek, liczbaMinut, liczbaGoli;
    Operacje sterowanie = new Operacje();
    public int numer;

    public Zawodnik(){

    }
    public Zawodnik(String nazwisko, String imie, String narodowosc, String wiek, String wzrost, String waga, String liczbaMeczy,
             String liczbaKartek, String liczbaMinut, String liczbaGoli)
    {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.narodowosc = narodowosc;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
        this.liczbaMeczy = liczbaMeczy;
        this.liczbaGoli = liczbaGoli;
        this.liczbaKartek = liczbaKartek;
        this.liczbaMinut = liczbaMinut;
    }
    public Zawodnik( Zawodnik zawodnik)
    {
        this.nazwisko = zawodnik.nazwisko;
        this.imie = zawodnik.imie;
        this.narodowosc = zawodnik.narodowosc;
        this.wiek = zawodnik.wiek;
        this.wzrost = zawodnik.wzrost;
        this.waga = zawodnik.waga;
        this.liczbaMeczy = zawodnik.liczbaMeczy;
        this.liczbaGoli = zawodnik.liczbaGoli;
        this.liczbaKartek = zawodnik.liczbaKartek;
        this.liczbaMinut = zawodnik.liczbaMinut;
    }
    @Override
    public void zapisz(){
        System.out.println();
        System.out.print("Podaj imie: "); imie = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Podaj Nazwisko: "); nazwisko = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Podaj narodowosc: "); narodowosc = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Podaj wiek: "); wiek = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Podaj wzrost: "); wzrost = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Podaj wage: "); waga = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Podaj liczbe meczy: "); liczbaMeczy = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Podaj liczbe minut spedzonych na boisku: "); liczbaMinut = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Podaj liczbe kartek: "); liczbaKartek = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Podaj liczbe bramek: "); liczbaGoli = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Dziekuje za uzupelnienie informacji :)");

        sterowanie.wcisnijKlawisz();
        sterowanie.czyszczenie();
    }
    @Override
    public void wypisz(){
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Narodowosc: " + narodowosc);
        System.out.println("Wiek: " + wiek);
        System.out.println("Wzrost: " + wzrost);
        System.out.println("Waga: " + waga);
        System.out.println("Liczba Meczy: " + liczbaMeczy);
        System.out.println("Liczba Kartek: " + liczbaKartek);
        System.out.println("Liczba Minut: " + liczbaMinut);
        System.out.println("Liczba Bramek: " + liczbaGoli);
        sterowanie.wcisnijKlawisz();
        sterowanie.czyszczenie();

    }
    @Override
    public void zmiana(){
        do {
            System.out.println("Wybierz numer kategorii do zmiany: ");
            System.out.println("1.Imie: " + imie);
            System.out.println("2.Nazwisko: " + nazwisko);
            System.out.println("3.Narodowosc: " + narodowosc);
            System.out.println("4.Wiek: " + wiek);
            System.out.println("5.wzrost: " + wzrost);
            System.out.println("6.Waga: " + waga);
            System.out.println("7.Liczba Meczy: " + liczbaMeczy);
            System.out.println("8.Liczba Kartek: " + liczbaKartek);
            System.out.println("9.Liczba Minut: " + liczbaMinut);
            System.out.println("10.Liczba Bramek: " + liczbaGoli);
            System.out.println("11.Zatwierdz zmiany i wroc do menu glownego: ");
            System.out.println();

            numer = ConsoleScannerSingleton.getConsoleScanner().nextInt();
            switch (numer) {
                case 1:
                    System.out.println();
                    System.out.print("Popraw imie: ");
                    imie = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;

                case 2:
                    System.out.println();
                    System.out.print("Popraw nazwisko: ");
                    nazwisko = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    ;
                    sterowanie.czyszczenie();
                    break;

                case 3:
                    System.out.println();
                    System.out.print("Popraw narodowosc: ");
                    narodowosc = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;

                case 4:
                    System.out.println();
                    System.out.print("Popraw wiek: ");
                    wiek = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;

                case 5:
                    System.out.println();
                    System.out.print("Popraw wzrost: ");
                    wzrost = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;

                case 6:
                    System.out.println();
                    System.out.print("Popraw wage: ");
                    waga = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;

                case 7:
                    System.out.println();
                    System.out.print("Popraw liczbe meczy: ");
                    liczbaMeczy = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;
                case 8:
                    System.out.println();
                    System.out.print("Popraw liczbe Kartek: ");
                    liczbaKartek = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;
                case 9:
                    System.out.println();
                    System.out.print("Popraw liczbe Minut: ");
                    liczbaMinut = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;
                case 10:
                    System.out.println();
                    System.out.print("Popraw liczbe Bramek: ");
                    liczbaGoli = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;
                case 11:

                    sterowanie.czyszczenie();
                    break;
            }
        } while (numer != 11);
    }
    @Override
    public void wypiszNazwisko(){
        System.out.println(imie + " " + nazwisko);
    }
}
