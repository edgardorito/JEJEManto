
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
 *         &lt;element name="GeocodeResult" type="{http://www.DynGeometry.com/WebService/}Address" minOccurs="0"/>
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
    "geocodeResult"
})
@XmlRootElement(name = "GeocodeResponse")
public class GeocodeResponse {

    @XmlElement(name = "GeocodeResult")
    protected Address geocodeResult;

    /**
     * Gets the value of the geocodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getGeocodeResult() {
        return geocodeResult;
    }

    /**
     * Sets the value of the geocodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setGeocodeResult(Address value) {
        this.geocodeResult = value;
    }

}
