package com.codegenerator.jgen.database.model;

import java.util.List;

import lombok.Data;

@Data
public class FMDatabaseMetadata {

	private String driverName;
	private String url;
	private String username;
	private List<FMTable> tables;
	
}
