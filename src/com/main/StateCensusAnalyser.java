package com.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.entity.CSVStateCensus;
import com.exception.InvalidDataType;
import com.exception.InvalidDelimiter;
import com.exception.InvalidHeader;
import com.exception.InvalideFileName;
import com.opencsv.CSVReader;

public class StateCensusAnalyser {
	// Creating List For Storing The data
	List<CSVStateCensus> csvStateCensus = new ArrayList<>();
	String[] data;

	public void csvFileDataLoad(String filePath) throws Exception {
		try {
			// CsvReader For Reading data from CSV File
			CSVReader csvReader = new CSVReader(new FileReader(filePath));

			data = csvReader.readNext();

			if (!invalidHeader(data))
				throw new InvalidHeader("Header Is Wrong Please Check Header");

			while ((data = csvReader.readNext()) != null) {
				if (data.length != 4) {
					throw new InvalidDelimiter("Delimiter Is Wrong In CSVFile");
				}
				csvStateCensus.add(new CSVStateCensus(data[0], Long.parseLong(data[1]), Integer.parseInt(data[2]),
						Double.parseDouble(data[3])));
			}

			for (CSVStateCensus info : csvStateCensus) {
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new InvalideFileName("Please Enter Valid Name");
		} catch (NumberFormatException e) {
			throw new InvalidDataType("Data Type Is Wrong!! Please Provide Valid Data Type");
		}
	}

	public Object countEntries() {
		if (csvStateCensus.size() == 29)
			return true;
		return false;
	}

	public boolean invalidHeader(String[] data) {
		return (data[0].compareTo("State") + data[1].compareTo("Population") + data[2].compareTo("AreaInSqKm")
				+ data[3].compareTo("DensityPerSqKm") == 0);
	}
}
