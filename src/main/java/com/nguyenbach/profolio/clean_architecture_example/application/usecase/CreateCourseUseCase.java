package com.nguyenbach.profolio.clean_architecture_example.application.usecase;

import com.nguyenbach.profolio.clean_architecture_example.application.dto.CreateCourseDTO;

public interface CreateCourseUseCase {
    void execute(CreateCourseDTO request);
}
