package practicaswss.soap.handlers;

import java.io.File;
import java.util.Date;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class HandlerAuditoria implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		
		
		try {
			boolean esRespuesta = (boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			
			SOAPMessage soapMessage = context.getMessage();
			SOAPHeader soapHeader = soapMessage.getSOAPHeader();
			SOAPBody soapBody = soapMessage.getSOAPBody();
			
			SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
			
			
			
			
			if(esRespuesta)
			{
				System.out.println("Después de invocar el servicio");
			}
			else
			{
				System.out.println("Antes de invocar el servicio");
				
				TransformerFactory tf = TransformerFactory.newInstance();
				Transformer t = tf.newTransformer();
				t.transform(new DOMSource(soapEnvelope), new StreamResult(new File("/tmp/aud-"+ new Date().toString())));
				
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return true; // con false no hace nada
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("ENTRA Fault - HandleFault");
		return true; // con false no hace nada
	}

	@Override
	public void close(MessageContext context) {

		
	}

	@Override
	public Set<QName> getHeaders() {

		return null;
	}
	
	
	
	

}
