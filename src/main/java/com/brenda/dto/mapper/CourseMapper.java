package com.brenda.dto.mapper;

import org.springframework.stereotype.Component;

import com.brenda.dto.CourseDTO;
import com.brenda.enums.Category;
import com.brenda.model.Course;

@Component
public class CourseMapper {

    public CourseDTO toDTO(Course course) {
        if (course == null) {
            return null;
        }
        return new CourseDTO(course.getId(), course.getName(), "FrontEnd");
    }

    public Course toEntity(CourseDTO courseDTO) {
        if (courseDTO == null) {
            return null;
        }
        Course course = new Course();
        if (courseDTO.id() != null) {
            course.setId(courseDTO.id());
        }
        course.setName(courseDTO.name());
        course.setCategory(Category.FRONTEND);
        course.setStatus("Ativo");
        return course;
    }
}
