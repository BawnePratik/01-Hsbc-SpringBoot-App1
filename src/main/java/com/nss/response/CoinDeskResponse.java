package com.nss.response;

public class CoinDeskResponse {

	Time TimeObject;
	private String disclaimer;
	private String chartName;
	Bpi BpiObject;

	// Getter Methods

	public Time getTime() {
		return TimeObject;
	}

	public String getDisclaimer() {
		return disclaimer;
	}

	public String getChartName() {
		return chartName;
	}

	public Bpi getBpi() {
		return BpiObject;
	}

	// Setter Methods

	public void setTime(Time timeObject) {
		this.TimeObject = timeObject;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public void setChartName(String chartName) {
		this.chartName = chartName;
	}

	public void setBpi(Bpi bpiObject) {
		this.BpiObject = bpiObject;
	}

	public class Bpi {
		USD USDObject;
		GBP GBPObject;
		EUR EURObject;

		// Getter Methods

		public USD getUSD() {
			return USDObject;
		}

		public GBP getGBP() {
			return GBPObject;
		}

		public EUR getEUR() {
			return EURObject;
		}

		// Setter Methods

		public void setUSD(USD USDObject) {
			this.USDObject = USDObject;
		}

		public void setGBP(GBP GBPObject) {
			this.GBPObject = GBPObject;
		}

		public void setEUR(EUR EURObject) {
			this.EURObject = EURObject;
		}
	}

	public class EUR {
		private String code;
		private String symbol;
		private String rate;
		private String description;
		private float rate_float;

		// Getter Methods

		public String getCode() {
			return code;
		}

		public String getSymbol() {
			return symbol;
		}

		public String getRate() {
			return rate;
		}

		public String getDescription() {
			return description;
		}

		public float getRate_float() {
			return rate_float;
		}

		// Setter Methods

		public void setCode(String code) {
			this.code = code;
		}

		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}

		public void setRate(String rate) {
			this.rate = rate;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public void setRate_float(float rate_float) {
			this.rate_float = rate_float;
		}
	}

	public class GBP {
		private String code;
		private String symbol;
		private String rate;
		private String description;
		private float rate_float;

		// Getter Methods

		public String getCode() {
			return code;
		}

		public String getSymbol() {
			return symbol;
		}

		public String getRate() {
			return rate;
		}

		public String getDescription() {
			return description;
		}

		public float getRate_float() {
			return rate_float;
		}

		// Setter Methods

		public void setCode(String code) {
			this.code = code;
		}

		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}

		public void setRate(String rate) {
			this.rate = rate;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public void setRate_float(float rate_float) {
			this.rate_float = rate_float;
		}
	}

	public class USD {
		private String code;
		private String symbol;
		private String rate;
		private String description;
		private float rate_float;

		// Getter Methods

		public String getCode() {
			return code;
		}

		public String getSymbol() {
			return symbol;
		}

		public String getRate() {
			return rate;
		}

		public String getDescription() {
			return description;
		}

		public float getRate_float() {
			return rate_float;
		}

		// Setter Methods

		public void setCode(String code) {
			this.code = code;
		}

		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}

		public void setRate(String rate) {
			this.rate = rate;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public void setRate_float(float rate_float) {
			this.rate_float = rate_float;
		}
	}

	public class Time {
		private String updated;
		private String updatedISO;
		private String updateduk;

		// Getter Methods

		public String getUpdated() {
			return updated;
		}

		public String getUpdatedISO() {
			return updatedISO;
		}

		public String getUpdateduk() {
			return updateduk;
		}

		// Setter Methods

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public void setUpdatedISO(String updatedISO) {
			this.updatedISO = updatedISO;
		}

		public void setUpdateduk(String updateduk) {
			this.updateduk = updateduk;
		}
	}
}
