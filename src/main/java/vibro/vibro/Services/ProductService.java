package vibro.vibro.Services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vibro.vibro.Models.ProductsAllDTO;

public interface ProductService {
    Page<ProductsAllDTO> getAllProduct(Pageable pageable);
}
