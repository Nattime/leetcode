package Q_3000_3999;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDifferenceBetweenAdjacentElementsInACircularArrayTest{
    private static MaximumDifferenceBetweenAdjacentElementsInACircularArray test;

    @BeforeAll
    static void beforeAll(){
        test = new MaximumDifferenceBetweenAdjacentElementsInACircularArray();
    }

    @Test
    @DisplayName("test_maxAdjacentDistance_case1")
    void test_maxAdjacentDistance_case1(){
        assertEquals(3, test.maxAdjacentDistance(new int[]{1, 2, 4}));
    }

    @Test
    @DisplayName("test_maxAdjacentDistance_case2")
    void test_maxAdjacentDistance_case2(){
        assertEquals(5, test.maxAdjacentDistance(new int[]{-5, -10, -5}));
    }

    @Test
    @DisplayName("test_maxAdjacentDistance_case3")
    void test_maxAdjacentDistance_case3(){

    }
}