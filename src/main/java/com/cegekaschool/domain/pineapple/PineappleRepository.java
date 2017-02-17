package com.cegekaschool.domain.pineapple;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Component
public class PineappleRepository {
    HashSet<Pineapple> pineapples = new HashSet<>();

    public void addPineapple(Pineapple pineapple){
        pineapples.add(pineapple);
    }

    public List<Pineapple> getAllPineapples(){
        return new ArrayList<Pineapple>(pineapples);
    }
}
