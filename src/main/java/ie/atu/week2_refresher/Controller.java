package ie.atu.week2_refresher;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("Product")
public class Controller {
    private List<Product> ProductList = new ArrayList<>();
    @GetMapping("/ProductGet")
    public List<Product> getProductList()
    {
        return ProductList;

    }
    @PostMapping("ProductPost")
     public Product addProduct(@RequestBody Product product) {
        ProductList.add(product);
        return product;
    }

}

