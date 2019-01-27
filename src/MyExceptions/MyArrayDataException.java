package MyExceptions;
public class MyArrayDataException extends NumberFormatException {
    private int i;
    private  int j;
    public MyArrayDataException(int i, int j) {
        this.i=i;
        this.j=j;
    }

    @Override
    public String toString() {
        return "В ячейке [" + i + "][" + j + "] не числовой символ!";
    }

}
