package com.som.spring.recipe.services;

import com.som.spring.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
