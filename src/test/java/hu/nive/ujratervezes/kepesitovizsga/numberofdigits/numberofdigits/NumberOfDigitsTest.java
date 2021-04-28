package hu.nive.ujratervezes.kepesitovizsga.numberofdigits.numberofdigits;

import hu.nive.ujratervezes.kepesitovizsga.numberofdigits.NumberOfDigits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfDigitsTest {

    @Test
    public void testGetNumberOfDigits() {
        Assertions.assertEquals(13, new NumberOfDigits().getNumberOfDigits(11));
        Assertions.assertEquals(17, new NumberOfDigits().getNumberOfDigits(13));
    }
}