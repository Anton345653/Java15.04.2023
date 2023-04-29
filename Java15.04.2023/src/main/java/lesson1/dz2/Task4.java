package lesson1.dz2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] a=new int[6][6];
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if(i==j || i==a.length-1){
                    a[i][j]=1;
                }
            }
        }
        for (int[] o: a) {
            System.out.println(Arrays.toString(o));
        }
    }
}
