package com.lectures.SampleProject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.lectures.SampleProject.model.Category;
import com.lectures.SampleProject.service.CategoryService;

@RestController
public class CategoryContoller {
	
	//dependency injection using autowired annotation
	@Autowired
	private CategoryService categoryService;
	
	//service dependencies been injected using constructor
//	public CategoryContoller(CategoryService categoryService) {
//		super();
//		this.categoryService = categoryService;
//	}

	@GetMapping("/api/public/categories")
	public ResponseEntity<List<Category>> getAllCategories(){
		return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK);
	}
	
	@PostMapping("/api/public/categories")
	public ResponseEntity<String> createCategory(@RequestBody Category category) {
		categoryService.createCategory(category);
		return new ResponseEntity<>("Category created Successfully..!", HttpStatus.OK);
	}
	
	@DeleteMapping("/api/admin/categories/{categoryID}")
	public ResponseEntity<String> deleteCategory(@PathVariable Long categoryID) {
		try {
			String status = categoryService.deleteCategory(categoryID);
			return new ResponseEntity<>(status, HttpStatus.OK);			
		} catch (ResponseStatusException e) {
			return new ResponseEntity<>(e.getReason(), e.getStatusCode());
		}
	}
	
	@PutMapping("/api/admin/categories/{categoryID}")
	public ResponseEntity<String> updateCategory(@PathVariable Long categoryID, @RequestBody Category updatedCategory){
		try {
			String status = categoryService.updateCategory(categoryID, updatedCategory);
			return new ResponseEntity<>(status, HttpStatus.OK);			
		} catch(ResponseStatusException e) {
			return new ResponseEntity<>(e.getReason(),e.getStatusCode());
		}
	}
	
}
