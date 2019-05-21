package br.com.creativie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.creativie.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByEmail(String email);

    Boolean existsByEmail(String email);
}
