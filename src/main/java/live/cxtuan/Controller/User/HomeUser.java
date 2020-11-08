package live.cxtuan.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeUser {
    @RequestMapping(value = "/trangchu")
    public ModelAndView homeUser(){
        ModelAndView md=new ModelAndView("User/home");
        return md;
    }
    @RequestMapping(value = "/spring")
    public ModelAndView getSpring(){
        ModelAndView md=new ModelAndView("User/spring");
        return md;
    }
}
