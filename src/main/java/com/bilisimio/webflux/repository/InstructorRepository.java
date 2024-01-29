package com.bilisimio.webflux.repository;

import com.bilisimio.webflux.entity.Instructor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface InstructorRepository extends ReactiveCrudRepository<Instructor, String> {
}
