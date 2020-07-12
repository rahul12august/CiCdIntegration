package testNgPackage;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlReader {

	public static void main(String[] args) throws Exception {
		try {
			File file=new File(System.getProperty("user.dir")+File.separator+
					"src"+File.separator+"testData"+File.separator+"TestData.xml");
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document document=db.parse(file);
			document.getDocumentElement().normalize();
			System.out.println("Root Element is: "+
					document.getDocumentElement().getNodeName());
			//NodeList nodeList=document.getElementsByTagName("TestDataRoot");
			NodeList nodeList=document.getElementsByTagName("student");
			System.out.println(nodeList.getLength());
			for(int i=0;i<nodeList.getLength();i++) {
				Node node=nodeList.item(i);
				Element element=(Element) node;
				System.out.println(element.getElementsByTagName("name").item(0).getTextContent());
				System.out.println(element.getElementsByTagName("name").item(1).getTextContent());
				System.out.println(element.getElementsByTagName("phone").item(0).getTextContent());
				System.out.println(element.getElementsByTagName("email").item(0).getTextContent());
				System.out.println("//////////");
				System.out.println("//////////");
			}
			
		}catch(Exception e) {
			throw e;
		}

	}

}
