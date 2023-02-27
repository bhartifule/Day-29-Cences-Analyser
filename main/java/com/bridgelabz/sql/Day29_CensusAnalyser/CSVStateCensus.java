package com.bridgelabz.sql.Day29_CensusAnalyser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSVStateCensus {
	 public ArrayList<String> readDataFromSource1(String path) throws Exception {
	        ArrayList<String> stateList = new ArrayList<>();
	        try{
	            FileReader filereader = new FileReader(path);

	            CSVReader csvReader = new CSVReader(filereader);
	            String[] nextRecord;

	            while ((nextRecord = csvReader.readNext()) != null) {
	                String entry = "";
	                for (String addressBookDetails : nextRecord) {
	                    entry = entry + addressBookDetails + "\t";
	                }
	                stateList.add(entry);
	                System.out.println(entry);
	            }
	        } catch (CsvValidationException e){
	            throw new FileReadException("Error in Reading file");
	        }

	        return stateList;
	    }

	public ArrayList<String> readDataFromSource(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<String> readDataFromSource() {
		// TODO Auto-generated method stub
		return null;
	}
}
