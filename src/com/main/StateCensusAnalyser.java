package com.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.entity.CSVStateCensus;
import com.exception.InvalidDataType;
import com.exception.InvalideFileName;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class StateCensusAnalyser {
	// Creating List For Storing The data
	List<CSVStateCensus> csvStateCensus = new ArrayList<>();

	public void csvFileDataLoad(String filePath) throws Exception {
		try {
			// CsvReader For Reading data from CSV File
			CSVReader csvReader = new CSVReader(new FileReader(filePath));
			String[] data;
			int count = 0;
			data = csvReader.readNext();
			while ((data = csvReader.readNext()) != null) {
				csvStateCensus.add(new CSVStateCensus(data[0], Long.parseLong(data[1]), Integer.parseInt(data[2]),
						Double.parseDouble(data[3])));
				count++;
			}

			for (CSVStateCensus info : csvStateCensus) {
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new InvalideFileName("Please Enter Valid Name");
			/*
			 * } catch (CsvValidationException e) { // TODO Auto-generated catch block
			 * e.printStackTrace();
			 * 
			 * } catch (IOException e) { // TODO Auto-generated catch block
			 * e.printStackTrace();
			 */
		} catch (NumberFormatException e) {
			throw new InvalidDataType("Data Type Is Wrong!! Please Provide Valid Data Type");
		}
	}

	public Object countEntries() {
		if (csvStateCensus.size() == 29)
			return true;
		return false;
	}
}
