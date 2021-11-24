package QLSanPham.controller;

import QLSanPham.model.Product;
import QLSanPham.service.ManagerServiceImpl;

import java.util.List;

public class Product_Controller {
    ManagerServiceImpl managerService = new ManagerServiceImpl();
    public List<Product> showList() {
        return managerService.fillAll();
    }

    public void createProduct(Product product) {
        managerService.save(product);
    }

    public void editProduct (int id, Product product) {
        managerService.editById(id, product);

    }

    public void deleteProduct(int id) {
        managerService.deleteById(id);
    }

    public Product detailProduct(int id) {
       return managerService.findIndexById(id);
    }


}
