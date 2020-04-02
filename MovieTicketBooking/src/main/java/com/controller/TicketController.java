package com.controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.model.Ticket;

public class TicketController {
	
	
	public String calculateTotalCost(@ModelAttribute("ticket") Ticket ticket,ModelMap model,BindingResult result) {
		
		return null;
	}



}
