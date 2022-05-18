package com.nss.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nss.response.CoinDeskResponse;
import com.nss.service.CoinDeskClientService;

@RestController
public class CoinDeskRestController {

	@Autowired
	private CoinDeskClientService coinDeskService;

	@GetMapping(value = "/coin")
	public String callCoinDeskApiCall() {
		String restCall = coinDeskService.initiateRestCall();

		return restCall;
	}

}
