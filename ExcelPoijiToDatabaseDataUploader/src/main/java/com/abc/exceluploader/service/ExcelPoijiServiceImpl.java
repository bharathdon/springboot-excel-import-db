/**
 * 
 */
package com.abc.exceluploader.service;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.abc.exceluploader.model.Invoice;
import com.poiji.bind.Poiji;
import com.poiji.util.Files;

import lombok.SneakyThrows;

/**
 * @author hp
 *
 */
@Service
public class ExcelPoijiServiceImpl implements ExcelPoijiServie {

	@Value("${filePath}")
	public String FILE_PATH;
	public List<Invoice> invoice;

	@Override
	@SneakyThrows
	public List<Invoice> getListFromExcelData() {

		File file = new File(FILE_PATH);
		List<File> listFiles = Arrays.asList(file.listFiles());

		// String extension = Files.getInstance().getExtension("*.xlsx");

		for (int j = 0; j < listFiles.size(); j++) {

			invoice = Poiji.fromExcel(listFiles.get(j), Invoice.class).stream().skip(1).collect(Collectors.toList());

		}

		return invoice;
	}

}
