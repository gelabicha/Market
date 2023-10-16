package ge.softlab.market.security;

import ge.softlab.market.entities.Users;
import ge.softlab.market.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

@RequiredArgsConstructor
public class ApplicationUserManager implements UserDetailsService {
    private final UserRepository userRepository;
    @Override

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional< Users > users = userRepository.findAllByEmail(email);
        if(users.isEmpty()){
            return null;
        }
           return users.get();
    }
}
