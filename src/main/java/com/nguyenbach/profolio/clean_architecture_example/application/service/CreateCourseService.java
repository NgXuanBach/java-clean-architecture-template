package com.nguyenbach.profolio.clean_architecture_example.application.service;

import com.nguyenbach.profolio.clean_architecture_example.application.dto.CreateCourseDTO;
import com.nguyenbach.profolio.clean_architecture_example.application.usecase.CreateCourseUseCase;
import com.nguyenbach.profolio.clean_architecture_example.domain.model.Course;
import com.nguyenbach.profolio.clean_architecture_example.domain.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
//@RequiredArgsConstructor
public class CreateCourseService implements CreateCourseUseCase {
    private final CourseRepository courseRepository;

    CreateCourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void execute(CreateCourseDTO request) {
        Course course = new Course(
                UUID.randomUUID().toString(),
                request.getTitle(),
                request.getPrice()
        );
        courseRepository.save(course);
    }
}
