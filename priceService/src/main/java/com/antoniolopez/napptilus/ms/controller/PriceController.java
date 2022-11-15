package com.antoniolopez.napptilus.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antoniolopez.napptilus.ms.model.entitys.Price;
import com.antoniolopez.napptilus.ms.service.IPriceService;

@RestController
@RequestMapping(value = "prices")
public class PriceController {
	
	@Autowired
	private IPriceService priceService;
	
	@GetMapping(value = "search")
	public List<Price> getPrices(){
		return priceService.getPrices();
	}
	
	@PostMapping(value = "search")
	private void createPrice(@RequestBody Price price) {
		priceService.createPrice(price);

	}

}
