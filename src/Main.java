import MyExceptions.MyArrayDataException;
import MyExceptions.MySizeArrayException;

public class Main {

    public static void main(String[] args) {

            int SIZE=4;
            String[][] arr = new String[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    arr[i][j] = "1";
                }
            }
            arr[SIZE-1][SIZE-1]="-";

        try {

            Myarray.CreateArr(arr);

        } catch (MySizeArrayException e){

            System.out.println(e.getMessage());


        } catch (MyArrayDataException e1){

           System.out.println(e1.getMessage());
        }
    }
}
