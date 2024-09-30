package ie.atu.week2_refresher;
import jakarta.validation.Valid;
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


    @PutMapping("/PostUpdate/{id}")
      public Product updateProduct(@PathVariable int id, @RequestBody @Valid Product updatedProduct) {
        Product product = productService.updateProduct(id, updatedProduct);
            return product;

    }
    @DeleteMapping("/PostDelete/{id}")
    public String deleteProduct(@PathVariable int id) {
        boolean isRemoved = productService.deleteProduct(id);
        if (isRemoved) {
            return "Product deleted";
        } else {
            return "Product not found";
        }
    }

}

