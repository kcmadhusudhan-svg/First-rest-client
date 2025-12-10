package com.tcs.boot.Controller;

import org.springframework.http.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tcs.boot.entity.Loan;

@RestController
@RequestMapping("/client/loan/api/v1.0")
public class LoanController {

	@Autowired
	RestTemplate template;
	
	//LoanService service;
	// http://localhost:8090/loan/api/v1.0/create  JAXB

/*	
	  @PostMapping("/create") 
	  public Loan loanApplication(@RequestBody Loan loan) {
	  return service.addLoan(loan); }
*/	 
	
	
	@PostMapping(value="/create",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Loan> loanApplication(@RequestBody Loan loan) {
		//return new ResponseEntity<Loan>(newLoan,headers,HttpStatus.OK);
		return null;  
		  }
	
	
	
	// http://localhost:8090/loan/api/v1.0/fetch/1
	/*
	@GetMapping("/fetch/{lid}")
	public Loan getLoan(@PathVariable Long lid) {
		return service.getLoan(lid);
	}
	*/
	
	
	/*
	 * @GetMapping("/fetch/{lid}") public ResponseEntity<Loan>getLoan(@PathVariable
	 * Long lid) { String urlString =
	 * "http://localhost:8999/loan/api/v1.0/fetch/hello";// API GAteway port Loan
	 * loan = template.getForObject(urlString,Loan.class); return
	 * ResponseEntity.ok(loan); }
	 */
	
	  @GetMapping("/fetch/hi") 
	  public String gethello() {
		  String urlString = "http://localhost:8999/loan/api/v1.0/fetch/hello";// API GAteway port Loan
		  String result = template.getForObject(urlString, String.class);
		  return result;
		}
		/*
		 * public ResponseEntity<Loan>getLoan(@PathVariable Long lid) { 
		 * String urlString
		 * = "http://localhost:8999/loan/api/v1.0/fetch/hi";// API GAteway port Loan
		 * loan = template.getForObject(urlString,Loan.class); return
		 * ResponseEntity.ok(loan); }
		 */	 	
	
	@GetMapping("/fetchAll")
	//public List<Loan> getLoans() {
	//	return null;  
	//}
	public ResponseEntity<List<Loan>> getLoans() {
		ResponseEntity<List<Loan>>responseEntity=
				template.exchange("http://localhost:8090/loan/api/v1.0/fetchAll",HttpMethod.GET,null,
						new ParameterizedTypeReference<List<Loan>>(){});
		
		List<Loan> listOfLoans = responseEntity.getBody();
				
		return  ResponseEntity.ok(listOfLoans);
	}
	

	@PutMapping("/modify")  //for full update
	public Loan doUpdate(@RequestBody Loan loan) {
		return null;  
	}

	@PutMapping("/modify2")  //for full update
	public Loan doUpdate2(@RequestBody Loan loan) {
		return null;  
	}

	@DeleteMapping("/remove/{lid}")
	public ResponseEntity<Void> delete(@PathVariable Long lid){
		return null;  
		
		
}
		
			
	
	
}
