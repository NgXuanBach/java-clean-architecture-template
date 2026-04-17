package com.nguyenbach.profolio.clean_architecture_example.presentation.mapper;

import com.nguyenbach.profolio.clean_architecture_example.application.dto.CreateCourseDTO;
import com.nguyenbach.profolio.clean_architecture_example.presentation.request.CreateCourseRequest;

public class CourseRequestMapper {
    public static CreateCourseDTO toCreateCourseDTO(CreateCourseRequest createCourseRequest) {
        CreateCourseDTO request = new CreateCourseDTO();
        request.setPrice(createCourseRequest.price);
        request.setTitle(createCourseRequest.title);
        return request;
    }
}
