package com.web.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.api.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
