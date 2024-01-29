package com.bilisimio.webflux.dto.response;

import com.bilisimio.webflux.enums.CourseStatus;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseResponse {

    private String id;
    private String name;
    private InstructorResponse instructorResponse;
    private List<String> topics;
    private CourseStatus courseStatus;
}
