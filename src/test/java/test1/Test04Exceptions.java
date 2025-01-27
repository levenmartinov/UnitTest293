package test1;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Test04Exceptions {

    @Test
    void testLengthForNullValue() {

        String str = "Hello World!";

        //str.length()-->12

        String str2 = null;
        //str2.length()-->NullPointerException
        assertThrows(NullPointerException.class, () -> {
            str2.length();
        });

    }

    @Test
    void testDivideForArithmeticException() {

        int sayi1 = 999;
        int sayi2 = 0;

        assertThrows(ArithmeticException.class, () -> {
            System.out.println(sayi1 / sayi2);
        });

    }


}
