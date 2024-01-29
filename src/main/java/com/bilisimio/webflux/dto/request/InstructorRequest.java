package com.bilisimio.webflux.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InstructorRequest {

    private String name;
    private String email;
}
