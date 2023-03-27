package com.nirwana.nirwanastays.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  
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
import com.nirwana.nirwanastays.model.Payment;
import com.nirwana.nirwanastays.repository.CampRepository;
import com.nirwana.nirwanastays.repository.CustomerDetailsRepository;
import com.nirwana.nirwanastays.repository.PaymentRepository;
import com.nirwana.nirwanastays.service.CampService;

@Controller
@RequestMapping("/camp")
@CrossOrigin(value = "${base.url}")
public class CampController {
	int a,b;
	int k,m;
	@Autowired
	CampService campservice;
	@Autowired
	CampRepository repo;
	@Autowired
	PaymentRepository payrepo;
	@Autowired
	CustomerDetailsRepository custrepo;
	
	 @GetMapping("/pay")
	    public String showpayment(Payment payment) {
	        
	        return "pay";
	    }
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

	) throws Throwable {
		
		custrepo.save(customerDetailsModel);
		
		System.err.println("customerDetailsModel-" + customerDetailsModel);
		System.err.println("camping+" + camping);
		
		a=customerDetailsModel.getNumOfAdults();
		b=customerDetailsModel.getNumOfChildren();
		
		
		
	String	y=customerDetailsModel.getCheckInDate();
	String	z=customerDetailsModel.getCheckOutDate();
		System.out.println(y+""+z);
		
Date datein=new SimpleDateFormat("yyyy-MM-dd").parse(y); 
		
		Date dateout=new SimpleDateFormat("yyyy-MM-dd").parse(z); 
		
		System.out.println(datein.getDay());
		System.out.println(dateout.getDay()-datein.getDay());
		
	//	dateout.getDay();
		
		k=dateout.getDay()-datein.getDay();		
		System.out.println(a+"   "+b);
		redirect.addFlashAttribute("customerDetailsModel", customerDetailsModel);

		return "redirect:/camp/bookPage";

	}

	@GetMapping("/bookPage")
	public String getBookPage(Payment payment) {
		System.err.println("inside getBookPage method");
		
		
		
		int c,d,sum,e;
		
		
		
//		a=customerDetailsModel.getNumOfAdults();
//		b=customerDetailsModel.getNumOfChildren();
		
		
		payment=payrepo.getpay("2500");
		String pay=payment.getAdult_price();
		String gpay=payment.getChildren_price();
		
		int i=Integer.parseInt(pay);
		
		int j=Integer.parseInt(gpay);
		payrepo.findAll();
		
		c= a * i;
		
		d= b * j;
		
		sum=c+d;
		
		e=k*sum;
		
		
		System.out.println("Adult total price "+c);
		System.out.println("Children total price "+d);
		System.out.println("total price "+sum);
		System.out.println("total price "+e+" for "+k+" days ");
		
		System.out.println("payment "+pay  +" gpayvalue " +gpay);
		
		return "bookPage";
	}

	/////////////////////////////////////////////////////////////////

}
