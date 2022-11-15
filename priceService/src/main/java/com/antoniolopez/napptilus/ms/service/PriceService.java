package com.antoniolopez.napptilus.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoniolopez.napptilus.ms.model.dao.IPriceDao;
import com.antoniolopez.napptilus.ms.model.entitys.Price;

@Service
public class PriceService implements IPriceService {

//	@Autowired
	private IPriceDao priceDao;

	@Override
	public List<Price> getPrices() {
		return (List<Price>) priceDao.findAll();
	}

	@Override
	public void createPrice(Price price) {
		priceDao.save(price);

	}
}
