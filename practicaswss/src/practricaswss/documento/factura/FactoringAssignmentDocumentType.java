//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 06:56:52 PM CEST 
//


package practricaswss.documento.factura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FactoringAssignmentDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FactoringAssignmentDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentCharacter" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax50Type"/>
 *         &lt;element name="RepresentationIdentity" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax80Type" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax50Type"/>
 *         &lt;element name="Repository" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}RepositoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FactoringAssignmentDocumentType", propOrder = {
    "documentCharacter",
    "representationIdentity",
    "documentType",
    "repository"
})
public class FactoringAssignmentDocumentType {

    @XmlElement(name = "DocumentCharacter", required = true)
    protected String documentCharacter;
    @XmlElement(name = "RepresentationIdentity")
    protected String representationIdentity;
    @XmlElement(name = "DocumentType", required = true)
    protected String documentType;
    @XmlElement(name = "Repository")
    protected RepositoryType repository;

    /**
     * Gets the value of the documentCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentCharacter() {
        return documentCharacter;
    }

    /**
     * Sets the value of the documentCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentCharacter(String value) {
        this.documentCharacter = value;
    }

    /**
     * Gets the value of the representationIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentationIdentity() {
        return representationIdentity;
    }

    /**
     * Sets the value of the representationIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentationIdentity(String value) {
        this.representationIdentity = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the repository property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryType }
     *     
     */
    public RepositoryType getRepository() {
        return repository;
    }

    /**
     * Sets the value of the repository property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryType }
     *     
     */
    public void setRepository(RepositoryType value) {
        this.repository = value;
    }

}
