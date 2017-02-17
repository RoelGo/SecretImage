package com.cegekaschool.controllers;

import com.cegekaschool.domain.secret.SecretService;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by roelg on 17/02/2017.
 */
@Named
public class SecretController {
    @Inject
    private SecretService secretService;

}
