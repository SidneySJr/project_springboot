package com.sidneyjr.course.repositories;

import com.sidneyjr.course.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
