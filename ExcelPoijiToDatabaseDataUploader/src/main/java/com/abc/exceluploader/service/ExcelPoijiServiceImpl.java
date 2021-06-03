/**
 * 
 */
package com.abc.exceluploader.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.abc.exceluploader.model.Invoice;
import com.abc.exceluploader.repository.InvoiceRepository;
import com.poiji.bind.Poiji;

/**
 * @author hp
 *
 */
@Service
public class ExcelPoijiServiceImpl implements ExcelPoijiServie {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Value("${filePath}")
	public String FILE_PATH;

	@Override
	public List<Invoice> getListFromExcelData() {

		File file = new File(FILE_PATH);
		List<Invoice> invoices = Poiji.fromExcel(file, Invoice.class);

		return invoices;
	}

}
