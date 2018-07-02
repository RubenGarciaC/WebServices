package practicaswss.soap.servicios;

import java.io.File;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.rpc.handler.soap.SOAPMessageContext;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import practricaswss.documento.factura.Facturae;
import practricaswss.documento.parte.TipoAsistencia;

@WebService
public class PortalServicios {
	
	
	@Resource
	private WebServiceContext ctx;
	
	
	
	
	@PostConstruct //antes de construirse
	private void cargarConfiguracion() {
		System.out.println("Cargando configuración...");
	}
	
	@PreDestroy //antes de destruirse
	private void guardarTraza() {
		System.out.println("Guardando traza...");
	}
	
	
	public void enviarDocumento(
			@WebParam(name="remitente")
			String idRemitente,
			@WebParam(name="documento")
			Object documento) {
		
		System.out.println("Clase del documento");
		System.out.println(
				documento.getClass().getName());
		
		SOAPMessageContext soapCtx = 
					(SOAPMessageContext) ctx.getMessageContext();

		//	msg.getMessage().getSOAPBody(). Para leer
			
			SOAPMessage soapMessage = soapCtx.getMessage();
			
			try {
				TransformerFactory tFactory = TransformerFactory.newInstance();
				Transformer transformer = tFactory.newTransformer();
				transformer.transform(
						new DOMSource(soapMessage.getSOAPBody()),
						new StreamResult(new File("/tmp/soapbody.xml"))
						);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	
	public void enviarParteAsistencia(	
	@WebParam(name="remitente")
	String idRemitente,
	@WebParam(name="documento")
	TipoAsistencia documento)  {
		
		
	try {
		JAXBContext ctx = JAXBContext.newInstance("practricaswss.documento.parte");
		Marshaller marshaller = ctx.createMarshaller();
			marshaller.marshal(documento, new StreamResult(new File("/tmp/parte.xml"))
					);
	} catch (JAXBException e) {
		e.printStackTrace();
	}
		
	}
	
	public void enviarFactura(	
			@WebParam(name="remitente")
			String idRemitente,
			@WebParam(name="documento")
			Facturae documento)  {
		
			}
	
	
	
	

}
