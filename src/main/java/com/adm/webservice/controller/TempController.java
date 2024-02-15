package com.adm.webservice.controller;

import com.adm.webservice.example.entity.VO.TempAdminVO;
import com.adm.webservice.example.service.TempAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

/*
    example controller with simple tempAdmin Object.
 */

@Controller
public class TempController {

    @Autowired
    TempAdminService tempAdminService;

    @QueryMapping
    public TempAdminVO getByUserName (@Argument String userName) {
        return tempAdminService.getByUserName(userName);
    }


}
