package com.cegekaschool.controllers;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.inject.Named;

@Named
@Controller //leg eens uit, pinga amor
@RequestMapping("/pineapple")
public class  PineappleController {
    @Inject
    private PineappleController pineappleController = new PineappleController();

}
