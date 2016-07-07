package michal.rys.commons;

import java.util.Scanner;

/**
 * Created by Michal on 2016-06-14.
 */
public class ConsoleScannerSingleton {

    private static Scanner consoleScanner;

    public static synchronized Scanner getConsoleScanner() {
        consoleScanner = new Scanner(System.in);
        return consoleScanner;
    }

    public static synchronized void closeScanner(){
        consoleScanner.close();
    }
}
