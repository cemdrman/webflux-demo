package com.bilisimio.webflux.controller;

import com.bilisimio.webflux.dto.request.UserRequest;
import com.bilisimio.webflux.dto.response.UserResponse;
import com.bilisimio.webflux.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public Mono<UserResponse> save(@RequestBody UserRequest request) {
        return userService.save(request);
    }

    @GetMapping("/{id}")
    public Mono<UserResponse> getBydId(@PathVariable String id) {
        return userService.getById(id);
    }

    @GetMapping
    public Flux<UserResponse> getAll() {
        return userService.getAll();
    }
}
