package Q_1000_1999;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAscendingSubarraySumTest{
    private static MaximumAscendingSubarraySum test;

    @BeforeAll
    static void beforeAll(){
        test = new MaximumAscendingSubarraySum();
    }

    @Test
    @DisplayName("test_maxAscendingSum_case1")
    void test_maxAscendingSum_case1(){
        assertEquals(65, test.maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50}));
    }

    @Test
    @DisplayName("test_maxAscendingSum_case2")
    void test_maxAscendingSum_case2(){
        assertEquals(150, test.maxAscendingSum(new int[]{10, 20, 30, 40, 50}));
    }

    @Test
    @DisplayName("test_maxAscendingSum_case3")
    void test_maxAscendingSum_case3(){
        assertEquals(33, test.maxAscendingSum(new int[]{12, 17, 15, 13, 10, 11, 12}));
    }
}