package ie.atu.week2_refresher;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("Product")
public class Controller {
    private ProductService productService = new ProductService();
    @GetMapping("/ProductGet")
    public List<Product> getProductList()
    {
        return productService.getAllProducts();

    }
    @PostMapping("ProductPost")
    public String addProduct(@RequestBody Product product) {
       return productService.addProduct(product);
    }
}
