package com.nguyenbach.profolio.clean_architecture_example.infrastructure.persistence.adapter;

import com.nguyenbach.profolio.clean_architecture_example.domain.model.Course;
import com.nguyenbach.profolio.clean_architecture_example.domain.repository.CourseRepository;
import com.nguyenbach.profolio.clean_architecture_example.infrastructure.persistence.repository.JpaCourseRepository;
import com.nguyenbach.profolio.clean_architecture_example.infrastructure.persistence.entity.CourseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepositoryAdapter implements CourseRepository {
    private final JpaCourseRepository jpaRepository;

    public CourseRepositoryAdapter(JpaCourseRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Course save(Course course) {
        CourseEntity courseEntity = new CourseEntity();
        courseEntity.setId(course.getId());
        courseEntity.setPrice(course.getPrice());
        courseEntity.setTitle(course.getTitle());

        CourseEntity saved = jpaRepository.save(courseEntity);

        return new Course(saved.getId(), saved.getTitle(), saved.getPrice());
    }
}
