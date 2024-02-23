package com.api.template.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class TemplateService {

    @Autowired
    private final EntityManager entityManager;

    public TemplateService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
