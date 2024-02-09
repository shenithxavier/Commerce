package Commerce.Controller;

import Commerce.Repository.UserRepository;
import Commerce.Request.UserRequest;
import Commerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String AddUser(@RequestBody UserRequest userRequest) {
        return userService.AddUser(userRequest);
    }
}
