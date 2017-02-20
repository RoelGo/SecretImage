package com.cegekaschool.controllers;

import com.cegekaschool.domain.photo.Photo;
import com.cegekaschool.domain.pineapple.Pineapple;
import com.cegekaschool.domain.pineapple.PineappleService;
import com.cegekaschool.domain.secret.Secret;
import com.cegekaschool.domain.secret.SecretService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by roelg on 17/02/2017.
 */
@Named
@Controller
@RequestMapping(value = "/secret")
public class SecretController {
    @Inject
    private SecretService secretService;
    @Inject
    private PineappleService pineappleService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void createSecret(@RequestBody Secret secret) {
        secretService.addSecret(secret);
        pineappleService.addPineapple(secret.getPineapple().getFirstName(),secret.getPineapple().getLastName());
    }
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public HashSet<Secret> getSecrets() {
       return secretService.getAllSecrets();
    }


}
