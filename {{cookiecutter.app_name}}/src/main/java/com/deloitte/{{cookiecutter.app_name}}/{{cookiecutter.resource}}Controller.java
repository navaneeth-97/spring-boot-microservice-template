package com.deloitte.{{cookiecutter.app_name}};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class {{cookiecutter.resource}}Controller {

    @Autowired
    private {{cookiecutter.resource}}Service service;
    
}
