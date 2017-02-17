package com.cegekaschool.controllers;

import com.cegekaschool.domain.photo.Photo;
import com.cegekaschool.domain.pineapple.Pineapple;
import com.cegekaschool.domain.secret.Secret;
import com.cegekaschool.domain.secret.SecretService;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void createSecret(Secret secret) {
        secretService.addSecret(secret);
    }
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Secret> getSecrets() {
        secretService.addSecret(new Secret(new Pineapple("roel", "Goossens"),new Photo("c/lol") ));
       return new ArrayList<Secret>(secretService.getAllSecrets());
    }


}
