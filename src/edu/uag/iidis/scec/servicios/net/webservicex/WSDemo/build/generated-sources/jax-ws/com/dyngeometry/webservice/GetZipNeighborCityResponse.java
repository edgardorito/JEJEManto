
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
 *         &lt;element name="GetZipNeighborCityResult" type="{http://www.DynGeometry.com/WebService/}ZipNeighborCityInfo" minOccurs="0"/>
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
    "getZipNeighborCityResult"
})
@XmlRootElement(name = "GetZipNeighborCityResponse")
public class GetZipNeighborCityResponse {

    @XmlElement(name = "GetZipNeighborCityResult")
    protected ZipNeighborCityInfo getZipNeighborCityResult;

    /**
     * Gets the value of the getZipNeighborCityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZipNeighborCityInfo }
     *     
     */
    public ZipNeighborCityInfo getGetZipNeighborCityResult() {
        return getZipNeighborCityResult;
    }

    /**
     * Sets the value of the getZipNeighborCityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipNeighborCityInfo }
     *     
     */
    public void setGetZipNeighborCityResult(ZipNeighborCityInfo value) {
        this.getZipNeighborCityResult = value;
    }

}
