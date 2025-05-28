package Q_0000_0999;

import com.resources.Create;
import com.resources.ListNode;
import com.resources.Print;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest{
    private static AddTwoNumbers test;

    @BeforeAll
    static void beforeAll(){
        test = new AddTwoNumbers();
    }

    private boolean isEqual(ListNode expected, ListNode output){
        boolean isEqual = true;
        while(expected != null && output != null){
            if(expected.val != output.val){
                isEqual = false;
                break;
            }
            if((expected.next == null && output.next != null) || (expected.next != null && output.next == null)){
                isEqual = false;
                break;
            }
            expected = expected.next;
            output = output.next;
        }
        return isEqual;
    }

    @Test
    @DisplayName("test_addTwoNumbers_case1")
    void test_addTwoNumbers_case1(){
        ListNode l1 = Create.createListNode(new int[]{2, 4, 3});
        ListNode l2 = Create.createListNode(new int[]{5, 6, 4});
        ListNode expected = Create.createListNode(new int[]{7, 0, 8});
        ListNode output = test.addTwoNumbers(l1, l2);

        assertTrue(isEqual(expected, output));
    }

    @Test
    @DisplayName("test_addTwoNumbers_case2")
    void test_addTwoNumbers_case2(){
        ListNode l1 = Create.createListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = Create.createListNode(new int[]{9, 9, 9, 9});
        ListNode expected = Create.createListNode(new int[]{8, 9, 9, 9, 0, 0, 0, 1});
        ListNode output = test.addTwoNumbers(l1, l2);

        assertTrue(isEqual(expected, output));
    }

    @Test
    @DisplayName("test_addTwoNumbers_case3")
    void test_addTwoNumbers_case3(){
        ListNode l1 = Create.createListNode(new int[]{0});
        ListNode l2 = Create.createListNode(new int[]{0});
        ListNode expected = Create.createListNode(new int[]{0});
        ListNode output = test.addTwoNumbers(l1, l2);

        assertTrue(isEqual(expected, output));
    }

}