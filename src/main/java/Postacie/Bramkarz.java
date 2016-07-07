package Postacie;

import ObslugaKonsoli.Operacje;
import michal.rys.commons.ConsoleScannerSingleton;

/**
 * Created by Michal on 2016-07-06.
 */
public class Bramkarz extends Postac {

    public String nazwisko, imie, narodowosc, wiek, wzrost, waga, liczbaMeczy, liczbaKartek, liczbaMinut, liczbaStraconychBramek;
    public int numer;
    Operacje sterowanie = new Operacje();

    public Bramkarz(){

    }
    public Bramkarz(String nazwisko, String imie, String narodowosc, String wiek, String wzrost, String waga, String liczbaMeczy,
             String liczbaKartek, String liczbaMinut, String liczbaStraconychBramek)
    {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.narodowosc = narodowosc;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
        this.liczbaMeczy = liczbaMeczy;
        this.liczbaStraconychBramek = liczbaStraconychBramek;
        this.liczbaKartek = liczbaKartek;
        this.liczbaMinut = liczbaMinut;
    }
    public Bramkarz( Bramkarz bramkarz)
    {
        this.nazwisko = bramkarz.nazwisko;
        this.imie = bramkarz.imie;
        this.narodowosc = bramkarz.narodowosc;
        this.wiek = bramkarz.wiek;
        this.wzrost = bramkarz.wzrost;
        this.waga = bramkarz.waga;
        this.liczbaMeczy = bramkarz.liczbaMeczy;
        this.liczbaStraconychBramek = bramkarz.liczbaStraconychBramek;
        this.liczbaKartek = bramkarz.liczbaKartek;
        this.liczbaMinut = bramkarz.liczbaMinut;
    }
    @Override
    public void zapisz(){

        System.out.println();
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
        System.out.print("Podaj liczbe minut spedzonych na boisku: ");
        liczbaMinut = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Podaj liczbe kartek: ");
        liczbaKartek = ConsoleScannerSingleton.getConsoleScanner().nextLine();
        System.out.println();
        System.out.print("Podaj liczbe straconych bramek: ");
        liczbaStraconychBramek = ConsoleScannerSingleton.getConsoleScanner().nextLine();

        System.out.println();
        System.out.print("Dziekuje za uzupelnienie informaci :)");
        sterowanie.wcisnijKlawisz();
        sterowanie.czyszczenie();

    }
    @Override
    public void wypisz(){
        System.out.println();
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Narodowosc: " + narodowosc);
        System.out.println("Wiek: " + wiek);
        System.out.println("wzrost: " + wzrost);
        System.out.println("Waga: " + waga);
        System.out.println("Liczba Meczy: " + liczbaMeczy);
        System.out.println("Liczba Minut: " + liczbaMinut);
        System.out.println("Liczba Straconych Bramek: " + liczbaStraconychBramek);
        System.out.println("Liczba Kartek: " + liczbaKartek);
        System.out.println();
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
            System.out.println("8.Zwyciestwa: " + liczbaKartek);
            System.out.println("9.Remisy: " + liczbaMinut);
            System.out.println("10.Porazki: " + liczbaStraconychBramek);
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
                    System.out.print("Popraw liczbe  Kartek: ");
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
                    System.out.print("Popraw liczbe Straconych Bramek: ");
                    liczbaStraconychBramek = ConsoleScannerSingleton.getConsoleScanner().nextLine();
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
       System.out.println(imie + "	" + nazwisko);
    }
}
