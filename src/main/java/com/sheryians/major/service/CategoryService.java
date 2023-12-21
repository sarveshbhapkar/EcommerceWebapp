package com.sheryians.major.service;

import com.sheryians.major.model.Category;
import com.sheryians.major.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryReporisory;

    public List<Category> getAllCategory(){
        return categoryReporisory.findAll();
    }
    public void addcategory(Category category){
        categoryReporisory.save(category);

    }
    public void removeCategoryById(int id){
        categoryReporisory.deleteById(id);

    }
    public Optional<Category> getCategoryById(int id){
        return categoryReporisory.findById(id);}


}
