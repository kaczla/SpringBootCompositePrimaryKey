package pl.kaczla.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kaczla.app.model.User;
import pl.kaczla.app.model.UserPK;
import pl.kaczla.app.service.UserServiceEM;

@RestController
@RequestMapping("/api/em/user")
public class UserControllerEM {

    @Autowired
    UserServiceEM userService;

    @RequestMapping(method = RequestMethod.GET)
    public User getUser(
            @RequestParam Long id,
            @RequestParam String type
    ) {
        UserPK key = new UserPK(id, type);
        return userService.findByKey(key);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        return userService.insert(user);
    }

}
