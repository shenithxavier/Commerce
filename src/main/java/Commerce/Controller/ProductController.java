package Commerce.Controller;

import Commerce.Entity.Product;
import Commerce.Repository.ProductRepository;
import Commerce.Request.ProductRequest;
import Commerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/addProduct")
    public String AddProduct(@RequestBody ProductRequest productRequest) {
        return productService.AddProduct(productRequest);
    }

    @GetMapping("/getProduct/{code}")
    public Product GetProduct(@PathVariable("code") String code) {
        return productService.GetProduct(code);
    }

    @PutMapping("/updateProduct")
    public String UpdateProduct(@RequestBody ProductRequest productRequest) {
        return productService.UpdateProduct(productRequest);
    }
    @DeleteMapping("/deleteProduct/{Id}")
    public String DeleteProduct(@PathVariable ("Id") Long Id){
        return productService.DeleteProduct(Id);
    }

    @GetMapping("/getAllProduct")
    public List<Product> GetAllProduct(){
        return  productRepository.findAll();
    }
}
