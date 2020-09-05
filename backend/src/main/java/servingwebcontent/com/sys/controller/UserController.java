package servingwebcontent.com.sys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import servingwebcontent.com.sys.response.responseBase;
import servingwebcontent.com.sys.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController
{
    private final UserService userService;

    public UserController(UserService userService)
    {
        this.userService=userService;
    }

    @RequestMapping("/login")
    public <T> responseBase<T> login(@RequestParam("username") String username,
                                     @RequestParam("password") String password,
                                     @RequestParam("character") String character)
    {
        return userService.UserLogin(username,password,character);
    }
}
