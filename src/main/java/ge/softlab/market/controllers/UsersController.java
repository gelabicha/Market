package ge.softlab.market.controllers;

import ge.softlab.market.entities.Users;
import ge.softlab.market.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsersController {

private final UsersService usersService;
@GetMapping("users")
public List<Users> search(String email, String first_name, String last_name){

        return usersService.search(email,first_name,last_name);
    }
}
