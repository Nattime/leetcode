package Q_2000_2999;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinalValueOfVariableAfterPerformingOperationsTest{
    private static FinalValueOfVariableAfterPerformingOperations test;

    @BeforeAll
    static void beforeAll(){
        test = new FinalValueOfVariableAfterPerformingOperations();
    }

    @Test
    @DisplayName("test_finalValueAfterOperations_case1")
    void test_finalValueAfterOperations_case1(){
        assertEquals(1, test.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
    }

    @Test
    @DisplayName("test_finalValueAfterOperations_case2")
    void test_finalValueAfterOperations_case2(){
        assertEquals(3, test.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
    }

    @Test
    @DisplayName("test_finalValueAfterOperations_case3")
    void test_finalValueAfterOperations_case3(){
        assertEquals(0, test.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }
}