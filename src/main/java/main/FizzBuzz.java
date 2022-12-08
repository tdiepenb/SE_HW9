package main;

public class FizzBuzz {




    public String convertNumber(int number) {

        StringBuilder fizzBuzz = new StringBuilder();

        if (number % 5 == 0) {
            fizzBuzz.append("Fizz");
        }
        if (number % 7 == 0) {
            fizzBuzz.append("Buzz");
        }
        return fizzBuzz.toString();

    }
}
