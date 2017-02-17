package com.cegekaschool.domain.secret;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.HashSet;

/**
 * Created by roelg on 17/02/2017.
 */
@Named
public class SecretService {

    @Inject
    SecretRepository secretRepository;

    public void addSecret(Secret secret) {
        secretRepository.addSecret(secret);
    }

    public HashSet<Secret> getAllSecrets() {
    return secretRepository.getAllSecrets();
    }

}
