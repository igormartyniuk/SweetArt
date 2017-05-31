package com.cakes.controller;

import com.cakes.dao.CakesDao;
import com.cakes.entity.Ingredient;
import com.cakes.service.IngredientService;
import editors.IngredientEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import com.cakes.entity.Cakes;
import com.cakes.service.CakesService;

@Controller
public class CakesController {

	@Autowired
	private CakesService cakesService;

	@Autowired
	private IngredientService ingredientService;

	@InitBinder
	public void init(WebDataBinder binder){
		binder.registerCustomEditor(Ingredient.class, new IngredientEditor());
	}

	@GetMapping("/cakes")
	public String Cakes(Model model) {

		for (Ingredient ingredient : ingredientService.findAll()) {
			System.out.println("ingredient = " + ingredient);
		}

		model.addAttribute("cake", cakesService.findAll());
		model.addAttribute("ingredients", ingredientService.findAll());
		model.addAttribute("cakes", new Cakes());

		return "cakes";
	}

	@PostMapping("/cakes")
	public String saveCakes(@ModelAttribute Cakes cakes,
							@ModelAttribute Ingredient ingredient) {

		System.out.println("cakes = " + cakes);
		cakes.getIngredient().add(ingredient);
		cakesService.save(cakes);

		return "redirect:/cakes";
	}

	@GetMapping("/deleteCakes/{id}")
	public String deleteCake(@PathVariable int id) {

		cakesService.delete(id);

		return "redirect:/cakes";
	}
	
	@GetMapping("/updateCakes/{id}")
	public String updateCake(@PathVariable int id, Model model,@ModelAttribute Ingredient Ingredient){
		
		Cakes cakes = cakesService.findOne(id);
		model.addAttribute("ingredients", ingredientService.findAll());
		model.addAttribute("currentCake", cakes);
		
		return "updateCakes";
	}
	
	@PostMapping("/updateCakes/{id}")
	public String updateUser(@PathVariable int id, 
							 @RequestParam String cakeType, 
							 @RequestParam String cakeName,
							 @RequestParam double weight
	){


		Cakes cakes = cakesService.findOne(id);
	
		cakes.setCakeType(cakeType);
		cakes.setCakeName(cakeName);
		cakes.setWeight(weight);
		
		cakesService.save(cakes);
	
	return "redirect:/cakes";
	}
}
