package vibro.vibro.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/login")
    public ModelAndView products(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("currentUrl", request.getRequestURI());
        return modelAndView;
    }
}
