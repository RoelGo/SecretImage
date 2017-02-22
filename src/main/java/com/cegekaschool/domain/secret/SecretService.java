package com.cegekaschool.domain.secret;

import com.cegekaschool.domain.Mapper;
import com.cegekaschool.domain.pineapple.PineappleService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by roelg on 17/02/2017.
 */
@Named
public class SecretService {

    private final AtomicLong counter = new AtomicLong();
    @Inject
    SecretDatabaseRepository secretRepository;

    @Inject
    Mapper mapper;

    public void addSecret(SecretDTO secret) {
        secretRepository.save(mapper.mapSecret(counter.incrementAndGet(), secret));
    }

    public Iterable<Secret> getAllSecrets() {
        return secretRepository.findAll();
    }

}
