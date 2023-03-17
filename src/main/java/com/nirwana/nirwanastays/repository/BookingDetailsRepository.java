package com.nirwana.nirwanastays.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirwana.nirwanastays.model.BookingDetailsModel;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface BookingDetailsRepository extends JpaRepository<BookingDetailsModel,Integer> {

}
