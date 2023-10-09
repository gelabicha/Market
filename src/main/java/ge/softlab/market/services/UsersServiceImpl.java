package ge.softlab.market.services;

import ge.softlab.market.entities.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {
    private final UsersService usersService;
    @Override
    public List<Users> search(String email, String first_name, String last_name) {
        return  null;
    }
}
