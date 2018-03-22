package com.cyan.service;

import javax.mail.MessagingException;

public interface EmailService {

	void SendEmail(String to, String subject, String body) throws MessagingException;

}
