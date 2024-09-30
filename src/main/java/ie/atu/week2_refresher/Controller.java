package ie.atu.week2_refresher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("Product")
public class Controller {
    private final ProductService productService;

    @Autowired
    public Controller(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/ProductGet")
    public List<Product> getProductList() {
        return productService.getAllProducts();

    }

    @PostMapping("/ProductPost")
    public String addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }


    @PutMapping("/id")
    public String updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        return productService.updateProduct(id, updatedProduct);

    }
    @DeleteMapping("/id")
    public boolean deleteProduct(@PathVariable Long id) {
        return  productService.deleteProduct(id);

    }

}

