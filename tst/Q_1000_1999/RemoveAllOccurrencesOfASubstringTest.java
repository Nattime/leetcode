package Q_1000_1999;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveAllOccurrencesOfASubstringTest{
    private static RemoveAllOccurrencesOfASubstring test;

    @BeforeAll
    static void beforeAll(){
        test = new RemoveAllOccurrencesOfASubstring();
    }

    @Test
    @DisplayName("test_removeOccurrences_case1")
    void test_removeOccurrences_case1(){
        assertEquals("dab", test.removeOccurrences("daabcbaabcbc", "abc"));
    }

    @Test
    @DisplayName("test_removeOccurrences_case2")
    void test_removeOccurrences_case2(){
        assertEquals("ab", test.removeOccurrences("axxxxyyyyb", "xy"));
    }

    @Test
    @DisplayName("test_removeOccurrences_case3")
    void test_removeOccurrences_case3(){
        assertEquals("svpwdk", test.removeOccurrences("gjzgbpggjzgbpgsvpwdk", "gjzgbpg"));
    }

    @Test
    @DisplayName("test_removeOccurrences_case4")
    void test_removeOccurrences_case4(){
        assertEquals("a", test.removeOccurrences("a", "aa"));
    }
}