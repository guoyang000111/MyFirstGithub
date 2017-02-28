package sy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sy.model.City;
import sy.service.UserImp;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pc on 2017/2/28.
 */
@Controller
@RequestMapping("/userController")
public class UserController {
    public UserImp getUserImp() {
        return userImp;
    }

    public void setUserImp(UserImp userImp) {
        this.userImp = userImp;
    }
    @Autowired
    private UserImp userImp;

    @RequestMapping("/showUser/{id}")
    public  String showUser(@PathVariable int id,HttpServletRequest request ){//http://localhost:8080/userController/showUser/2.do
        City c=userImp.selectByPrimaryKey(id);
        request.setAttribute("city",c);
        return "showUser";
    }

    @RequestMapping("/showUser")
    public  String showUser1( int id,HttpServletRequest request ){//http://localhost:8080/userController/showUser.do?i=2
        City c=userImp.selectByPrimaryKey(id);
        request.setAttribute("city",c);
        return "showUser";
    }
}
