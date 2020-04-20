package com.fms.mail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fms.mail.service.MailService;

@RestController
public class MailController {

	@Autowired
	MailService mailService;

	@PostMapping("/mail")
	public void sendMails(@RequestBody List<String> mailIDs) {

		mailService.sendMails(mailIDs);
	}

}
