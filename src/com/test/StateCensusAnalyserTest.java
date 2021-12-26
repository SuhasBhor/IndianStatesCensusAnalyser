package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.StateCensusAnalyser;

public class StateCensusAnalyserTest {
	//Creating Class Object
	StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
	
	//Checking For Number Of Entries Of CSV File
	@Test
	public void testCensusAnalyser() throws Exception {
		stateCensusAnalyser.csvFileDataLoad("F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCensusData.csv");
		assertEquals(true, stateCensusAnalyser.countEntries());
	}
	
	//Given Invalid File Name And Throw Exception
	@Test
	public void testForCheck_InvalidFile() throws Exception {
		try {
			stateCensusAnalyser.csvFileDataLoad("F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCensusDa.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
