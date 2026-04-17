package com.nguyenbach.profolio.clean_architecture_example.presentation.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class CreateCourseRequest {
    @NotBlank
    public String title;

    @Min(0)
    public double price;
}
