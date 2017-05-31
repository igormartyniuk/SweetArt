package com.cakes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cakes.entity.Cakes;
import com.cakes.entity.Ingredient;
import com.cakes.service.IngredientService;

@Controller
public class IngredientController {

	@Autowired
	private IngredientService ingredientService;

	@GetMapping("/ingredient")
	public String ingredient(Model model) {
		model.addAttribute("ingredient", ingredientService.findAll());
		return "ingredient";
	}

	@PostMapping("/ingredient")
	public String ingredient(@RequestParam String ingredientName,
							 @RequestParam double ingredientWeight,
							 @RequestParam double ingredientPrice) {
		Ingredient ingredient = new Ingredient();
		ingredient.setName(ingredientName);
		ingredient.setWeight(ingredientWeight);
		ingredient.setPrice(ingredientPrice);
		ingredientService.save(ingredient);
		return "redirect:/ingredient";

	}

	@GetMapping("/deleteIngredient/{id}")
	public String delete(@PathVariable int id) {

		ingredientService.delete(id);
		return "redirect:/ingredient";

	}

	@GetMapping("/updateIngredient/{id}")
	public String updateCake(@PathVariable int id, Model model) {

		Ingredient ingredient = ingredientService.findOne(id);

		model.addAttribute("currentIngredient", ingredient);

		return "updateIngredient";
	}

	@PostMapping("/updateIngredient/{id}")
	public String updateIngredient(@PathVariable int id,
                             @RequestParam String ingredientName,
							 @RequestParam double ingredientWeight,
							 @RequestParam double ingredientPrice) {

		Ingredient ingredient = ingredientService.findOne(id);


		ingredient.setName(ingredientName);
		ingredient.setWeight(ingredientWeight);
		ingredient.setPrice(ingredientPrice);

		ingredientService.save(ingredient);

		return "redirect:/ingredient";
	}

}
