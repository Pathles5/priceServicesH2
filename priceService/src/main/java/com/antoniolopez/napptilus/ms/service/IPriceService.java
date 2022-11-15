package com.antoniolopez.napptilus.ms.service;

import java.util.List;

import com.antoniolopez.napptilus.ms.model.entitys.Price;

public interface IPriceService {
	public List<Price> getPrices();
	public void createPrice(Price price);
}
