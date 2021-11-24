package QLSanPham.service;

import QLSanPham.model.Product;

import java.util.List;

public interface IProductManager {

    List<Product> fillAll();
    void save(Product product);
    void editById(int id, Product product);
    Product findIndexById(int id);
    void deleteById(int id);




}
