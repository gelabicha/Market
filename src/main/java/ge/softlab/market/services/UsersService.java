package ge.softlab.market.services;

import ge.softlab.market.entities.Users;

import java.util.List;

public interface UsersService {
    List<Users> search(String email, String firstName, String lastName);
}
