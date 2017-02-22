package com.cegekaschool.controllers;

import com.cegekaschool.domain.pineapple.PineappleService;
import com.cegekaschool.domain.secret.Secret;
import com.cegekaschool.domain.secret.SecretDTO;
import com.cegekaschool.domain.secret.SecretService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by roelg on 17/02/2017.
 */
@Named
@Controller
@RequestMapping(value = "/secret")
public class SecretController {
    @Inject
    private SecretService secretService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void createSecret(@RequestBody SecretDTO secret) {
        secretService.addSecret(secret);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Secret> getSecrets() {
        return secretService.getAllSecrets();
    }


}
