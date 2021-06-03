/**
 * 
 */
package com.abc.exceluploader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.exceluploader.model.Invoice;
import com.abc.exceluploader.service.ExcelPoijiServie;

/**
 * @author hp
 *
 */
@RestController
public class ExcelController {

	@Autowired
	private ExcelPoijiServie excelPoijiServie;
	
	@GetMapping("/")
	public ResponseEntity<List<Invoice>> findAll(){
		List<Invoice> list = excelPoijiServie.getListFromExcelData();
		System.out.println(list);
		return new ResponseEntity<List<Invoice>>(list, HttpStatus.OK);
	}
}
