package dev.rabaioli.desmeta.controlleres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.rabaioli.desmeta.entities.Sale;
import dev.rabaioli.desmeta.services.SaleService;
import dev.rabaioli.desmeta.services.SmsService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@Autowired
	private SmsService smsService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Page<Sale> findSales(
			@RequestParam(value = "minDate", defaultValue = "" ) String minDate, 
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate, 
			Pageable page){
		return service.findSales(minDate, maxDate, page);
	}
	
	@GetMapping("/notification")
	public void notifySms() {
		smsService.sendSms();
	}

}
