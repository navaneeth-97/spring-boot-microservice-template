package com.deloitte.{{cookiecutter.app_name}};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class {{cookiecutter.resource}}Service {

    @Autowired
    private {{cookiecutter.resource}}Repository repository;
    
}
