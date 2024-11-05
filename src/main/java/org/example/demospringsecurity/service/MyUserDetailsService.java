package org.example.demospringsecurity.service;

import org.example.demospringsecurity.entity.UserPrincipal;
import org.example.demospringsecurity.entity.Users;
import org.example.demospringsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = userRepository.findByUserName(username);

        if (user == null) {
            System.out.println("User not found: " +  username);
            throw new UsernameNotFoundException("user not found");
        }

        return new UserPrincipal(user);
    }
}
