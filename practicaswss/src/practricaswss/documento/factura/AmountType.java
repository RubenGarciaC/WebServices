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
 * <p>Java class for AmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/>
 *         &lt;element name="EquivalentInEuros" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleTwoDecimalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
    "totalAmount",
    "equivalentInEuros"
})
public class AmountType {

    @XmlElement(name = "TotalAmount")
    protected double totalAmount;
    @XmlElement(name = "EquivalentInEuros")
    protected Double equivalentInEuros;

    /**
     * Gets the value of the totalAmount property.
     * 
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     */
    public void setTotalAmount(double value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the equivalentInEuros property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEquivalentInEuros() {
        return equivalentInEuros;
    }

    /**
     * Sets the value of the equivalentInEuros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEquivalentInEuros(Double value) {
        this.equivalentInEuros = value;
    }

}
