package com.bilisimio.webflux.repository;

import com.bilisimio.webflux.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.Optional;

public interface UserRepository extends ReactiveCrudRepository<User, String> {
    Optional<User> findByEmail(String email);
}
