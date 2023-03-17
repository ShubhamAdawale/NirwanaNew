package com.nirwana.nirwanastays.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirwana.nirwanastays.model.BookingDetailsModel;
import com.nirwana.nirwanastays.repository.BookingDetailsRepository;
import com.nirwana.nirwanastays.service.BookingDetailsService;




@RestController
@RequestMapping("/booking")
public class BookingDetailsController {

	@Autowired
	BookingDetailsService bookingservice;
	@Autowired
	BookingDetailsRepository repo;

	@PostMapping("/bookingdata")
	public BookingDetailsModel saveData(@RequestBody BookingDetailsModel bookingData) {
		System.out.println(bookingData);
		return bookingservice.saveData(bookingData);
	}

//	@GetMapping({ "/csvappend" })
//	public String downloadrgrPdf() throws IOException {
//		String csv = "/home/amols/Downloads/csa_image_1.csv";
//		CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
//
//		String[] record = "3,David,Feezor,USA,40,hhhh,bjbhj".split(",");
//
//		writer.writeNext(record);
//
//		writer.close();
//		return "done";
//	}



//	@GetMapping("/createxl")
//	public void createExcel() throws IOException, InvalidFormatException {
//		String[] columns = { "First Name", "Last Name", "Email", "Date Of Birth" };
//		List<Contact> contacts = new ArrayList<Contact>();
//
//		contacts.add(new Contact("Sylvain", "Saurel", "sylvain.saurel@gmail.com", "17/01/1980"));
//		contacts.add(new Contact("Albert", "Dupond", "sylvain.saurel@gmail.com", "17/08/1989"));
//		contacts.add(new Contact("Pierre", "Dupont", "sylvain.saurel@gmail.com", "17/07/1956"));
//		contacts.add(new Contact("Mariano", "Diaz", "sylvain.saurel@gmail.com", "17/05/1988"));
//
//		Workbook workbook = new XSSFWorkbook();
//		Sheet sheet = workbook.createSheet("Contacts");
//
//		Font headerFont = workbook.createFont();
//		headerFont.setBold(true);
//		headerFont.setFontHeightInPoints((short) 14);
//		headerFont.setColor(IndexedColors.RED.getIndex());
//
//		CellStyle headerCellStyle = workbook.createCellStyle();
//		headerCellStyle.setFont(headerFont);
//
//		// Create a Row
//		Row headerRow = sheet.createRow(0);
//
//		for (int i = 0; i < columns.length; i++) {
//			Cell cell = headerRow.createCell(i);
//			cell.setCellValue(columns[i]);
//			cell.setCellStyle(headerCellStyle);
//		}
//
//		// Create Other rows and cells with contacts data
//		int rowNum = 1;
//
//		for (Contact contact : contacts) {
//			Row row = sheet.createRow(rowNum++);
//			row.createCell(0).setCellValue(contact.firstName);
//			row.createCell(1).setCellValue(contact.lastName);
//			row.createCell(2).setCellValue(contact.email);
//			row.createCell(3).setCellValue(contact.dateOfBirth);
//		}
//
//		// Resize all columns to fit the content size
//		for (int i = 0; i < columns.length; i++) {
//			sheet.autoSizeColumn(i);
//		}
//
//		// Write the output to a file
//		FileOutputStream fileOut = new FileOutputStream("/home/amols/Downloads/contacts.xlsx");
//		workbook.write(fileOut);
//		fileOut.close();
//	}
//	@PostMapping("/validity")
//	private List<String> unBlockedSites(@RequestBody String[] site) {
//		List<String> unblockedSites = new ArrayList<String>();
//		List<String> blockedSites = new ArrayList<String>();
//		for (int i = 0; i < site.length; i++) {
//			// site[i] = site[i].replaceFirst("https", "http");
//			try {
//				HttpURLConnection conn = (HttpURLConnection) new URL(site[i]).openConnection();
//				conn.getContent();
//				if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
//					blockedSites.add(site[i]);
//				} else if(conn.getResponseCode() != 200){
//					blockedSites.add(site[i]);
//				}
//				else {
//					unblockedSites.add(site[i]);
//				}
//			} catch (SocketTimeoutException tout) {
//				blockedSites.add(site[i]);
//				tout.printStackTrace();
//			} catch (UnknownHostException uhex) {
//				blockedSites.add(site[i]);
//				uhex.printStackTrace();
//			}
//			catch (IOException ioex) {
//				blockedSites.add(site[i]);
//				ioex.printStackTrace();
//			}
//		}
//		return unblockedSites;
//	}
}
