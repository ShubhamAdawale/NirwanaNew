package com.nirwana.nirwanastays.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nirwana.nirwanastays.model.CustomerDetailsModel;
import com.nirwana.nirwanastays.repository.CustomerDetailsRepository;
import com.nirwana.nirwanastays.service.CustomerDetailsService;




@Controller
@RequestMapping("/customer")
@CrossOrigin(value = "${base.url}")
public class CustomerDetailsController {
	@Autowired
	CustomerDetailsService customerservice;
	@Autowired
	CustomerDetailsRepository repo;
	@PostMapping("/customerdata")
	public CustomerDetailsModel saveData(@RequestBody CustomerDetailsModel customerData) {

		CustomerDetailsModel customerDetailsModel = new CustomerDetailsModel();
		customerDetailsModel.setF_name("Mr WorldWide");
		customerDetailsModel.setL_name("World isWide");
		customerDetailsModel.setNumOfChildren(2);



		System.out.println(customerDetailsModel);
		return customerservice.saveData(customerData);
	}



}
