package com.janasef.realtimedashboard.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.janasef.realtimedashboard.domain.CurrencyConversionEntry;

@RestController
public class CurrencyConversionController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@PostMapping("api/currencyconversion/add")
	void add(@RequestBody CurrencyConversionEntry entry) {
		logger.trace(entry.toString());
	}
	
}
