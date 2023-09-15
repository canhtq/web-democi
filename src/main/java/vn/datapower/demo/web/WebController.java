package vn.datapower.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author canhthieu
 */
@Controller
public class WebController {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
