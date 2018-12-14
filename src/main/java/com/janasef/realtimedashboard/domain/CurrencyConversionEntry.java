package com.janasef.realtimedashboard.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.janasef.realtimedashboard.utils.CustomDateDeserializer;

/**
 * Note: TODO Lombok.Data didn't work, so for now manually generated getters,
 * setters.
 * 
 * @author janasefcikova
 *
 */
public class CurrencyConversionEntry {
	private Long userId;
	private String currencyFrom;
	private String currencyTo;
	private BigDecimal amountSell;
	private BigDecimal amountBuy;

	/**
	 * Conversion rate
	 */
	private BigDecimal rate;

	// TODO(janasefcikova) Improvement: Should be more specific type, country code
	private String originatingCountry;

	// TODO(janasefcikova) Note: Timezone undefined in task specification
	@JsonDeserialize(using = CustomDateDeserializer.class)
	private Date timePlaced;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public BigDecimal getAmountSell() {
		return amountSell;
	}

	public void setAmountSell(BigDecimal amountSell) {
		this.amountSell = amountSell;
	}

	public BigDecimal getAmountBuy() {
		return amountBuy;
	}

	public void setAmountBuy(BigDecimal amountBuy) {
		this.amountBuy = amountBuy;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getOriginatingCountry() {
		return originatingCountry;
	}

	public void setOriginatingCountry(String originatingCountry) {
		this.originatingCountry = originatingCountry;
	}

	public Date getTimePlaced() {
		return timePlaced;
	}

	public void setTimePlaced(Date timePlaced) {
		this.timePlaced = timePlaced;
	}

	@Override
	public String toString() {
		return "CurrencyConversionEntry [userId=" + userId + ", currencyFrom=" + currencyFrom + ", currencyTo="
				+ currencyTo + ", amountSell=" + amountSell + ", amountBuy=" + amountBuy + ", rate=" + rate
				+ ", originatingCountry=" + originatingCountry + ", timePlaced=" + timePlaced + "]";
	}
}
