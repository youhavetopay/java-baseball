import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordProcessor {

    String inputString(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    List<Integer> splitStringByNumber(String input){
        String[] splitWords = input.split(" ");
        List<Integer> numbers = new ArrayList<>();

        for(String word : splitWords){
            addIntegerWord(numbers, word);
        }

        return numbers;
    }

    void addIntegerWord(List<Integer> numbers, String word){
        if (checkNumberFormat(word)) {
            numbers.add(Integer.parseInt(word));
        }
    }

    boolean checkNumberFormat(String word){
        try{
            Integer.parseInt(word);
        } catch (NumberFormatException numberFormatException){
            return false;
        }
        return true;
    }

}
