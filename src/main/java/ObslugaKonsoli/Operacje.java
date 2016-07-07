package ObslugaKonsoli;
import michal.rys.commons.ConsoleScannerSingleton;

import java.util.*;
/**
 * Created by Michal on 2016-06-13.
 */
public class Operacje {


    public void wcisnijKlawisz(){

        System.out.println("wcisnij klawisz, by przejsc dalej");
        //ConsoleScannerSingleton.closeScanner();
        ConsoleScannerSingleton.getConsoleScanner().nextLine();
    }

    public void czyszczenie(){
        for (int i = 0; i<100; i++){
            System.out.println(" ");
        }
    }
}
