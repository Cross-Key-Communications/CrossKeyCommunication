package rocks.zipcode.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;
    private final User userBean;

    @Autowired
    public UserController(UserRepository userRepository, User userBean) {
        this.userRepository = userRepository;
        this.userBean = userBean;
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

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    @PostMapping("/save")
    public String saveUser(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("userName") String userName,
                           @RequestParam("birthDay") String birthDay,
                           @RequestParam("email") String email,
                           @RequestParam("password") String password){

        // Construct user entity
        User newUser = userBean;
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setUserName(userName);
        newUser.setEmail(email);
        newUser.setPassword(password);

        // Persist user
        userRepository.save(newUser);

        // Redirect to homepage
        return "redirect:/";
    }
}
