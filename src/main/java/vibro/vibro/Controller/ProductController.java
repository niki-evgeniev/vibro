package vibro.vibro.Controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @GetMapping("/products")
    public ModelAndView products(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView("products");
        modelAndView.addObject("currentUrl", request.getRequestURI());

        return modelAndView;

    }
}
