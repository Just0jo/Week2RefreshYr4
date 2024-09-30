package ie.atu.week2_refresher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts() {
        return productList;
    }

    public String addProduct(Product product) {
        productList.add(product);
        return "updated";
    }

    public String updateProduct(Long id, Product updatedProduct) {
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            return "updated";
        }
        return null;
    }
        public boolean deleteProduct(Long id) {
            return productList.removeIf(product -> product.getId().equals(id));
    }
}



