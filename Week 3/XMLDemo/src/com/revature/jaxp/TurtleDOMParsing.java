package com.revature.jaxp;

import java.io.IOException;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class TurtleDOMParsing {
	public static void main(String[] args) {
		String filename = "turtles.xml";
		TurtleDOMParsing.readTurtles(filename);
	}
	
	static void readTurtles(String filename) {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(filename);
			doc.getDocumentElement().normalize();
			
			System.out.println(doc.getDocumentElement().getNodeName());
			NodeList turtleList = doc.getElementsByTagName("turtle");
			
			for(int i = 0; i < turtleList.getLength(); i++) {
				Node turtle = turtleList.item(i);
				System.out.println("\t" + turtle.getNodeName());
				NodeList turtleAttributes = turtle.getChildNodes();
				for (int j = 0; j < turtleAttributes.getLength(); j++) {
					Node attribute = turtleAttributes.item(j);
					if (attribute.getNodeType() == Node.ELEMENT_NODE) {
						System.out.println("\t\t" + attribute.getNodeName() + ": " + attribute.getTextContent());
					}
				}
			}
		} catch (ParserConfigurationException ex) {
			
		} catch (SAXException ex) {
			
		} catch (IOException ex) {
			
		}
	}
}
