package com.cegekaschool.domain.secret;

import org.springframework.stereotype.Component;

import java.util.HashSet;

/**
 * Created by roelg on 17/02/2017.
 */
@Component
public class SecretRepository {

    private HashSet<Secret> secretSet= new HashSet<>();


    public HashSet<Secret> getAllSecrets() {
        return new HashSet<Secret>(secretSet);
    }

    public boolean addSecret(Secret secret) {
        return secretSet.add(secret);
    }
}
