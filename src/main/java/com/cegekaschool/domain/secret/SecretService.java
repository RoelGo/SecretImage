package com.cegekaschool.domain.secret;

import com.cegekaschool.domain.Mapper;

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
    private
    SecretDatabaseRepository secretRepository;

    @Inject
    private
    Mapper mapper;

    public Secret addSecret(SecretDTO secretDTO) {
        Secret output = findSecret(secretDTO);
        if (output == null) {
            output = mapper.mapSecret(counter.incrementAndGet(), secretDTO);
        }
        secretRepository.save(output);
        return output;
    }

    private Secret findSecret(SecretDTO secretDTO) {
        return secretRepository.findByPineappleAndPhoto(mapper.mapPineapple(secretDTO.getPineapple()), mapper.mapPhoto(secretDTO.getPhoto()));
    }

    public Iterable<Secret> getAllSecrets() {
        return secretRepository.findAll();
    }

}
