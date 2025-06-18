package Q_2000_2999;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DivideArrayIntoArraysWithMaxDifferenceTest{
    private static DivideArrayIntoArraysWithMaxDifference test;

    @BeforeAll
    static void beforeAll(){
        test = new DivideArrayIntoArraysWithMaxDifference();
    }

    @Test
    @DisplayName("test_divideArray_case1")
    void test_divideArray_case1(){
        assertArrayEquals(new int[][]{{1, 1, 3}, {3, 4, 5}, {7, 8, 9}}, test.divideArray(new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1}, 2));
    }

    @Test
    @DisplayName("test_divideArray_case2")
    void test_divideArray_case2(){
        assertArrayEquals(new int[][]{}, test.divideArray(new int[]{2, 4, 2, 2, 5, 2}, 2));
    }

    @Test
    @DisplayName("test_divideArray_case3")
    void test_divideArray_case3(){
        assertTrue(isCorrect(test.divideArray(new int[]{4, 2, 9, 8, 2, 12, 7, 12, 10, 5, 8, 5, 5, 7, 9, 2, 5, 11}, 14), new int[]{4, 2, 9, 8, 2, 12, 7, 12, 10, 5, 8, 5, 5, 7, 9, 2, 5, 11}));
    }

    private boolean isCorrect(int[][] arr1, int[] nums){
        int[] arr = new int[1_000_001];
        for(int[] ints : arr1){
            for(int j = 0; j < 3; j++){
                arr[ints[j]]++;
            }
        }
        for(int iter : nums){
            arr[iter]--;
        }
        for(int iter : arr){
            if(iter != 0){
                return false;
            }
        }
        return true;
    }
}