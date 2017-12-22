package com.revature.jaxp;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class TurtleSAXParsing {
	public static void main(String[] args) {
		String filename="turtles.xml";
		TurtleSAXParsing.ReadTurtles(filename);
	}
	
	static void ReadTurtles(String filename) {
		SAXParserFactory spFactory = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser = spFactory.newSAXParser();
			TurtleHandler handler = new TurtleHandler();
			saxParser.parse(filename, handler);
		} catch (ParserConfigurationException ex) {
			
		} catch (SAXException ex) {
			
		} catch (IOException ex) {
			
		}
	}
}
