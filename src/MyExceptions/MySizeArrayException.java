package MyExceptions;

public class MySizeArrayException extends ArrayIndexOutOfBoundsException {
    public MySizeArrayException() {

    }

    @Override
    public String toString() {
        return " Ошибка! Данный массив не соответствует требованию!";
    }
}
