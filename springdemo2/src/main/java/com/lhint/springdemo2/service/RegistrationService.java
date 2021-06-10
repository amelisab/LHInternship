package com.lhint.springdemo2.service;

import com.lhint.springdemo2.model.Registration;

import java.util.List;

public interface RegistrationService {

    Registration saveOrUpdate(Registration registration);

    void delete(Integer id);

    Registration find(Integer id);

    List<Registration> listAll();

}
