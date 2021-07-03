package com.abc.exceluploader.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.poiji.annotation.ExcelCellName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "invoice")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ExcelCellName("id")
	private Integer id;

	@ExcelCellName(value = "name")
	private String name;

	@ExcelCellName(value = "amount")
	private Double amount;

	@ExcelCellName(value = "number")
	private String number;

	@ExcelCellName(value = "receiveDate")
	private String receiveDate;

}
