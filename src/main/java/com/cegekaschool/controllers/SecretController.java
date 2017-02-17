package com.cegekaschool.controllers;

import com.cegekaschool.domain.secret.SecretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by roelg on 17/02/2017.
 */
@Component
public class SecretController {
@Autowired
    private SecretService secretService;

}
