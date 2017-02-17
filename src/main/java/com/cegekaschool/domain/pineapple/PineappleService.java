package com.cegekaschool.domain.pineapple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PineappleService {
    @Autowired
    PineappleRepository pineappleRepository = new PineappleRepository();

    public List<Pineapple> getAllPineapples(){
        return pineappleRepository.getAllPineapples();
    }

    public void addPineapple(String firstName, String lastName){
        pineappleRepository.addPineapple(new Pineapple(firstName, lastName));
    }
}
