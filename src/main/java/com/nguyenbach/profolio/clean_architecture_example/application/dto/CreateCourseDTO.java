package com.nguyenbach.profolio.clean_architecture_example.application.dto;

import lombok.Data;

@Data
public class CreateCourseDTO {
    private String title;
    private double price;
}
