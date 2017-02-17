package com.cegekaschool.domain.secret;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by roelg on 17/02/2017.
 */
@Named
public class SecretService {

    @Autowired
    SecretRepository secretRepository;

    public void addSecret(Secret secret) {
        secretRepository.addSecret(secret);
    }
}
