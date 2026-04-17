package com.nguyenbach.profolio.clean_architecture_example.presentation.controller;

import com.nguyenbach.profolio.clean_architecture_example.application.usecase.CreateCourseUseCase;
import com.nguyenbach.profolio.clean_architecture_example.presentation.mapper.CourseRequestMapper;
import com.nguyenbach.profolio.clean_architecture_example.presentation.request.CreateCourseRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CreateCourseUseCase createCourseUseCase;

    public CourseController(CreateCourseUseCase createCourseUseCase) {
        this.createCourseUseCase = createCourseUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CreateCourseRequest createCourseRequest) {
        createCourseUseCase.execute(CourseRequestMapper.toCreateCourseDTO(createCourseRequest));
        return ResponseEntity.ok().build();
    }
}
