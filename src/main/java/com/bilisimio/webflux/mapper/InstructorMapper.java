package com.bilisimio.webflux.mapper;

import com.bilisimio.webflux.dto.request.InstructorRequest;
import com.bilisimio.webflux.dto.response.InstructorResponse;
import com.bilisimio.webflux.entity.Instructor;

public class InstructorMapper {

    public static InstructorResponse toResponse(Instructor instructor) {
        return InstructorResponse.builder()
                .id(instructor.getId())
                .email(instructor.getEmail())
                .name(instructor.getName())
                .build();
    }

    public static Instructor toEntity(InstructorRequest request) {
        return Instructor.builder()
                .name(request.getName())
                .email(request.getEmail())
                .build();
    }
}
