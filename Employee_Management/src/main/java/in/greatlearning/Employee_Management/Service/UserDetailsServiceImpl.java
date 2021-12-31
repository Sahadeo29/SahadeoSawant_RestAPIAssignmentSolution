package in.greatlearning.Employee_Management.Service;

import in.greatlearning.Employee_Management.Security.MyUserDetails;
import in.greatlearning.Employee_Management.entities.User;
import in.greatlearning.Employee_Management.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user=userRepository.getByUsername(username);
        return new MyUserDetails(user);

    }
}
