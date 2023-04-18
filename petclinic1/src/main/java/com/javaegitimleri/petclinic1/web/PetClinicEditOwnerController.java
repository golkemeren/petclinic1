package com.javaegitimleri.petclinic1.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.javaegitimleri.petclinic1.model.Owner;
import com.javaegitimleri.petclinic1.service.PetClinicService;

@Controller
public class PetClinicEditOwnerController {

	@Autowired
	private PetClinicService petClinicService;
	
	@RequestMapping(value="/owner/{id}",method=RequestMethod.GET)
	public String loadOwner(@PathVariable Long id,ModelMap modelMap) {
		
		Owner owner = petClinicService.findOwner(id);
		modelMap.put("owner",owner);
		return "editOwner";
	}
	
	@RequestMapping(value="/owner/update{id}",method=RequestMethod.POST)
	public String handleFormSubmit(@ModelAttribute @Valid Owner owner,BindingResult bindingResult,RedirectAttributes redirectAttributes) {
		
		if(bindingResult.hasErrors())
			return "editOwner";
		
		petClinicService.update(owner);
		redirectAttributes.addFlashAttribute("message","Owner update with id :" + owner.getId());
		return "redirect:/owners";
		
		
	}
	
}