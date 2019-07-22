package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-07-22T00:51:31.557Z")

@RestSchema(schemaId = "project354y")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Project354yImpl {

    @Autowired
    private Project354yDelegate userProject354yDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject354yDelegate.helloworld(name);
    }

}
