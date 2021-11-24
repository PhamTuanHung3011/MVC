package QLSanPham.view;

import QLSanPham.controller.Product_Controller;
import QLSanPham.model.Product;

import java.util.List;
import java.util.Scanner;

public class Product_View {
    Product_Controller product_controller = new Product_Controller();
    Scanner scanner = new Scanner(System.in);
    List<Product> products =product_controller.showList();

    public void formShowListProduct() {
        System.out.println("List Product: " + products.toString());
        System.out.println("Enter Quit to back Menu");
        String quit = scanner.next();
        if (quit.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

    public Product formCreateProduct() {
        List<Product> products = product_controller.showList();
        boolean checkCreate = true;
        while (checkCreate) {
            int id = products.size()+1;
            System.out.println("Enter name Product");
            String name = scanner.nextLine();
            System.out.println("Enter cost");
            double cost = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter quantity");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter description");
            String description = scanner.nextLine();
            Product product = new Product(name, cost,quantity, description);
            product_controller.createProduct(product);
            System.out.println("Enter Quit to back Menu");
            String quit = scanner.next();
            if (quit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
        return null;
    }

//    public void formEditProduct() {
//        int index = scanner.nextInt();
//        if (index >= 0 ) {
//            int choice = scanner.nextInt();
//            boolean check = true;
//            while (check) {
//                switch (choice) {
//                    case 1:
//                        System.out.println("Enter Product name:");
//                        products.get(index).setProductName(scanner.nextLine());
//                        break;
//                    case 2:
//                        System.out.println("Enter cost");
//                        products.get(index).setCost(Double.parseDouble(scanner.nextLine()));
//                        break;
//                    case 3:
//                        System.out.println("Enter quantity");
//                        products.get(index).setQuantity(Integer.parseInt(scanner.nextLine()));
//                    case 4:
//                        System.out.println("Enter description");
//                        products.get(index).setDescription(scanner.nextLine());
//                        break;
//                    case 5:
//                        System.out.println("Change All");
//                        System.out.println("Enter Product name:");
//                        products.get(index).setProductName(scanner.nextLine());
//                        System.out.println("Enter cost");
//                        products.get(index).setCost(Double.parseDouble(scanner.nextLine()));
//                        System.out.println("Enter quantity");
//                        products.get(index).setQuantity(Integer.parseInt(scanner.nextLine()));
//                        System.out.println("Enter description");
//                        products.get(index).setDescription(scanner.nextLine());
//                        break;
//                    case 6:
//                        System.out.println("Enter any key to continue Edit - Enter quit to back MENU");
//                        String quit = scanner.next();
//                        if(quit.equalsIgnoreCase("quit")){
//                            check = false;
//                            new Main();
//                        }
//                }
//            }
//
//
//        }
//
//    }

    public void formEditProduct() {
        System.out.println("Enter Id");
        int id = scanner.nextInt();
        Product product = product_controller.detailProduct(id);
        System.out.println("1. Change Name Product; 2. Change Cost; 3. Change Quantity; 4. Change All");
        int choice = scanner.nextInt();
        boolean check = true;
        while (check){
            switch (choice) {
                case 1:
                    System.out.println("Enter change name product");
                    product.setProductName(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Enter change cost");
                    product.setCost(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter change quantity");
                    product.setQuantity(Integer.parseInt(scanner.nextLine()));
                    break;
                case 4:
                    System.out.println("Enter change name product");
                    scanner.nextLine();
                    product.setProductName(scanner.nextLine());
                    System.out.println("Enter change cost");
                    product.setCost(Double.parseDouble(scanner.nextLine()));
                    System.out.println("Enter change quantity");
                    product.setQuantity(Integer.parseInt(scanner.nextLine()));
                    break;

            }
            System.out.println("Enter any key to continue detail - Enter quit to back MENU");
            String quit = scanner.next();
            if(quit.equalsIgnoreCase("quit")){

                new Main();
            }
        }


    }

    public void formDetailProduct() {
        System.out.println("Enter ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(product_controller.detailProduct(id));
        System.out.println("Enter any key to continue detail - Enter quit to back MENU");
        String quit = scanner.next();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }

    }

    public void formDeleteProduct() {
        System.out.println("Enter ID to want delete");
        int id = scanner.nextInt();
        product_controller.deleteProduct(id);
        System.out.println("Enter Quit to back Menu");
        String quit = scanner.next();
        if (quit.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

}
