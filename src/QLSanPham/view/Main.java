package QLSanPham.view;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    Product_View product_view = new Product_View();

    public Main() {
        System.out.println("-----MENU MANAGE PRODUCT -----");
        System.out.println("1.Show List Product:\n" +
                "2.Create Product:\n"+
                "3.Edit Product:\n"+
                "4.Delete Product:\n"+
                "5.Sort Product By Cost:\n"+
                "6.Find the most expensive product:\n"+
                "6.Sort Student By Name:\n"
        );
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: product_view.formShowListProduct();
            break;
            case 2: product_view.formCreateProduct();
            break;
            case 4:
                product_view.formDeleteProduct();

            break;
            case 3: product_view.formEditProduct();
            break;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
