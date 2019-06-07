package br.com.role.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.role.app.entities.BaseEntity;
import br.com.role.app.service.BaseService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequestMapping("/")
@EnableHypermediaSupport(type = HypermediaType.HAL)
public abstract class BaseController<T extends BaseEntity, E extends BaseService>  {
	
    @Autowired
    protected E service;
    protected T entity;
    
    
}
