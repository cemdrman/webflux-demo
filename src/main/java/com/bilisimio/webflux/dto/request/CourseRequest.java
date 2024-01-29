package com.bilisimio.webflux.dto.request;

import com.bilisimio.webflux.entity.Instructor;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequest {

    private String name;
    private String instructorId;
    private List<String> topics;

}
