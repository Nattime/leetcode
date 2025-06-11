package Q_3000_3999;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LexicographicallyMinimumStringAfterRemovingStarsTest{
    private static LexicographicallyMinimumStringAfterRemovingStars test;

    @BeforeAll
    static void beforeAll(){
        test = new LexicographicallyMinimumStringAfterRemovingStars();
    }

    @Test
    @DisplayName("test_clearStars_case1")
    void test_clearStars_case1(){
        assertEquals("aab", test.clearStars("aaba*"));
    }

    @Test
    @DisplayName("test_clearStars_case2")
    void test_clearStars_case2(){
        assertEquals("cdef", test.clearStars("abcde*f*"));
    }

    @Test
    @DisplayName("test_clearStars_case3")
    void test_clearStars_case3(){
        assertEquals("defgh", test.clearStars("abc*de*fgh*"));
    }

    @Test
    @DisplayName("test_clearStars_case4")
    void test_clearStars_case4(){
        assertEquals("yed", test.clearStars("d*yed"));
    }
}