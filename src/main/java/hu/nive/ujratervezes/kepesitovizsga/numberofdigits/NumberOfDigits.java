package hu.nive.ujratervezes.kepesitovizsga.numberofdigits;

public class NumberOfDigits {

    public int getNumberOfDigits(int number){
        int solution = 0;
        for (int i = 1; i < number+1; i++) {
            solution+=countDigitsOfSingleNumber(i);
        }
        return solution;
    }

    private int countDigitsOfSingleNumber(int number){
        String numberRepresentation = Integer.toString(number);
        return numberRepresentation.length();
    }
}
