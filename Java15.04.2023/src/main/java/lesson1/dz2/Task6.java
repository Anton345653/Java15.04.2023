package lesson1.dz2;

public class Task6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 1}; // почему при такой комбинации false?
        System.out.println(fuu(a));
    }

    public static boolean fuu(int[] a) {
        int leftSumm = 0;
        int rightSumm = 0;
        for (int i = 0; i < a.length - 1; i++) {
            leftSumm += a[i];
            for (int j = i + 1; j < a.length; j++) {
                rightSumm += a[j];
            }
            if (leftSumm == rightSumm) {
                return true;
            }
            rightSumm = 0;
        }
        return false;
    }
}


