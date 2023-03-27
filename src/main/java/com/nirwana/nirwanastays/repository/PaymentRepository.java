package com.nirwana.nirwanastays.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//import com.nirwana.nirwanastays.model.BookingDetailsModel;
import com.nirwana.nirwanastays.model.Payment;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface PaymentRepository extends JpaRepository<Payment,String> {
	@Query( value="select a from Payment a where a.adult_price=:adult_price")
	public Payment getpay(@Param("adult_price") String adult_price);
	
}
