package com.bridgelabz.sql.Day29_CensusAnalyser;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCSVStateCensus {
	static CSVStateCensus csvStateCensus;
    @Test
    public void testReadDataFromDestinationHappy(){
        csvStateCensus =  new CSVStateCensus();
        try{
            ArrayList<String> stateList = csvStateCensus.readDataFromSource("C:\\Day_29_Census_Analyzer\\src\\main\\java\\com\\bridgelabz\\State_census.csv");
            Assertions.assertEquals(stateList.size(), 199);
        } catch(Exception e){
            fail("Should not throw exception");
        }
    }

    @Test
    public void testReadDataFromDestinationSadWrongFile(){
        csvStateCensus =  new CSVStateCensus();
        try{
            ArrayList<String> stateList = csvStateCensus.readDataFromSource("C:\\Day_29_Census_Analyzer\\src\\main\\java\\com\\bridgelabz\\State.csv");
            fail("Should throw exception");
        } catch(Exception e){
            Assertions.assertNotNull(e.getMessage());
        }
    }

}
