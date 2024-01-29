package com.bilisimio.webflux.repository;

import com.bilisimio.webflux.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, String> {
}
