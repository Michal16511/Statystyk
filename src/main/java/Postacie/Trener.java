package Postacie;
import ObslugaKonsoli.*;
import michal.rys.commons.ConsoleScannerSingleton;

/**
 * Created by Michal on 2016-07-06.
 */
public class Trener extends Postac {

    public String nazwisko, imie, narodowosc, wiek, wzrost, waga, liczbaMeczy, meczeWygrane, meczePrzegrane, meczeZremisowane;
    Operacje sterowanie = new Operacje();
    public int numer;

    public Trener(String nazwisko, String imie, String narodowosc,
           String wiek, String wzrost, String waga, String liczbaMeczy, String meczeWygrane,
           String meczePrzegrane, String meczeZremisowane) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.narodowosc = narodowosc;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
        this.liczbaMeczy = liczbaMeczy;
        this.meczeWygrane = meczeWygrane;
        this.meczePrzegrane = meczePrzegrane;
        this.meczeZremisowane = meczeZremisowane;
    }
    public Trener() {

    }

    public Trener(Trener trener) {
        this.nazwisko = trener.nazwisko;
        this.imie = trener.imie;
        this.narodowosc = trener.narodowosc;
        this.wiek = trener.wiek;
        this.wzrost = trener.wzrost;
        this.waga = trener.waga;
        this.liczbaMeczy = trener.liczbaMeczy;
        this.meczeWygrane = trener.meczeWygrane;
        this.meczePrzegrane = trener.meczePrzegrane;
        this.meczeZremisowane = trener.meczeZremisowane;
    }

    @Override
    public void zapisz() {

        System.out.print("Podaj Imie: ");
        imie = ConsoleScannerSingleton.getConsoleScanner().nextLine();
        System.out.println();
        System.out.print("Podaj Nazwisko: ");
        nazwisko = ConsoleScannerSingleton.getConsoleScanner().nextLine();
        System.out.println();
        System.out.print("Podaj Narodowosc: ");
        narodowosc = ConsoleScannerSingleton.getConsoleScanner().nextLine();
        System.out.println();
        System.out.print("Podaj Wiek: ");
        wiek = ConsoleScannerSingleton.getConsoleScanner().nextLine();
        System.out.println();
        System.out.print("Podaj wzrost: ");
        wzrost = ConsoleScannerSingleton.getConsoleScanner().nextLine();
        System.out.println();
        System.out.print("Podaj Wage: ");
        waga = ConsoleScannerSingleton.getConsoleScanner().nextLine();
        System.out.println();
        System.out.print("Podaj Liczbe Meczy: ");
        liczbaMeczy = ConsoleScannerSingleton.getConsoleScanner().nextLine();
        System.out.println();
        System.out.print("Podaj Liczbe Meczy Wygranych: ");
        meczeWygrane = ConsoleScannerSingleton.getConsoleScanner().nextLine();
        System.out.println();
        System.out.print("Podaj Liczbe Meczy Zremisowanych: ");
        meczeZremisowane = ConsoleScannerSingleton.getConsoleScanner().nextLine();
        System.out.println();
        System.out.print("Podaj Liczbe Meczy Przegranych: ");
        meczePrzegrane = ConsoleScannerSingleton.getConsoleScanner().nextLine();
        System.out.println();
        System.out.println("Dziekuje za uzupelnienie informacji :)");
        sterowanie.wcisnijKlawisz();
        sterowanie.czyszczenie();
    }

    @Override
    public void wypisz() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Narodowosc: " + narodowosc);
        System.out.println("Wiek: " + wiek);
        System.out.println("Wzrost: " + wzrost);
        System.out.println("Waga: " + waga);
        System.out.println("Liczba Meczy: " + liczbaMeczy);
        System.out.println("Liczba Meczy Wygranych: " + meczeWygrane);
        System.out.println("Liczba Meczy Zremisowanych: " + meczeZremisowane);
        System.out.println("Liczba Meczy Przegranych: " + meczePrzegrane);
        sterowanie.wcisnijKlawisz();
        sterowanie.czyszczenie();

    }

    @Override
    public void zmiana() {
        do {
            System.out.println("Wybierz numer kategorii do zmiany: ");
            System.out.println("1.Imie: " + imie);
            System.out.println("2.Nazwisko: " + nazwisko);
            System.out.println("3.Narodowosc: " + narodowosc);
            System.out.println("4.Wiek: " + wiek);
            System.out.println("5.wzrost: " + wzrost);
            System.out.println("6.Waga: " + waga);
            System.out.println("7.Liczba Meczy: " + liczbaMeczy);
            System.out.println("8.Zwyciestwa: " + meczeWygrane);
            System.out.println("9.Remisy: " + meczeZremisowane);
            System.out.println("10.Porazki: " + meczePrzegrane);
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
                    System.out.print("Popraw liczbe zwyciestw: ");
                    meczeWygrane = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;
                case 9:
                    System.out.println();
                    System.out.print("Popraw liczbe remisow: ");
                    meczeZremisowane = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;
                case 10:
                    System.out.println();
                    System.out.print("Popraw liczbe porazek: ");
                    meczePrzegrane = ConsoleScannerSingleton.getConsoleScanner().nextLine();
                    sterowanie.czyszczenie();
                    break;
                case 11:

                    sterowanie.czyszczenie();
                    break;
            }
        } while (numer != 11);
    }

    @Override
    public void wypiszNazwisko() {
        System.out.println(imie + " " + nazwisko);
    }
}