package lesson6;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class StreamDemo {
    private static final int FILE_SIZE = 1024 * 1024 * 100;

    public static void generateFile() {
        try (RandomAccessFile f = new RandomAccessFile("F:\\copy\\t.txt", "rw")) {
            f.setLength(1024 * 1024 * 100);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Random r = new Random();
        int w = 0;
        try (FileWriter fileWriter = new FileWriter("F:\\copy\\t.txt")) {
            while (w < FILE_SIZE) {
                String text = String.valueOf(r.nextInt(5)) + (char) (r.nextInt(23) + 'a');
                fileWriter.write(text);
                w += text.getBytes().length;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("файл готов");
    }

    public static void fileReaderWriter() {
        long start = System.currentTimeMillis();

        try (FileWriter fileWriter = new FileWriter("F:\\copy\\copy.txt");
             FileReader fileReader = new FileReader("F:\\copy\\t.txt")) {
            char[] buffer = new char[1024];
            int k;

            while ((k = fileReader.read(buffer)) != -1) {
                fileWriter.write(buffer, 0, k);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Копирование filereader за " + (finish - start));
    }

    public static void bufferedFileReaderWriter() {
        long start = System.currentTimeMillis();

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("F:\\copy\\copybuf.txt"));
             BufferedReader fileReader = new BufferedReader(new FileReader("F:\\copy\\t.txt"))) {
            char[] buffer = new char[1024];
            int k;

            while ((k = fileReader.read(buffer)) != -1) {
                fileWriter.write(buffer, 0, k);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Копирование bufferedfilereader за " + (finish - start));
    }

    public static void fileInputStreamOutputStream() {
        long start = System.currentTimeMillis();

        try (FileOutputStream fileWriter = new FileOutputStream("F:\\copy\\copyoutputstream.txt");
             FileInputStream fileReader = new FileInputStream("F:\\copy\\t.txt")) {
            byte[] buffer = new byte[1024];
            int k;

            while ((k = fileReader.read(buffer)) != -1) {
                fileWriter.write(buffer, 0, k);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Копирование fileinputstream за " + (finish - start));
    }

    public static void bufferedInputStreamOutputStream() {
        long start = System.currentTimeMillis();

        try (BufferedOutputStream fileWriter = new BufferedOutputStream(new FileOutputStream("F:\\copy\\bufferedcopyoutputstream.txt"));
             BufferedInputStream fileReader = new BufferedInputStream(new FileInputStream("F:\\copy\\t.txt"))) {
            byte[] buffer = new byte[1024];
            int k;

            while ((k = fileReader.read(buffer)) != -1) {
                fileWriter.write(buffer, 0, k);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        long finish = System.currentTimeMillis();
        System.out.println("Копирование bufferedinputstream за " + (finish - start));
    }

    public static void copyImage() {
        try (FileReader fileReader = new FileReader("F:\\copy\\0.jpg");
             FileWriter fileWriter = new FileWriter("F:\\copy\\copy0.jpg")) {
            char[] buf = new char[1024];
            int k;
            while ((k = fileReader.read(buf)) != -1) {
                fileWriter.write(buf, 0, k);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("картинка не скопировалась");
        try (FileInputStream fileReader = new FileInputStream("F:\\copy\\0.jpg");
             FileOutputStream fileWriter = new FileOutputStream("F:\\copy\\copy01.jpg")) {
            byte[] buf = new byte[1024];
            int k;
            while ((k = fileReader.read(buf)) != -1) {
                fileWriter.write(buf, 0, k);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("картинка скопировалась");

    }


    public static void main(String[] args) {
        generateFile();
        fileReaderWriter();
        bufferedFileReaderWriter();
        fileInputStreamOutputStream();
        bufferedInputStreamOutputStream();
        copyImage();
    }


}
