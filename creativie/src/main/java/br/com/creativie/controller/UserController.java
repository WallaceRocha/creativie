package br.com.creativie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.creativie.exception.ResourceNotFoundException;
import br.com.creativie.model.User;
import br.com.creativie.repository.UserRepository;
import br.com.creativie.security.CurrentUser;
import br.com.creativie.security.UserPrincipal;

public class UserController {

	@Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
