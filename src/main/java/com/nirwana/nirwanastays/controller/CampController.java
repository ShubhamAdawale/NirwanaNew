package com.nirwana.nirwanastays.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nirwana.nirwanastays.model.CustomerDetailsModel;

import com.nirwana.nirwanastays.repository.CampRepository;
import com.nirwana.nirwanastays.service.CampService;

@Controller
@RequestMapping("/camp")
@CrossOrigin(value = "${base.url}")
public class CampController {
	@Autowired
	CampService campservice;
	@Autowired
	CampRepository repo;

	@PostMapping("/getcount")
	private String checkAvailability(String checkin, String checkout, int adults, int children) {
		int capacity = 20;
		int count = campservice.getBooking(checkin, checkout, adults, children);
		System.out.println(count);
		if (capacity >= count) {
			return "available";
		} else {
			return "not available";
		}
	}

	@GetMapping("/index")
	public String getIndex() {
		System.err.println("inside controller");
		return "index";
	}

	

	@GetMapping("/sites")
	public String getSites(Model model) {
		System.err.println("inside getSites method");

		return "sites";
	}

	@GetMapping("/about-us")
	public String getAboutUs(Model model) {
		System.err.println("inside aboutUs method");

		return "about-us";
	}

	@GetMapping("/gallery")
	public String getGallery(Model model) {
		System.err.println("inside getGallery method");

		return "gallery";
	}

	@GetMapping("/contact")
	public String getContact(Model model) {
		System.err.println("inside getContact method");

		return "contact";
	}
	
	@GetMapping("/blog")
	public String getBlog(Model model) {
		System.err.println("inside getBlog method");

		return "blog";
	}

	/////////////////////////////////////////////////////////////////

	@GetMapping("/camp1")
	public String getCamp1(Model model) {
		System.err.println("inside getCamp1 method");
		model.addAttribute("customerDetailsModel", new CustomerDetailsModel());
		return "camp1";
	}

	@GetMapping("/camp2")
	public String getCamp2(Model model) {
		System.err.println("inside getCamp2 method");
		model.addAttribute("customerDetailsModel", new CustomerDetailsModel());
		return "camp2";
	}

	@GetMapping("/camp3")
	public String getCamp3(Model model) {
		System.err.println("inside getCamp3 method");
		model.addAttribute("customerDetailsModel", new CustomerDetailsModel());
		return "camp3";
	}

	//////////////////////////////////////////////////////////////////

	@PostMapping("/add/customerdetails")

	public String addCustomerDetails(@RequestParam("camping") String camping,
			@ModelAttribute("customerDetailsModel") CustomerDetailsModel customerDetailsModel, Model model,
			RedirectAttributes redirect

	) {
		System.err.println("customerDetailsModel-" + customerDetailsModel);
		System.err.println("camping+" + camping);

		redirect.addFlashAttribute("customerDetailsModel", customerDetailsModel);

		return "redirect:/camp/bookPage";

	}

	@GetMapping("/bookPage")
	public String getBookPage(Model model) {
		System.err.println("inside getBookPage method");
		// model.addAttribute("customerDetailsModel",new CustomerDetailsModel());
		return "bookPage";
	}

	/////////////////////////////////////////////////////////////////

}
