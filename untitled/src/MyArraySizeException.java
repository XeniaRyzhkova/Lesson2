public class MyArraySizeException extends Exception {
    public MyArraySizeException(int i) {
        super("Неверное количество столбцов" + i);
    }

    public MyArraySizeException() {

    }
}
