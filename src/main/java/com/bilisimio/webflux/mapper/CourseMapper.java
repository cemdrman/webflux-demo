package com.bilisimio.webflux.mapper;

import com.bilisimio.webflux.dto.request.CourseRequest;
import com.bilisimio.webflux.dto.response.CourseResponse;
import com.bilisimio.webflux.entity.Course;

public class CourseMapper {

    public static CourseResponse toResponse(Course course) {
        return CourseResponse.builder()
                .id(course.getId())
                .name(course.getName())
                .topics(course.getTopics())
                .courseStatus(course.getCourseStatus())
                .instructorResponse(InstructorMapper.toResponse(course.getInstructor()))
                .build();
    }

    public static Course toEntity(CourseRequest request){
        return Course.builder()
                .name(request.getName())
                .topics(request.getTopics())
                .build();
    }
}
