package com.artisan.formTagLibrary.erros;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ArtisanYValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return ArtisanY.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
				"required.name", "Field name is required.");
	}
}
