package com.bilisimio.webflux.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "customer")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private List<Course> cources;

}
