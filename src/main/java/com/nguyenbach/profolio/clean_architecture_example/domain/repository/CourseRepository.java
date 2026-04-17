package com.nguyenbach.profolio.clean_architecture_example.domain.repository;

import com.nguyenbach.profolio.clean_architecture_example.domain.model.Course;

public interface CourseRepository {
    Course save(Course course);
}
