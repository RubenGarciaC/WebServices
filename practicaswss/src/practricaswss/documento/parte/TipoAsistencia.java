//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 05:47:42 PM CEST 
//


package practricaswss.documento.parte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoAsistencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoAsistencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Empresa" type="{http://acme.com/documentos}encabezado"/>
 *         &lt;element name="Asistentes" type="{http://acme.com/documentos}asistente"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoAsistencia", propOrder = {
    "empresa",
    "asistentes"
})
public class TipoAsistencia {

    @XmlElement(name = "Empresa", required = true)
    protected Encabezado empresa;
    @XmlElement(name = "Asistentes", required = true)
    protected Asistente asistentes;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link Encabezado }
     *     
     */
    public Encabezado getEmpresa() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Encabezado }
     *     
     */
    public void setEmpresa(Encabezado value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the asistentes property.
     * 
     * @return
     *     possible object is
     *     {@link Asistente }
     *     
     */
    public Asistente getAsistentes() {
        return asistentes;
    }

    /**
     * Sets the value of the asistentes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asistente }
     *     
     */
    public void setAsistentes(Asistente value) {
        this.asistentes = value;
    }

}