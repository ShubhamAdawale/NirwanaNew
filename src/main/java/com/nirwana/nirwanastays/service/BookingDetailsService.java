package com.nirwana.nirwanastays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirwana.nirwanastays.model.BookingDetailsModel;
import com.nirwana.nirwanastays.repository.BookingDetailsRepository;




@Service
public class BookingDetailsService {
	@Autowired
	BookingDetailsRepository repo;
	public BookingDetailsModel saveData(BookingDetailsModel data) {
		return repo.save(data);

	}
}
