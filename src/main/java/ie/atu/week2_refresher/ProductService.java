package ie.atu.week2_refresher;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts() {
        return productList; // Return the current product list
    }

    public String addProduct(Product product) {
        productList.add(product);
        return "Product added successfully";
    }
    public Product updateProduct(int id, Product updatedProduct) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                return product;
            }
        }
        return null;
    }

    public String deleteProduct(int id) {
        boolean isRemoved = productList.removeIf(product -> product.getId() == id);
        if (isRemoved) {
            return "Product deleted successfully";
        } else {
            return "Product not found";
        }
    }
}
