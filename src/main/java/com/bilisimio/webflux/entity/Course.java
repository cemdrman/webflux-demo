package com.bilisimio.webflux.entity;

import com.bilisimio.webflux.enums.CourseStatus;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "course")
public class Course {

    @Id
    private String id;
    private String name;
    private Instructor instructor;
    private List<String> topics;
    private CourseStatus courseStatus;

}
