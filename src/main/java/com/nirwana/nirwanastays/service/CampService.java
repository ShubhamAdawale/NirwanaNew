package com.nirwana.nirwanastays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirwana.nirwanastays.repository.CampRepository;


@Service
public class CampService {
	@Autowired
	CampRepository camprepo;

//	public CountHistoryData savec(CountHistoryData h) {
//		return countrepo.save(h);
//	}
//
	public int getBooking(String checkin,String checkout,int adults,int children) {
		return camprepo.getBookings(checkin,checkout,adults,children);
	}

}
