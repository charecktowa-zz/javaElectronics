package productmanagment;

import Electronics.Electronics;
import java.util.LinkedList;

public class ProductManager {
    private LinkedList<Electronics> products;

    public LinkedList<Electronics> getProducts() {
        return products;
    }

    public ProductManager() {
         this.products = new LinkedList<>();
    }

    public void addProduct(Electronics e) {
        this.products.add(e);
    }

    public void printAllProducts() {
        for(Electronics item: products) {
            System.out.println(item);
        }
    }

    /* Returns the position where the id was found */
    public int updateProduct(int id) {
        int index = -1;
        // search in all LinkedList
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return index;
    }

    public void replaceProduct(Electronics e, int index) {
        this.products.set(index, e);
    }

    //public int updateProduct() {}
    public boolean deleteProduct(int id) {
        // search in all linkedlist
        boolean exist = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                // if it exist then delete
                products.remove(i);
                exist = true;
            } else {
                exist = false;
            }
        }
        
        return exist;
    }
}
