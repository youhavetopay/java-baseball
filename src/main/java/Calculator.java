import java.util.List;

public class Calculator {

    double calculate(List<Integer> numbers, List<String> operators){

        int numberIdx = 0;
        int operatorIdx = 0;

        double result = numbers.get(0);
        numberIdx += 1;

        while (numberIdx < numbers.size()){
            result = calTwoNumber(result, numbers.get(numberIdx), operators.get(operatorIdx));
            operatorIdx += 1;
            numberIdx += 1;
        }

        return result;
    }

    private double calTwoNumber(double a, double b, String operator){

        if(operator.equals("+")){
            return sum(a,b);
        }

        if(operator.equals("-")){
            return sub(a,b);
        }

        if(operator.equals("*")){
            return mul(a,b);
        }

        if(operator.equals("/")){
            return div(a,b);
        }

        return 0;
    }

    private double sum(double a, double b){
        return a + b;
    }

    private double sub(double a, double b){
        return a - b;
    }

    private double mul(double a, double b){
        return a*b;
    }

    private double div(double a, double b){
        return a/b;
    }
}
