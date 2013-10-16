package tv.yanliang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import tv.yanliang.service.UserService;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/admin/users/{start}-{max}", method = RequestMethod.GET)
    public ModelAndView listAll(@PathVariable("start") int start,
                                @PathVariable("max") int max) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", userService.get(start, max));
        modelAndView.setViewName("admin/user/list");
        return modelAndView;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
