package com.cegekaschool.domain.pineapple;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by roelg on 22/02/2017.
 */
public interface PineappleDatatbaseRepository extends CrudRepository<Pineapple, Long> {

    Pineapple findByFirstNameAndLastName(String firstName, String lastName);
}
