package com.lhint.springdemo2.repository;

import com.lhint.springdemo2.model.Registration;

import java.util.List;

public interface RegistrationRepository {

    void create(Registration registration);

    Registration update(Registration registration);

    Registration findById(Integer id);

    void delete(Integer id);

    List<Registration> listAll();
}
