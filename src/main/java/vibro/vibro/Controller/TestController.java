package vibro.vibro.Controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @GetMapping("/test")
    public ModelAndView products(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("404");
        modelAndView.addObject("currentUrl", request.getRequestURI());
        return modelAndView;
    }
}
