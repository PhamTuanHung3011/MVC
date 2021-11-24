package QLSanPham.service;

import QLSanPham.model.Product;
import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.ArrayList;
import java.util.List;

public class ManagerServiceImpl implements IProductManager{

    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product( "IPHONE13", 32000000, 5, "Hang xin cua dai gia"));
        products.add(new Product( "IPHONE12", 22000000, 4, "Hang xin cua thuong gia"));
        products.add(new Product( "IPHONE11", 12000000, 3, "Hang xin cua tieu gia"));
    }


    @Override
    public List<Product> fillAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void editById(int id, Product product) {
        findIndexById(id);


    }

    @Override
    public Product findIndexById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==id){
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        System.out.println("Enter ID");
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
            }
        }
    }


}
