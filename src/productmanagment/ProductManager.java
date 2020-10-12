package productmanagment;

import Electronics.Electronics;
import java.util.LinkedList;

public class ProductManager {
    private LinkedList<Electronics> products;

    public ProductManager() {
         this.products = new LinkedList<>();
    }

    public void addProduct(Electronics e) {
        this.products.add(e);
    }

    public void printAllProducts() {
        System.out.println(products);
    }
    //public int updateProduct() {}
    //public int deleteProduct() {}
}
