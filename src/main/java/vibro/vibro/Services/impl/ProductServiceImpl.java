package vibro.vibro.Services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vibro.vibro.Models.Entity.Product;
import vibro.vibro.Models.ProductsAllDTO;
import vibro.vibro.Repository.ProductsRepository;
import vibro.vibro.Services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductsRepository productsRepository;
    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductsRepository productsRepository, ModelMapper modelMapper) {
        this.productsRepository = productsRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Page<ProductsAllDTO> getAllProduct(Pageable pageable) {
        Page<Product> getAllProducts = productsRepository.findAll(pageable);
        Page<ProductsAllDTO> allProduct = getAllProducts.map(product -> {
            return modelMapper.map(product , ProductsAllDTO.class);
        });

        for (ProductsAllDTO productsAllDTO : allProduct) {
           double a = Double.parseDouble(productsAllDTO.getSizeA());
           double b = Double.parseDouble(productsAllDTO.getSizeB());
           double m2 = a * b;
           productsAllDTO.setTotalSize(String.valueOf(m2));
        }
        System.out.println();
        return allProduct;
    }
}
