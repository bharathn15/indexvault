package com.index.vault.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/indexvault/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<User> SaveClient(@RequestBody User user){
        try {
            return new ResponseEntity<>(userService.SaveUser(user), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/test")
    public String GetName(){
        return "Hi";
    }

    @GetMapping("/testRequestHeader")
    public String GetNamewithRequestHeader(@RequestHeader(value = "authorisation") String authorisation){
        return "Hi using request header " +authorisation;
    }
}
