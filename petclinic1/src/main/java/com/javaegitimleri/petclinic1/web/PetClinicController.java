package com.javaegitimleri.petclinic1.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javaegitimleri.petclinic1.service.PetClinicService;

@Controller // spring container bu sınıftan bir controller bean'i yaratıcak ve sınıfta request mapping anotasyonlarını tanımlayrak gelen web isteklerini ilgili metotlarla eşleştirmeye çalışıcak
public class PetClinicController {
	@Autowired // böylece petcilinic service tipindeki bean Contorller bean'imizie enjekte etmiş olacağız.
	 private PetClinicService petClinicService;
	
	
	@RequestMapping ("/login.html")
	public ModelAndView login() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	
	
	
	
	 @RequestMapping(value= {"/","/index.html"})
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping ("/owners")
	@ResponseBody
	 public ModelAndView getOwners() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("owners", petClinicService.findOwners());
	    mav.setViewName("owners");
	    return mav;
	}
	
  @RequestMapping ("/pcs")
  @ResponseBody
	public String welcome() {
	return "Welcome to PetClinic World !";
	}
}
