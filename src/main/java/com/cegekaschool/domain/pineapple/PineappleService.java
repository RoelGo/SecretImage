package com.cegekaschool.domain.pineapple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class PineappleService {
    @Inject
    PineappleRepository pineappleRepository;

    public List<Pineapple> getAllPineapples(){
        return pineappleRepository.getAllPineapples();
    }

    public void addPineapple(String firstName, String lastName){
        pineappleRepository.addPineapple(new Pineapple(firstName, lastName));
    }
}
