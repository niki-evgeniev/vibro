package vibro.vibro.Controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import vibro.vibro.Models.ProductsAllDTO;
import vibro.vibro.Services.ProductService;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ModelAndView products(@PageableDefault(size = 5, sort = "name") Pageable pageable,
                                 HttpServletRequest request) {
        Page<ProductsAllDTO> allProducts = productService.getAllProduct(pageable);
        ModelAndView modelAndView = new ModelAndView("products");
        modelAndView.addObject("currentUrl", request.getRequestURI());
        modelAndView.addObject("products", allProducts);

        return modelAndView;
    }

    @ModelAttribute
    ProductsAllDTO productsAllDTO() {
        return new ProductsAllDTO();
    }
}
