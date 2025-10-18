package Q_3000_3999;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfDistinctElementsAfterOperationsTest{
    private static MaximumNumberOfDistinctElementsAfterOperations test;

    @BeforeAll
    static void beforeAll(){
        test = new MaximumNumberOfDistinctElementsAfterOperations();
    }

    @Test
    @DisplayName("test_maxDistinctElements_case1")
    void test_maxDistinctElements_case1(){
        assertEquals(6, test.maxDistinctElements(new int[]{1, 2, 2, 3, 3, 4}, 2));
    }

    @Test
    @DisplayName("test_maxDistinctElements_case2")
    void test_maxDistinctElements_case2(){
        assertEquals(3, test.maxDistinctElements(new int[]{4, 4, 4, 4}, 1));
    }

    @Test
    @DisplayName("test_maxDistinctElements_case3")
    void test_maxDistinctElements_case3(){

    }
}