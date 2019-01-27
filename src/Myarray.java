import MyExceptions.MyArrayDataException;
import MyExceptions.MySizeArrayException;

public class Myarray {


    public static void CreateArr(String[][] InTo) throws MySizeArrayException, MyArrayDataException {

        final int SIZE=4;
        int Sum=0;
        String[][] Arr;

        if (InTo.length>4 || InTo.length<4) throw new MySizeArrayException();

        Arr =InTo;

        for(int i=0;i<SIZE;i++){
            for (int j=0;j<SIZE;j++){
                if (!isNumeric(Arr[i][j])) throw new MyArrayDataException(i, j);
                Sum+=Integer.parseInt(Arr[i][j]);
            }
        }
        System.out.println(Sum);


    }

    private static boolean isNumeric(String string){
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
