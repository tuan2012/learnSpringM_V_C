package live.cxtuan.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class home {
    @RequestMapping(value = "/admin/home",method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView md=new ModelAndView("Admin/home");
        return md;
    }
}
