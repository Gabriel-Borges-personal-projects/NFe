package com.project.service.impl;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.project.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService{
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public void sendRecoverPasswordEmail() {
		try {
			 MimeMessage mail = mailSender.createMimeMessage();
		
		     MimeMessageHelper helper = new MimeMessageHelper( mail );
		     helper.setTo( "borges.gabrielc@gmail.com" );
		     helper.setSubject( "Teste Envio de e-mail" );
		     helper.setText("<p>Hello from Spring Boot Application</p>", true);
		     mailSender.send(mail);
		} catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
