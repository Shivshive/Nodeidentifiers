import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("book.xml");
			
			NodeList parentnlist = doc.getElementsByTagName("book");
			
			for(int i=0;i<parentnlist.getLength();i++)
			{
				Node testnode = parentnlist.item(i);
				if(testnode.getNodeType()== Node.ELEMENT_NODE)
				{
					Element testele = (Element) testnode;
					System.out.println(" Node : "+testele.getTagName()+"  Type : "+testele.getNodeType());
					
					NodeList childnode = testnode.getChildNodes();
					
					for(int j=0; j<childnode.getLength();j++)
					{
						Node cnode = childnode.item(j);
						
						System.out.print(cnode.getTextContent());
						
						
					}
				}
			}
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
