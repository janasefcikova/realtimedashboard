package com.janasef.realtimedashboard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.janasef.realtimedashboard.domain.CurrencyConversionEntry;

@RestController
public class CurrencyConversionController {
	@Autowired
	private KafkaTemplate<Object, Object> template;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@PostMapping("api/currencyconversion/add")
	void add(@RequestBody CurrencyConversionEntry entry) {
		this.template.send("originating-country", entry.getOriginatingCountry(), entry.getOriginatingCountry());
	}
	
}
