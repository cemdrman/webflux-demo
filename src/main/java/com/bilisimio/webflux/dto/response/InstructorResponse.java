package com.bilisimio.webflux.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InstructorResponse {

    private String id;
    private String name;
    private String email;
}
