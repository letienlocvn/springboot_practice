package loclt.com.basic_springboot.spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    public UserRepository userRepository;
    @PostMapping("add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setName(name);
        n.setEmail(email);

        // Lưu một entity user
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping(path ="userId/{id}")
    public @ResponseBody Optional<User> findUserById(@PathVariable(value = "id") int id) {
        return userRepository.findById(id);
    }


}
