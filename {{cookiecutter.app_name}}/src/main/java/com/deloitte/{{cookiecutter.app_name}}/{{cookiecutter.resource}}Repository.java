package com.deloitte.{{cookiecutter.app_name}};

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface {{cookiecutter.resource}}Repository extends JpaRepository {

}