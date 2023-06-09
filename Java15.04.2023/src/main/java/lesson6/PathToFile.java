package lesson6;

import java.io.File;

public class PathToFile {
    private static final String PATH = "F:/copy/Новая папка";

    public static void main(String[] args) {
        File file = new File(PATH);
        //printPath(file);
        System.out.println(file.getAbsolutePath());

    }

    public static void printPath(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println(f.getPath());
                printPath(f);
            }
        }

    }

}
