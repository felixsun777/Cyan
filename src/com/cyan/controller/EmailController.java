package com.cyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyan.entity.Customer;
import com.cyan.service.CustomerService;
import com.cyan.service.EmailService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.mail.MessagingException;

@Controller
@RequestMapping("/email")
public class EmailController {

	@Autowired
	private EmailService emailService;

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/")
	public String email() {
		return "email";
	}

	@RequestMapping("/send")
	public String send(String username, String subject, String message, Map<String, String> map) throws MessagingException {
		
		if(username.equals("")) {
			List<Customer> customers = customerService.retrieveAllCustomers();
			List<String> emails = customers.parallelStream()
											.filter(c -> c.getReceiveEmail()!=null && c.getReceiveEmail())
											.filter(c -> !c.getEmail().equals(""))
											.map( c -> c.getEmail())
											.collect(Collectors.toList());
			for(String email : emails) {
				emailService.SendEmail(email, subject, message);
			}
			map.put("message", "Emails have been sent!");
		}else {
			//find the email of the user, if email not exist show alert
			Customer customer = customerService.getCustomerByUserName(username);
			if(customer == null){
				map.put("message", "The Customer doesn't exist!");
				return "email";
			}
			if(customer.getReceiveEmail()==null || !customer.getReceiveEmail()) {
				map.put("message", "Customer doesn't allow to receive promotion emails!");
				return "email";
			}
			if(customer.getEmail().equals("")) {
				map.put("message", "No customer email address information exist!");
				return "email";
			}
			emailService.SendEmail(customer.getEmail(), subject, message);
			map.put("message", "Email has been sent!");
		}

		return "email";
	}
}
