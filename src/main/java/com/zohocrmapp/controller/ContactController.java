package com.zohocrmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.services.ContactService;

@Controller                                                                    
public class ContactController {
	
	@Autowired
	private ContactService contactService;

	@RequestMapping("/listContacts")
	public String getAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.listContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
}
