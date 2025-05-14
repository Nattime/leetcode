package Q_0000_0999;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest{
    private static TwoSum test;

    @BeforeAll
    static void beforeAll(){
        test = new TwoSum();
    }

    @Test
    @DisplayName("test_twosum_case1")
    void test_twosum_case1(){
        assertArrayEquals(new int[]{0, 1}, test.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    @DisplayName("test_twosum_case2")
    void test_twosum_case2(){
        assertArrayEquals(new int[]{1, 2}, test.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    @DisplayName("test_twosum_case3")
    void test_twosum_case3(){
        assertArrayEquals(new int[]{0, 1}, test.twoSum(new int[]{3, 3}, 6));
    }
}