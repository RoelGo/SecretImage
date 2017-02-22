package com.cegekaschool.domain.pineapple;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.concurrent.atomic.AtomicLong;

@Named
public class PineappleService {
    private final AtomicLong counter = new AtomicLong();
    @Inject
    PineappleDatatbaseRepository pineappleRepository;

    public Iterable<Pineapple> getAllPineapples() {
        return pineappleRepository.findAll();
    }

    public Pineapple addPineapple(String firstName, String lastName) {
        Pineapple output = findPineapple(firstName, lastName);
        if (output == null) {
            output = new Pineapple(counter.incrementAndGet(), firstName, lastName);
        }
        pineappleRepository.save(output);
        return output;
    }

    private Pineapple findPineapple(String firstName, String lastName) {
        return pineappleRepository.findByFirstNameAndLastName(firstName, lastName);
    }
}
