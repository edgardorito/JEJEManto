
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
 *         &lt;element name="XYQueryResult" type="{http://www.DynGeometry.com/WebService/}XYInfo" minOccurs="0"/>
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
    "xyQueryResult"
})
@XmlRootElement(name = "XYQueryResponse")
public class XYQueryResponse {

    @XmlElement(name = "XYQueryResult")
    protected XYInfo xyQueryResult;

    /**
     * Gets the value of the xyQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link XYInfo }
     *     
     */
    public XYInfo getXYQueryResult() {
        return xyQueryResult;
    }

    /**
     * Sets the value of the xyQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XYInfo }
     *     
     */
    public void setXYQueryResult(XYInfo value) {
        this.xyQueryResult = value;
    }

}
