
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
 *         &lt;element name="IPQueryResult" type="{http://www.DynGeometry.com/WebService/}IPInfo" minOccurs="0"/>
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
    "ipQueryResult"
})
@XmlRootElement(name = "IPQueryResponse")
public class IPQueryResponse {

    @XmlElement(name = "IPQueryResult")
    protected IPInfo ipQueryResult;

    /**
     * Gets the value of the ipQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link IPInfo }
     *     
     */
    public IPInfo getIPQueryResult() {
        return ipQueryResult;
    }

    /**
     * Sets the value of the ipQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPInfo }
     *     
     */
    public void setIPQueryResult(IPInfo value) {
        this.ipQueryResult = value;
    }

}
