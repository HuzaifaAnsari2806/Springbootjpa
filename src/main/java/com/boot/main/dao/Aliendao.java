package com.boot.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.main.model.Alien;

public interface Aliendao extends CrudRepository<Alien, Integer> {

}
