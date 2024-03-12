package com.gsoftcode.formonlines.services;

import com.gsoftcode.formonlines.entities.FormUser;
import com.gsoftcode.formonlines.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FormServiceImpl implements FormService{

    @Autowired
    private FormRepository formRepository;

    public FormUser createFormUser(Long String){
        Optional<FormUser> optionalFormUser = formRepository.findAllById()
    }
}
