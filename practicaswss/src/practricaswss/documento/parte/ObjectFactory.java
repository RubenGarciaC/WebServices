//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 05:47:42 PM CEST 
//


package practricaswss.documento.parte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the practricaswss.documento.parte package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ParteAsistencia_QNAME = new QName("http://acme.com/documentos", "parteAsistencia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: practricaswss.documento.parte
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoAsistencia }
     * 
     */
    public TipoAsistencia createTipoAsistencia() {
        return new TipoAsistencia();
    }

    /**
     * Create an instance of {@link Asistente }
     * 
     */
    public Asistente createAsistente() {
        return new Asistente();
    }

    /**
     * Create an instance of {@link Encabezado }
     * 
     */
    public Encabezado createEncabezado() {
        return new Encabezado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoAsistencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acme.com/documentos", name = "parteAsistencia")
    public JAXBElement<TipoAsistencia> createParteAsistencia(TipoAsistencia value) {
        return new JAXBElement<TipoAsistencia>(_ParteAsistencia_QNAME, TipoAsistencia.class, null, value);
    }

}
