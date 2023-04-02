package com.nirwana.nirwanastays.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nirwana.nirwanastays.model.CustomerDetailsModel;
import com.nirwana.nirwanastays.repository.CustomerDetailsRepository;
import com.nirwana.nirwanastays.service.CustomerDetailsService;




@Controller
@RequestMapping("/admin")
@CrossOrigin(value = "${base.url}")
public class AdminController {
	@Autowired
	CustomerDetailsService customerservice;
	@Autowired
    CustomerDetailsRepository customerDetailsRepository;

	@Autowired
	CustomerDetailsService customerDetailsService;

//	@GetMapping("/details")
//	public String getAllcustomerDetailsModel() {
//		  System.out.println(customerDetailsRepository.findAll());
//	    return  "details";
//	}
//	
	
	 @GetMapping("/details")
	    public String list(Model model) {
	        List<CustomerDetailsModel> myEntities = customerDetailsRepository.findAll();
	        model.addAttribute("myEntities", myEntities);
	        return "details";
	    }

	@GetMapping("/details1")
	public String getCamp2(Model model) {
		System.err.println("inside getCamp2 method");
		model.addAttribute("customerDetailsModel", new CustomerDetailsModel());
		return "details";
	}

//
////	public java.util.List<CustomerDetailsModel> getAllcustomerDetailsModel(){
////		return customerDetailsRepository.findAll();
////		
////	}


}