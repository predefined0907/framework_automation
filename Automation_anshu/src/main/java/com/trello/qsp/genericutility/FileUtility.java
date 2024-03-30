package com.trello.qsp.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
public String readTheDataFromPropertyFile(String key) throws IOException {
	FileInputStream file = new FileInputStream("./src/test/resources/TrelloData.properties");
	Properties pobj = new Properties();
	pobj.load(file);
	String value = pobj.getProperty(key);
	return value;
}
}
