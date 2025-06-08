package Q_0000_0999;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LexicographicalNumbersTest{
    private static LexicographicalNumbers test;

    @BeforeAll
    static void beforeAll(){
        test = new LexicographicalNumbers();
    }

    @Test
    @DisplayName("test_lexicalOrder_case1")
    void test_lexicalOrder_case1(){
        Integer[] arr = {1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = Arrays.stream(arr).toList();
        assertEquals(list, test.lexicalOrder(13));
    }

    @Test
    @DisplayName("test_lexicalOrder_case2")
    void test_lexicalOrder_case2(){
        Integer[] arr = {1, 2};
        List<Integer> list = Arrays.stream(arr).toList();
        assertEquals(list, test.lexicalOrder(2));
    }

    @Test
    @DisplayName("test_lexicalOrder_case3")
    void test_lexicalOrder_case3(){
        Integer[] arr = {1, 10, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = Arrays.stream(arr).toList();
        assertEquals(list, test.lexicalOrder(10));
    }
}