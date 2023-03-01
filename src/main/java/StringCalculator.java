import java.util.Scanner;

public class StringCalculator {

    public static void main(String[] args) {

        String inputString = getUserInput();
    }

    static String getUserInput(){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        return inputString;
    }
}
