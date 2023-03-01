import java.util.ArrayList;
import java.util.Arrays;
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

    List<String> splitStringByOperator(String input){
        String[] splitWords = input.split(" ");
        List<String> operators = new ArrayList<>();

        for(String word : splitWords){
            addOperatorWord(operators, word);
        }

        return operators;
    }

    private void addIntegerWord(List<Integer> numbers, String word){
        if (checkNumberFormat(word)) {
            numbers.add(Integer.parseInt(word));
        }
    }

    private void addOperatorWord(List<String> operators, String word){
        if (checkOperatorFormat(word)){
            operators.add(word);
        }
    }

    private boolean checkNumberFormat(String word){
        try{
            Integer.parseInt(word);
        } catch (NumberFormatException numberFormatException){
            return false;
        }
        return true;
    }

    private boolean checkOperatorFormat(String word){
        List<String> operatorFormat = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
        return operatorFormat.contains(word);
    }

}
