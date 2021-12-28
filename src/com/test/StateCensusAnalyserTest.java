package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.StateCensusAnalyser;
import com.main.StateCode;

public class StateCensusAnalyserTest {
	// Creating Class Object
	StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
	StateCode stateCode = new StateCode();

	// Checking For Number Of Entries Of CSV File
	@Test
	public void testCensusAnalyser() throws Exception {
		stateCensusAnalyser.csvFileDataLoad(
				"F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCensusData.csv");
		assertEquals(true, stateCensusAnalyser.countEntries());
	}

	// Given Invalid File Name And Throw Exception
	@Test
	public void testForCheck_InvalidFile() throws Exception {
		try {
			stateCensusAnalyser.csvFileDataLoad(
					"F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCensusDa.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Given Wrong Data Type In File And Throw Exception
	@Test
	public void testForCheck_WrongData() throws Exception {
		try {
			stateCensusAnalyser.csvFileDataLoad(
					"F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCensusWrongData.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Given Wrong Header Should Gives Custom Exception
	@Test
	public void testForCheck_WrongHeader() throws Exception {
		try {
			stateCensusAnalyser.csvFileDataLoad(
					"F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCensusWrongHeader.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Given CSV File Has Wrong Delimiter So Throws Custom Exception
	@Test
	public void testForCheck_WrongDelimiter() throws Exception {
		try {
			stateCensusAnalyser.csvFileDataLoad(
					"F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCensusWrongDelimiter.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Checking For Number Of Entries In CSV File IndiaStateCode
	@Test
	public void testCensusAnalyser_StateCode() throws Exception {
		stateCode.csvFileDataLoad(
				"F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCode.csv");
		assertEquals(true, stateCode.countEntries());
	}

	// Given Invalid File Name And Throw Exception for CSV File IndiaStateCode
	@Test
	public void testForCheck_InvalidFile_StateCode() throws Exception {
		try {
			stateCode.csvFileDataLoad(
					"F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaState.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Given Wrong Data Type In File And Throw Exception For CSV File IndiaStateCode
	@Test
	public void testForCheck_WrongData_StateCode() throws Exception {
		try {
			stateCode.csvFileDataLoad(
					"F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCodeWrongData.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Given Wrong Header Should Gives Custom Exception For CSv File IndiaStateCode
	@Test
	public void testForCheck_WrongHeader_StateCode() throws Exception {
		try {
			stateCode.csvFileDataLoad(
					"F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCodeWrongHeader.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Given CSV File Has Wrong Delimiter So Throws Custom Exception For CSV File
	// IndiaStateCOde
	@Test
	public void testForCheck_WrongDelimiter_StateCode() throws Exception {
		try {
			stateCode.csvFileDataLoad(
					"F:\\BridgelabzClass\\IndianStateCensusAnalyser\\src\\com\\resource\\IndiaStateCodeWrongDelimiter.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}