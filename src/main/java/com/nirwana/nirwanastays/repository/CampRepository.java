package com.nirwana.nirwanastays.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nirwana.nirwanastays.model.CampData;

import jakarta.transaction.Transactional;
@Transactional
@Repository
public interface CampRepository extends JpaRepository<CampData,Integer> {

	@Query( value="select count(*) from camp where checkin=?1 and checkout=?2", nativeQuery=true)
	public int getBookings(String checkin,String checkout,int adults,int children);
}
