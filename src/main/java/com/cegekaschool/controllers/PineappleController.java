package com.cegekaschool.controllers;

import com.cegekaschool.domain.pineapple.Pineapple;
import com.cegekaschool.domain.pineapple.PineappleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
@RequestMapping("/pineapple")
public class PineappleController {
    @Inject
    private PineappleService pineappleService = new PineappleService();

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    Iterable<Pineapple> getPineapples() {
        return pineappleService.getAllPineapples();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    void addPineapple(
            @RequestParam(value = "firstName", required = true) String firstName,
            @RequestParam(value = "lastName", required = true) String lastName) {
        pineappleService.addPineapple(firstName, lastName);
    }
}

