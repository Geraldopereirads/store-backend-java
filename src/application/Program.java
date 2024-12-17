package application;

import entities.OrdemItem;
import entities.Product;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Product p = new Product("tv", 1000);

        OrdemItem q = new OrdemItem(1, 1000.0, p);

        System.out.println(q);

    }
}