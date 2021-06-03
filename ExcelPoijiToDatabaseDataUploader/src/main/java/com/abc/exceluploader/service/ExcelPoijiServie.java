package com.abc.exceluploader.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.exceluploader.model.Invoice;


public interface ExcelPoijiServie {

	public List<Invoice> getListFromExcelData();
}
