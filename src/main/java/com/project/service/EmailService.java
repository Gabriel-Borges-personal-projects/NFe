package com.project.service;

import com.project.model.entity.User;

public interface EmailService {

	String sendRecoverPasswordEmail(User user, String url);

}
