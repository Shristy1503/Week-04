package junit_testing.basicjunittesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit_test.basicjunittest.testingstringutility.*;
public class StringUtilitytesting {
    @Test
    void reverseTest(){
        assertEquals(StringUtils.StringReverse("Muskan"),"naksuM");
    }

    @Test
    void palindromeTest(){
        assertEquals(StringUtils.isPalindrome("madam"),true);
    }

    @Test
    void UppercaseTest(){
        assertEquals(StringUtils.toUppercase("Muskan"),"MUSKAN");
    }

}
