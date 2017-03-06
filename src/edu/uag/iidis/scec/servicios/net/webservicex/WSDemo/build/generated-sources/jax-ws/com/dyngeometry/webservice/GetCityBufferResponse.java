
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
 *         &lt;element name="GetCityBufferResult" type="{http://www.DynGeometry.com/WebService/}CityBufferInfo" minOccurs="0"/>
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
    "getCityBufferResult"
})
@XmlRootElement(name = "GetCityBufferResponse")
public class GetCityBufferResponse {

    @XmlElement(name = "GetCityBufferResult")
    protected CityBufferInfo getCityBufferResult;

    /**
     * Gets the value of the getCityBufferResult property.
     * 
     * @return
     *     possible object is
     *     {@link CityBufferInfo }
     *     
     */
    public CityBufferInfo getGetCityBufferResult() {
        return getCityBufferResult;
    }

    /**
     * Sets the value of the getCityBufferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityBufferInfo }
     *     
     */
    public void setGetCityBufferResult(CityBufferInfo value) {
        this.getCityBufferResult = value;
    }

}
