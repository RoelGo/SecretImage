package com.cegekaschool.controllers;
import com.cegekaschool.domain.pineapple.Pineapple;
import com.cegekaschool.domain.pineapple.PineappleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/pineapple")
public class  PineappleController {
    @Inject
    private PineappleService pineappleService = new PineappleService();

    @RequestMapping (method = RequestMethod.GET)
    @ResponseBody
    public List<Pineapple> getPineapples

}
