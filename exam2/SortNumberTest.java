package exam2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortNumberTest {

    private int[] array , actual;
    private  static SortNumber sortNumber;


    @BeforeAll
    public static void init(){
        sortNumber = new SortNumber();
    }





    @Test
    public void sort_normal_1() {
         actual =  new int[]{ 1, 2, 3, 5, 7, 8, 55, 80, 90};
         array = sortNumber.sort("1,5,55,3,90,7,8,2,80");
         assertEquals(Arrays.toString(actual), Arrays.toString(array));
    }

    @Test
    public void sort_normal_2() {
        actual =  new int[]{ -90, -80, -55, -45, -8, -7, -3, -1, 0};
        array = sortNumber.sort("-1,0,-55,-3,-90,-7,-8,-45,-80");
        assertEquals(Arrays.toString(actual), Arrays.toString(array));
    }


    @Test
    public void sort_normal_3() {
        actual =  new int[]{ 0, 0, 0, 0, 0, 0,0, 0, 0, 0};
        array = sortNumber.sort("0,0,0,0,0,0,0,0,0,0");
        assertEquals(Arrays.toString(actual), Arrays.toString(array));
    }


    @Test
    public void sort_normal_4() {
        actual =  new int[]{100,100,100};
        array = sortNumber.sort("100,100,100");
        assertEquals(Arrays.toString(actual), Arrays.toString(array));
    }


    @Test
    public void sort_normal_5() {
        actual =  new int[]{1};
        array = sortNumber.sort("1");
        assertEquals(Arrays.toString(actual), Arrays.toString(array));
    }



    @Test
    public void sort_normal_6() {
        actual =  new int[]{1000000};
        array = sortNumber.sort("1000000");
        assertEquals(Arrays.toString(actual), Arrays.toString(array));
    }


    @Test
    public void sort_same_number() {
        actual =  new int[]{23, 33, 33, 112, 123, 223};
        array = sortNumber.sort("112, 223,33,23,123,33");
        assertEquals(Arrays.toString(actual), Arrays.toString(array));
    }


    @Test
    public void sort_zero() {
        actual =  new int[]{0};
        array = sortNumber.sort("0");
        assertEquals(Arrays.toString(actual), Arrays.toString(array));
    }



    @Test
    public void test_null_input() {

        Throwable exception = assertThrows(NumberFormatException.class,
                () -> { sortNumber.sort(null); });
        assertEquals("please input at least 1 number format ex 1,", exception.getMessage());



    }



    @Test
    public void test_invalid_input() {

        Throwable exception = assertThrows(NumberFormatException.class,
                () -> { sortNumber.sort(""); });
        assertEquals("please input at least 1 number format ex 1,", exception.getMessage());



    }

    @Test
    public void test_notNumeric_input() {

        actual =  new int[]{0, 0, -4, 0, 5};
        array = sortNumber.convert("1hello,9a,-4,3/4,5");
        assertEquals(Arrays.toString(actual), Arrays.toString(array));


    }



    @Test
    void convert_1() {
        actual =  new int[]{1,2,3,4,5};
        array = sortNumber.convert("1,2,3,4,5");
        assertEquals(Arrays.toString(actual), Arrays.toString(array));
    }
}