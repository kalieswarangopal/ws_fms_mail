package com.fms.mail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Autowired
	MailSender mailSender;

	public void sendMails(List<String> mailIDs) {

		List<SimpleMailMessage> msgList = new ArrayList<SimpleMailMessage>();

		mailIDs.forEach(mailID -> {
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setTo(mailID);
			msg.setSubject("Outreach feedback request");
			msg.setText("Please provide feedback for the outreach event");
			msgList.add(msg);
		});

		mailSender.send(msgList.toArray(new SimpleMailMessage[0]));
	}

}
