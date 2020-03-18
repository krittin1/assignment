package exam2;

import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        SortNumber sortNumber = new SortNumber();

        try{
            int[] array = sortNumber.sort("998, 996, 1000,21334141351451351351351351345134513451354134513534,-554754564");

            System.out.println(Arrays.toString(array));
        } catch(NumberFormatException e){
            System.err.println(e.getMessage());
        }








    }
}
