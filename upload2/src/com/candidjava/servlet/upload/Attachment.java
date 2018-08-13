package com.candidjava.servlet.upload;

import java.sql.Blob;

public class Attachment {
private Long id;

private String fileName;
private Blob fileData;
private String description;


public Attachment(Long id2, String fileName2, Blob fileData2, String description2) {
	// TODO Auto-generated constructor stub
	this.id=id2;
	this.fileName=fileName2;
	this.fileData=fileData2;
	this.description=description2;
	
	
	
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public Blob getFileData() {
	return fileData;
}
public void setFileData(Blob fileData) {
	this.fileData = fileData;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
