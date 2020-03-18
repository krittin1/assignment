package exam2;

public class SortNumber {


    public int[] sort(String text) throws NumberFormatException{

        if (text == null || text.isEmpty())
            throw new NumberFormatException("please input at least 1 number format ex 1,");

        int a[] = convert(text);


        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minPos]) {
                    minPos = j;
                }
            }

            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }

        return a;

    }




    public int[] convert(String text){

        String[] items = text.split(",");
        int size = items.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {


            if (isNumeric(items[i].trim()))
                arr[i] = Integer.parseInt(items[i].trim());
        }

        return arr;

    }



    public static boolean isNumeric(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

}
