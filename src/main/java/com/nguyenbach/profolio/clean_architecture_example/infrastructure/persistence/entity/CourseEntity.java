package com.nguyenbach.profolio.clean_architecture_example.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "courses")
public class CourseEntity {
    @Id
    private String id;
    private String title;
    private double price;
}
