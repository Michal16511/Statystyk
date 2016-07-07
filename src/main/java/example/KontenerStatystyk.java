package example;
import ObslugaKonsoli.Operacje;
import Postacie.*;
import michal.rys.commons.ConsoleScannerSingleton;

import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
/**
 * Created by Michal on 2016-07-06.
 */
public class KontenerStatystyk {
    Operacje sterowanie = new Operacje();
    private int opcja, ilosc, iteratorPetli;
    private String linia, bierzacaLinia;
    Zawodnik zawodnik;
    Bramkarz bramkarz;
    Trener trener;
    Postac postac;
    LinkedList <Postac> listaZawodnikow = new LinkedList<Postac>();
    Iterator wskaznik = listaZawodnikow.iterator( );

    KontenerStatystyk(){

    }
    public void dodajZawodnika(){

        System.out.println("Wybierz postac do dodania, do naszej listy: ");
        System.out.println("1.Dodaj Trenera: ");
        System.out.println("2.Dodaj Bramkarza: ");
        System.out.println("3.Dodaj Zawodnika: ");
        System.out.println("4.Wroc do menu glownego: ");
        System.out.println();
        opcja = ConsoleScannerSingleton.getConsoleScanner().nextInt();

        switch (opcja)
        {
            case 1:
                //trener;
                listaZawodnikow.add(new Trener());
                listaZawodnikow.getLast().zapisz();
                sterowanie.czyszczenie();
                break;

            case 2:
                //bramkarz;
                listaZawodnikow.add(new Bramkarz());
                listaZawodnikow.getLast().zapisz();
                sterowanie.czyszczenie();
                break;

            case 3:
                //zawodnik;
                listaZawodnikow.add(new Zawodnik());
                listaZawodnikow.getLast().zapisz();
                sterowanie.czyszczenie();
                break;
            case 4:
                sterowanie.czyszczenie();
                break;
        }
    }
    public void usunZawodnika(){
        ilosc = listaZawodnikow.size();
        if (ilosc == 0)
        {
            System.out.println("Lista zawodnikow naszej druzyny jest pusta.");
            sterowanie.wcisnijKlawisz();
            sterowanie.czyszczenie();
        }
        else
        {
            System.out.println();
            for( int numer = 0; numer < listaZawodnikow.size(); numer++){
                System.out.print( (numer+1) + ". "); listaZawodnikow.get(numer).wypiszNazwisko();
            }
            System.out.println();
            System.out.println("Wybierz numer zawodnika do usuniecia: ");
            System.out.print("Wpisz 0, by wrocic do menu glownego. ");
            opcja = ConsoleScannerSingleton.getConsoleScanner().nextInt();

            if (opcja != 0)
            {
                listaZawodnikow.remove((opcja-1));
                System.out.println("\n");
                System.out.print("Zawodnik zostal usuniety z listy. ");
                sterowanie.wcisnijKlawisz();
                sterowanie.czyszczenie();
            }
            sterowanie.czyszczenie();
        }
    }
    public void wypiszZawodnikow() {
        ilosc = listaZawodnikow.size();
        if (ilosc == 0) {
            System.out.println("Lista zawodnikow naszej druzyny jest pusta.");
            sterowanie.wcisnijKlawisz();
            sterowanie.czyszczenie();
        } else {
            System.out.println();
            for (int numer = 0; numer < listaZawodnikow.size(); numer++) {
                System.out.print((numer + 1) + ". ");
                listaZawodnikow.get(numer).wypiszNazwisko();
            }
            System.out.println();
            sterowanie.wcisnijKlawisz();
        }
    }
    public int wypiszZawodnikow2() {
        ilosc = listaZawodnikow.size();
        if (ilosc == 0) {
            System.out.println("Lista zawodnikow naszej druzyny jest pusta.");
            sterowanie.wcisnijKlawisz();
            sterowanie.czyszczenie();
        } else {
            System.out.println();
            for (int numer = 0; numer < listaZawodnikow.size(); numer++) {
                System.out.print((numer + 1) + ". ");
                listaZawodnikow.get(numer).wypiszNazwisko();
            }
            System.out.println();
        }
        return ilosc;
    }
    public void zmienDane(){
        int liczba = wypiszZawodnikow2();
        if(liczba!=0) {
            System.out.println("Wpisz 0, by wrocic do menu glownego. ");
            System.out.println();
            System.out.print("Podaj numer postaci do zmiany danych: ");
            opcja = ConsoleScannerSingleton.getConsoleScanner().nextInt();
            sterowanie.czyszczenie();

            if (opcja != 0) {
                listaZawodnikow.get((opcja - 1)).zmiana();
                System.out.print("Poprawa statystyk powiodla sie :)");
                sterowanie.wcisnijKlawisz();
            }
        }
        sterowanie.czyszczenie();
    }
    public void wypiszDane(){
        ilosc = wypiszZawodnikow2();
        if (ilosc != 0)
        {
            System.out.println();
            System.out.println("Wpisz 0, by wrocic do menu glownego. \n");
            System.out.print("Podaj numer postaci do wypisania statystyk: ");
            opcja = ConsoleScannerSingleton.getConsoleScanner().nextInt();

            if (opcja != 0)
            {
                sterowanie.czyszczenie();
                listaZawodnikow.get(opcja-1).wypisz();
            }
        }
        sterowanie.czyszczenie();
    }
    public void dodajKilkuZawodnikow(){
        do {
            System.out.println("Wybierz postac do dodania, do naszej listy: ");
            System.out.println("1.Dodaj Trenera: ");
            System.out.println("2.Dodaj Bramkarza: ");
            System.out.println("3.Dodaj Zawodnika: ");
            System.out.println("4.Zakoncz dodawanie zawodnikow: ");
            System.out.println();
            opcja = ConsoleScannerSingleton.getConsoleScanner().nextInt();

            switch (opcja) {
                case 1:
                    //trener;
                    listaZawodnikow.add(new Trener());
                    listaZawodnikow.getLast().zapisz();
                    sterowanie.czyszczenie();
                    break;

                case 2:
                    //bramkarz;
                    listaZawodnikow.add(new Bramkarz());
                    listaZawodnikow.getLast().zapisz();
                    sterowanie.czyszczenie();
                    break;

                case 3:
                    //zawodnik;
                    listaZawodnikow.add(new Zawodnik());
                    listaZawodnikow.getLast().zapisz();
                    sterowanie.czyszczenie();
                    break;
                case 4:
                    sterowanie.czyszczenie();
                    break;
            }
        }while(opcja!=4);
    }
    public void usunWszystkich(){
        listaZawodnikow.clear();
        System.out.println("Lista zawodnikow zostala wyczyszczona :)");
        sterowanie.wcisnijKlawisz();
    }
}
