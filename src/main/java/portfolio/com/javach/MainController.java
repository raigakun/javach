package portfolio.com.javach;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
        public String index() {
            return "index";
        }

    @RequestMapping("/aboutme")
        public String aboutme() {
            return "aboutme";
        }

    @RequestMapping("/challenge")
        public String challenge() {
            return "challenge";
        }
}