package com.codegenerator.jgen.model;

import lombok.Data;

@Data
public class FMColumn {

	private String tableName;
	private String columnName;
	private String columnTypeName;
	private Integer columnSize;
	private Integer decimalDigits;
	private String columnDefault;
	private Boolean isNullable;
	private Boolean isAutoincrement;
	private Boolean isPrimaryKey = false;
	private Boolean isUnique = false;
	private Boolean isGenerated = false;
	private Boolean isEnum = false;
	private FMForeignKey foreignKeyInfo;
}
