package com.javaegitimleri.petclinic1.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.javaegitimleri.petclinic1.model.Owner;
import com.javaegitimleri.petclinic1.service.PetClinicService;

@Controller
public class PetClinicNewOwnerController {
	
	private PetClinicService petClinicService;

	@RequestMapping (value="/owners/new",method=RequestMethod.GET)
	public String newOwner() {
		return "newOwner";
	}
	@ModelAttribute
	public Owner initModel () {
		return new Owner();
	}	
	@RequestMapping(value="/owners/new",method=RequestMethod.POST)
	public String handleFormSubmit(@ModelAttribute @Valid Owner owner,BindingResult bindingResult) {
	     if(bindingResult.hasErrors()) {
	     return "newOwner";
	     }
	     
		
		petClinicService.createOwner(owner);
		redirectAttributes.addFlashAttribute("message","Owner created with id:" +owner.getId());
		return "redirect:/owners";
	}
}
