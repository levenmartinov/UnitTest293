package test1;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test05RepeatedTest {

    //bazı test senaryolarında bir testi aynı/benzer koşullarda
    //tekrar tekrar çalıştırmak isteyebiliriz
    @RepeatedTest(5)
    void testSubString() {
        assertEquals("Java", "Java is beautiful".substring(0, 4));
    }


    //repeated test çoğunlukla random değerler ile
    //yapılan test senaryolarında tercih edilir
    @RepeatedTest(5)
    void testAddExactByRandomValue() {

        Random random = new Random();
        int sayi1 = random.nextInt(100);
        int sayi2 = random.nextInt(100);

        assertEquals(sayi1 + sayi2, Math.addExact(sayi1, sayi2));
        System.out.println("sayı 1:" + sayi1 + "--- sayı 2:" + sayi2);
    }

}
