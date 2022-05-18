package com.nss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nss.response.CoinDeskResponse;

@Service
public class CoinDeskClientService {

	@Autowired
	private RestTemplate rt;

	public String initiateRestCall() {

		String endpointUrl = "https://api.coindesk.com/v1/bpi/currentprice.json";

		ResponseEntity<String> responseEntity = rt.getForEntity(endpointUrl, String.class);

		int statusCodeValue = responseEntity.getStatusCodeValue();

		if (statusCodeValue == 200) {
			String body = responseEntity.getBody();
			return body;
		} else {
			return null;
		}

	}

}
