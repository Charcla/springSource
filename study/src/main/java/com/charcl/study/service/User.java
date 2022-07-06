package com.charcl.study.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class User implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
