package com.cyan.serviceimpl;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.cyan.service.EmailService;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;


@Service
public class EmailServiceImpl implements EmailService{

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Override
	public void SendEmail(String to, String subject, String body) throws javax.mail.MessagingException {
		
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(body.replaceAll("\r\n", "<br/>"), true);
		javaMailSender.send(mimeMessage);
		
		System.out.println("Successfully sent 1 Email");
	}
}
