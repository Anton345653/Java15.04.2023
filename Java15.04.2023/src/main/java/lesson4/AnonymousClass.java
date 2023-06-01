package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class AnonymousClass {
    public static void main(String[] args) {
        Printable book = new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                return 0;
            }
        };
        // book.print();
    }
}
