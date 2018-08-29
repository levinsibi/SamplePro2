package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub

		int i;
		FileInputStream fis=new FileInputStream(new File("C:\\XML\\simple.xml"));
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		Document doc=db.parse(fis);
		
		String s=doc.getElementsByTagName("name").item(0).getTextContent();
		System.out.println(s);
		
		NodeList nlist=doc.getElementsByTagName("food");
		for(i=0;i<nlist.getLength();i++)
		{
			Node n1=nlist.item(i);
			Element e1=(Element)n1;
			System.out.println("---------Food Item "+i+"---------");
			System.out.println("Food Name is---->"+e1.getElementsByTagName("name").item(0).getTextContent());
			System.out.println("Food Price is---->"+e1.getElementsByTagName("price").item(0).getTextContent());
			System.out.println("Food Descrition is---->"+e1.getElementsByTagName("description").item(0).getTextContent());
			System.out.println("Food calories is---->"+e1.getElementsByTagName("calories").item(0).getTextContent());
			
		}
	}

}
