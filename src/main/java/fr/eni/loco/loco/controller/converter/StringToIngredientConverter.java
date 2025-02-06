package fr.eni.loco.loco.controller.converter;

import org.springframework.stereotype.Component;

import org.springframework.core.convert.converter.Converter;

import fr.eni.loco.loco.bll.LocoService;
import fr.eni.loco.loco.bo.Ingredient;

@Component
public class StringToIngredientConverter implements Converter<String, Ingredient> {

    private LocoService locoService;

	public StringToIngredientConverter(LocoService locoService) {
		this.locoService = locoService;
	}

	@Override
	public Ingredient convert(String idIngredient) {
		return this.locoService.readIngredient(Long.parseLong(idIngredient));
	}

}
