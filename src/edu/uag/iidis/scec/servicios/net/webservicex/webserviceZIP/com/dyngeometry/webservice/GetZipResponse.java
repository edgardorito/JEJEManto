
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetZipResult" type="{http://www.DynGeometry.com/WebService/}ZipInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getZipResult"
})
@XmlRootElement(name = "GetZipResponse")
public class GetZipResponse {

    @XmlElement(name = "GetZipResult")
    protected ZipInfo getZipResult;

    /**
     * Gets the value of the getZipResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZipInfo }
     *     
     */
    public ZipInfo getGetZipResult() {
        return getZipResult;
    }

    /**
     * Sets the value of the getZipResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipInfo }
     *     
     */
    public void setGetZipResult(ZipInfo value) {
        this.getZipResult = value;
    }

}
