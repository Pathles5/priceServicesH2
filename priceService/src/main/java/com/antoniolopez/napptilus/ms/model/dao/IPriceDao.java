package com.antoniolopez.napptilus.ms.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.antoniolopez.napptilus.ms.model.entitys.Price;

@Repository
public interface IPriceDao extends CrudRepository<Price,Long>{

}
