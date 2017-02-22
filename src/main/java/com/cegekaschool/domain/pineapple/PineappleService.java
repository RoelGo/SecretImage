package com.cegekaschool.domain.pineapple;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.concurrent.atomic.AtomicLong;

@Named
public class PineappleService {
    @Inject
    PineappleDatatbaseRepository pineappleRepository;

    private final AtomicLong counter = new AtomicLong();

    public Iterable<Pineapple> getAllPineapples() {
        return pineappleRepository.findAll();
    }

    public Pineapple addPineapple(String firstName, String lastName) {
        Pineapple output = new Pineapple(counter.incrementAndGet(), firstName, lastName);
        pineappleRepository.save(output);
        return output;
    }
}
