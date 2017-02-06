package scannerUtil;

import java.util.Scanner;

/**
 * Created by User on 06.02.2017.
 */
public class ScanManager {
    private static Scanner readValue;

    public static int consoleReadInt() {
        readValue = new Scanner(System.in);
        return readValue.nextInt();
    }

    public static String consoleReadString() {
        readValue = new Scanner(System.in);
        return readValue.nextLine();
    }

    public static void scannerClose() {
        readValue.close();
    }
}
