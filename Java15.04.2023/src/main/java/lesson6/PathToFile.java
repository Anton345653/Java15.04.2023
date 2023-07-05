package lesson6;

import java.io.File;

public class PathToFile {
    private static final String PATH = "F:/copy/Новая папка";

    public static void main(String[] args) {
        File file = new File(PATH);
        printPath(file);
        System.out.println(file.getAbsolutePath());

    }

    public static void printPath(File file) {
        if (file.isDirectory()) {
            System.out.println("Direction: " + file.getName());

            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    printPath(f);
                }
            }
        } else {
            System.out.println("File: " + file.getName());
        }
        // for (File f : files) {
        //     if (f.isDirectory()) {
        //         System.out.println(f.getPath());
        //         printPath(f);
        //     }
        // }

    }

}
