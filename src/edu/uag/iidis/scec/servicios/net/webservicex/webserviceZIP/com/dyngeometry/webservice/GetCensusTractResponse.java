
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
 *         &lt;element name="GetCensusTractResult" type="{http://www.DynGeometry.com/WebService/}CensusTractInfo" minOccurs="0"/>
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
    "getCensusTractResult"
})
@XmlRootElement(name = "GetCensusTractResponse")
public class GetCensusTractResponse {

    @XmlElement(name = "GetCensusTractResult")
    protected CensusTractInfo getCensusTractResult;

    /**
     * Gets the value of the getCensusTractResult property.
     * 
     * @return
     *     possible object is
     *     {@link CensusTractInfo }
     *     
     */
    public CensusTractInfo getGetCensusTractResult() {
        return getCensusTractResult;
    }

    /**
     * Sets the value of the getCensusTractResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CensusTractInfo }
     *     
     */
    public void setGetCensusTractResult(CensusTractInfo value) {
        this.getCensusTractResult = value;
    }

}
