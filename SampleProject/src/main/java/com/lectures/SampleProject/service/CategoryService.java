package com.lectures.SampleProject.service;

import java.util.List;

import com.lectures.SampleProject.model.Category;

//for the loose coupling we are creating service interface and another implement class
public interface CategoryService {
	List<Category> getAllCategories();
	void createCategory(Category category);
	String deleteCategory(Long categoryID);
	String updateCategory(Long categoryID, Category updatedCategory);
}
