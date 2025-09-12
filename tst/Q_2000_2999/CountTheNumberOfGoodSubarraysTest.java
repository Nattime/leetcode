package Q_2000_2999;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTheNumberOfGoodSubarraysTest{
    private static CountTheNumberOfGoodSubarrays test;

    @BeforeAll
    static void beforeAll(){
        test = new CountTheNumberOfGoodSubarrays();
    }

    @Test
    @DisplayName("test_countGood_case1")
    void test_countGood_case1(){
        assertEquals(21, test.countGood(new int[]{2, 1, 3, 1, 2, 2, 3, 3, 2, 2, 1, 1, 1, 3, 1}, 11));
    }

    @Test
    @DisplayName("test_countGood_case2")
    void test_countGood_case2(){
        assertEquals(4, test.countGood(new int[]{3, 1, 4, 3, 2, 2, 4}, 2));
    }

    @Test
    @DisplayName("test_countGood_case3")
    void test_countGood_case3(){
        assertEquals(1, test.countGood(new int[]{1, 1, 1, 1, 1}, 10));
    }
}