package Commerce.Service;

import Commerce.Entity.Product;
import Commerce.Repository.ProductRepository;
import Commerce.Request.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public String AddProduct(ProductRequest productRequest) {
        Product p = new Product();
        p.setId(productRequest.getId());
        p.setProductName(productRequest.getProductName());
        p.setProductCode(productRequest.getProductCode());
        p.setAvailableUnits(productRequest.getAvailableUnits());
        p.setAvailableColor(productRequest.getAvailableColor());
        p.setCreatedAt(productRequest.getCreatedAt());
        p.setCreatedBy(productRequest.getCreatedBy());
        p.setUpdatedAt(productRequest.getUpdatedAt());
        p.setUpdatedBy(productRequest.getUpdatedBy());

        productRepository.save(p);
        return "product added successfully";
    }

    public Product GetProduct(String code) {
        String Id = code;
        Optional<Product> productOptional = productRepository.findByProductCode(Id);
        Product p = productOptional.get();  //since it is optional we use .get()
        return p;
    }

    public String UpdateProduct(ProductRequest productRequest) {
        String code = productRequest.getProductCode();
        Optional<Product> productOptional = productRepository.findByProductCode(code);
        Product p = productOptional.get();

        if (productRequest.getProductName() != null)
            p.setProductName(productRequest.getProductName());
        if (productRequest.getAvailableUnits() != null)
            p.setAvailableUnits(productRequest.getAvailableUnits());
        if (productRequest.getAvailableColor() != null)
            p.setAvailableColor(productRequest.getAvailableColor());
        if (productRequest.getCreatedAt() != null)
            p.setCreatedAt(productRequest.getCreatedAt());
        if (productRequest.getCreatedBy() != null)
            p.setCreatedBy(productRequest.getCreatedBy());
        if (productRequest.getUpdatedAt() != null)
            p.setUpdatedAt(productRequest.getUpdatedAt());
        if (productRequest.getUpdatedBy() != null)
            p.setUpdatedBy(productRequest.getUpdatedBy());

        productRepository.save(p);
        return "product updated successfully";
    }

    public String DeleteProduct(Long id) {
        Long Id = id;
        productRepository.deleteById(id);
        return "";
    }

    public List<Product> GetAllProduct(){
        return productRepository.findAll();
    }
}
