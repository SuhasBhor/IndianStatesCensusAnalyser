package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.StateCensusAnalyser;

public class StateCensusAnalyserTest {
	@Test
	public void testCensusAnalyser() {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		stateCensusAnalyser.csvFileDataLoad();
		assertEquals(true, stateCensusAnalyser.countEntries());
	}
}
