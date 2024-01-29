package com.bilisimio.webflux.service;

import com.bilisimio.webflux.dto.request.UserRequest;
import com.bilisimio.webflux.dto.response.UserResponse;
import com.bilisimio.webflux.entity.User;
import com.bilisimio.webflux.mapper.UserMapper;
import com.bilisimio.webflux.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public Mono<UserResponse> save(UserRequest request) {

        User user = UserMapper.toEntity(request);

        Mono<User> savedUser = userRepository.save(user);

        return savedUser.map(UserMapper::toResponse);
    }

    public Mono<UserResponse> getById(String id) {
        Mono<User> userMono = userRepository.findById(id);
        return userMono.map(UserMapper::toResponse);
    }

    public Flux<UserResponse> getAll() {

        Flux<User> userFlux = userRepository.findAll();

        return userFlux.map((UserMapper::toResponse))
                .switchIfEmpty(Flux.empty());
    }
}
