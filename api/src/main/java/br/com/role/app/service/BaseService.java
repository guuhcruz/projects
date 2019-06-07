package br.com.role.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.role.app.entities.BaseEntity;
import lombok.Getter;

public class BaseService<T extends BaseEntity, E extends JpaRepository<T, Integer>> {

	@Autowired
    @Getter
    private E repository;
    private T entity;
}
