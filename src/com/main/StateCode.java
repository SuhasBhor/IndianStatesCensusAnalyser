package com.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.entity.CSVStateCode;
import com.exception.InvalidDataType;
import com.exception.InvalidDelimiter;
import com.exception.InvalidHeader;
import com.exception.InvalideFileName;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class StateCode {
	List<CSVStateCode> csvStateCode = new ArrayList<CSVStateCode>();
	String[] data;

	public void csvFileDataLoad(String file) throws Exception {
		CSVReader csvReader;
		try {
			csvReader = new CSVReader(new FileReader(file));
			data = csvReader.readNext();

			if (!invalidHeader(data)) {
				throw new InvalidHeader("Header Is Wrong Please Check Header");
			}
			while ((data = csvReader.readNext()) != null) {
				if (data.length != 4)
					throw new InvalidDelimiter("Delimiter Is Wrong In CSVFile");
				csvStateCode
						.add(new CSVStateCode(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), data[3]));
			}
			for (CSVStateCode info : csvStateCode) {
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			throw new InvalideFileName("File Name Is Found ! Please Provide valid File Name");
		} catch (NumberFormatException e) {
			throw new InvalidDataType("Data Type Is Wrong ! Provide Valid Data Type");
		}
	}

	private boolean invalidHeader(String[] data) {
		return (data[0].compareTo("Sr.No") + data[1].compareTo("StateName") + data[2].compareTo("TIN")
				+ data[3].compareTo("StateCode") == 0);
	}

	public Object countEntries() {
		if (csvStateCode.size() == 37)
			return true;
		return false;
	}

}
