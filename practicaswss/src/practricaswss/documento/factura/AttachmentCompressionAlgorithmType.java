//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 06:56:52 PM CEST 
//


package practricaswss.documento.factura;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentCompressionAlgorithmType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentCompressionAlgorithmType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZIP"/>
 *     &lt;enumeration value="GZIP"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentCompressionAlgorithmType")
@XmlEnum
public enum AttachmentCompressionAlgorithmType {

    ZIP,
    GZIP,
    NONE;

    public String value() {
        return name();
    }

    public static AttachmentCompressionAlgorithmType fromValue(String v) {
        return valueOf(v);
    }

}
