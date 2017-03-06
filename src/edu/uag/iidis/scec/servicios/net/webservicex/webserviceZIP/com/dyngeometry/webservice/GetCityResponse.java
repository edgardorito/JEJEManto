
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
 *         &lt;element name="GetCityResult" type="{http://www.DynGeometry.com/WebService/}CityInfo" minOccurs="0"/>
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
    "getCityResult"
})
@XmlRootElement(name = "GetCityResponse")
public class GetCityResponse {

    @XmlElement(name = "GetCityResult")
    protected CityInfo getCityResult;

    /**
     * Gets the value of the getCityResult property.
     * 
     * @return
     *     possible object is
     *     {@link CityInfo }
     *     
     */
    public CityInfo getGetCityResult() {
        return getCityResult;
    }

    /**
     * Sets the value of the getCityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityInfo }
     *     
     */
    public void setGetCityResult(CityInfo value) {
        this.getCityResult = value;
    }

}
