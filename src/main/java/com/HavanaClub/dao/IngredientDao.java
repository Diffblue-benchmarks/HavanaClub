package com.HavanaClub.dao;

import com.HavanaClub.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientDao extends JpaRepository<Ingredient, Integer> {


}
