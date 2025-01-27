package test1;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test06PerformanceTest {


    //2. parametrede verilen kod 1. parametrede verilen sürede gerceklesirse
    // test passed olur degilse failed olur, buna performans testi denir

    @Test
    void testPerformanceSum() {

        assertTimeout(Duration.ofMillis(8), () -> {
            long sum = 0;
            for (long i = 1; i <= 10000000; i++) {
                sum += i;
            }
        });

    }


}
