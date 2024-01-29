package com.bilisimio.webflux.mapper;

import com.bilisimio.webflux.dto.request.UserRequest;
import com.bilisimio.webflux.dto.response.UserResponse;
import com.bilisimio.webflux.entity.User;

public class UserMapper {

    public static User toEntity(UserRequest request) {
        return User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .build();
    }

    public static UserResponse toResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .email(user.getEmail())
                .name(user.getName())
                .build();
    }
}
