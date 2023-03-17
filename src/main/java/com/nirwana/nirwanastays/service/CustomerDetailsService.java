package com.nirwana.nirwanastays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirwana.nirwanastays.model.CustomerDetailsModel;
import com.nirwana.nirwanastays.repository.CustomerDetailsRepository;




@Service
public class CustomerDetailsService {
	@Autowired
	CustomerDetailsRepository repo;

	public CustomerDetailsModel saveData(CustomerDetailsModel data) {
		return repo.save(data);
	}
}
