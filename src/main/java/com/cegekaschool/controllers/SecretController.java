package com.cegekaschool.controllers;

import com.cegekaschool.domain.secret.Secret;
import com.cegekaschool.domain.secret.SecretService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by roelg on 17/02/2017.
 */
@Named
@Controller
@RequestMapping("/secret")
public class SecretController {
    @Inject
    private SecretService secretService;

    @RequestMapping(method = RequestMethod.POST)
    public void createSecret(Secret secret) {
        secretService.addSecret(secret);
    }


}
