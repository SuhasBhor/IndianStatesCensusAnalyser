package com.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.entity.CSVStateCensus;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class StateCensusAnalyser {
	List<CSVStateCensus> csvStateCensus = new ArrayList<>();

	public void csvFileDataLoad() {
		try {
			CSVReader csvReader = new CSVReader(new FileReader(
					"F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCensusData.csv"));
			String[] data;
			data = csvReader.readNext();
			while ((data = csvReader.readNext()) != null) {
				csvStateCensus.add(new CSVStateCensus(data[0], Long.parseLong(data[1]), Integer.parseInt(data[2]),
						Double.parseDouble(data[3])));
			}

			for (CSVStateCensus info : csvStateCensus) {
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Object countEntries() {
		if (csvStateCensus.size() == 29)
			return true;
		return false;
	}
}
