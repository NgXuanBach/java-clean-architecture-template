package com.nguyenbach.profolio.clean_architecture_example.infrastructure.persistence.repository;

import com.nguyenbach.profolio.clean_architecture_example.infrastructure.persistence.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCourseRepository extends JpaRepository<CourseEntity, String> {
}
