package com.lhint.springdemo2.service;

import com.lhint.springdemo2.model.Registration;
import com.lhint.springdemo2.repository.RegistrationRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    RegistrationRepositoryImpl registrationRepository;

    @Override
    public Registration saveOrUpdate(Registration registration) {
        return registrationRepository.update(registration);
    }

    @Override
    public void delete(Integer id) {
        registrationRepository.delete(id);
    }

    @Override
    public Registration find(Integer id) {
        return registrationRepository.findById(id);
    }

    @Override
    public List<Registration> listAll() {
        return registrationRepository.listAll();
    }
}
