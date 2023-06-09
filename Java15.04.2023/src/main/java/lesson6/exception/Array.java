package lesson6.exception;

public class Array {
    public static void main(String[] args) {
        foldArray(array);

    }

    static String[][] array = {
            {"6", "8", "8", "5"},
            {"45", "3", "2", "1"},
            {"56", "66", "87", "5"},
            {"4", "5", "4", "67"}
    };

    public static void foldArray(String[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i].length != 4 || a.length != 4) {
                    throw new MyArraySizeException("Размер массива неверен");
                }
                try {
                    Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("ошибка " + i + " " + j);
                }
                sum += Integer.parseInt(a[i][j]);
            }
        }
        System.out.println("Сумма элементов равна " + sum);
    }
}
