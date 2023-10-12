package ge.softlab.market.services;

import ge.softlab.market.entities.Users;
import ge.softlab.market.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {
    private final UserRepository userRepository;
    @Override
    public List<Users> search(String email, String first_name, String last_name) {

        var giga = new Users();
        return userRepository.findAll();
    }
}
