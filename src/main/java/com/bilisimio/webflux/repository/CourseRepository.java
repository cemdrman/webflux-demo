package com.bilisimio.webflux.repository;

import com.bilisimio.webflux.entity.Course;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CourseRepository extends ReactiveCrudRepository<Course, String> {
}
