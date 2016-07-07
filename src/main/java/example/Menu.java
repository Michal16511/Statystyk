package example;
import ObslugaKonsoli.*;
import michal.rys.commons.ConsoleScannerSingleton;

/**
 * Created by Michal on 2016-06-13.
 */
public class Menu extends KontenerStatystyk {
    Operacje sterowanie = new Operacje();


    public void wybierzOpcje(){


        int opcja;
        do {
            System.out.println("\nWitam w menu statystyk naszej druzyny. :)" +
                    "\n-------------------------------------------" +
                    "\n1.Wyswietl liste zawodnikow: " +
                    "\n2.Dodaj zawodnika:" +
                    "\n3.Usun zawodnika:" +
                    "\n4.Zmien dane wybranego zawodnika:" +
                    "\n5.Wypisz dane wybranego zawodnika:" +
                    "\n6.Dodaj kilku zawodnikow." +
                    "\n7.Usun wszystkie postacie z listy:" +
                    "\n8.Koniec programu" +
                    "\n------------------------------------------- ");
            opcja = ConsoleScannerSingleton.getConsoleScanner().nextInt();
            switch (opcja)
            {
                case 1:
                    sterowanie.czyszczenie();
                    wypiszZawodnikow();
                    sterowanie.czyszczenie();

                    break;

                case 2:
                    sterowanie.czyszczenie();
                    dodajZawodnika();
                    break;
                case 3:
                    sterowanie.czyszczenie();
                    usunZawodnika();
                    break;

                case 4:
                    sterowanie.czyszczenie();
                    zmienDane();
                    break;
                case 5:
                    sterowanie.czyszczenie();
                    wypiszDane();
                    break;
                case 6:
                    sterowanie.czyszczenie();
                    dodajKilkuZawodnikow();
                    break;
                case 7:
                    sterowanie.czyszczenie();
                    usunWszystkich();
                    break;
            }
        } while (opcja != 8);

    }
}
