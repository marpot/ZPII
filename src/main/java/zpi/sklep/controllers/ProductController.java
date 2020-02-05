package zpi.sklep.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zpi.sklep.model.Product;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @GetMapping(value = {"", "/"})
    public @NotNull Iterable<Product> getProducts(){
        return ProductService.getAllProducts();
    }
}
