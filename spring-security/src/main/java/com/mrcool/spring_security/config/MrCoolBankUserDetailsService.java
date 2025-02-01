package com.mrcool.spring_security.config;

import com.mrcool.spring_security.model.Customer;
import com.mrcool.spring_security.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MrCoolBankUserDetailsService implements UserDetailsService {

    private final CustomerRepository customerRepository;
    /**
     * @param username the username identifying the user whose data is required.
     * @return UserDetails
     * @throws UsernameNotFoundException if the user could not be found or the user has no GrantedAuthority
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer = this.customerRepository.findByEmail(username).orElseThrow(()->new UsernameNotFoundException("User not found"));

        return new User(customer.getEmail(), customer.getPwd(), new ArrayList<>(List.of(new SimpleGrantedAuthority(customer.getRole()))));
    }
}
