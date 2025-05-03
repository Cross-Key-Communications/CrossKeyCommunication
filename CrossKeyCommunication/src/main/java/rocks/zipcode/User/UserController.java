package rocks.zipcode.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    public UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @GetMapping
    @ResponseBody
    //this is what was returning the json to the webpage
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/signup")
    public String showSignUpPage() {
        return "signup";
    }
}
