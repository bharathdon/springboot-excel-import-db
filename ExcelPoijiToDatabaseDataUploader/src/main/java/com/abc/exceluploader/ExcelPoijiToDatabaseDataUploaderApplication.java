package com.abc.exceluploader;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abc.exceluploader.repository.InvoiceRepository;
import com.abc.exceluploader.service.ExcelPoijiServie;

@SpringBootApplication
public class ExcelPoijiToDatabaseDataUploaderApplication {

	@Autowired
	private InvoiceRepository invoiceRepository;

	@Autowired
	private ExcelPoijiServie excelPoijiServie;

	@PostConstruct
	public void init() {

		invoiceRepository.saveAll(excelPoijiServie.getListFromExcelData());
	}

	public static void main(String[] args) {
		SpringApplication.run(ExcelPoijiToDatabaseDataUploaderApplication.class, args);
	}

}
