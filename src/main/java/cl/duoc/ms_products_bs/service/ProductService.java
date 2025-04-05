package cl.duoc.ms_products_bs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.ms_products_bs.model.dto.Product;

@Service
public class ProductService {


    public List<Product> getProducts() {
        Product product1 = new Product(1, "producto 1", "descripcion 1", 10000);
        Product product2 = new Product(2, "producto 2", "descripcion 2", 20000);
        Product product3 = new Product(3, "producto 3", "descripcion 3", 30000);
        List<Product> lista = new ArrayList<>();
        lista.add(product1);
        lista.add(product2);
        lista.add(product3);
        return lista;
    }

    public String addProduct(Product product){

        return "Producto Creado";
    }
}
