
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
 *         &lt;element name="GetCityNeighborZipResult" type="{http://www.DynGeometry.com/WebService/}CityNeighborZipInfo" minOccurs="0"/>
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
    "getCityNeighborZipResult"
})
@XmlRootElement(name = "GetCityNeighborZipResponse")
public class GetCityNeighborZipResponse {

    @XmlElement(name = "GetCityNeighborZipResult")
    protected CityNeighborZipInfo getCityNeighborZipResult;

    /**
     * Gets the value of the getCityNeighborZipResult property.
     * 
     * @return
     *     possible object is
     *     {@link CityNeighborZipInfo }
     *     
     */
    public CityNeighborZipInfo getGetCityNeighborZipResult() {
        return getCityNeighborZipResult;
    }

    /**
     * Sets the value of the getCityNeighborZipResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityNeighborZipInfo }
     *     
     */
    public void setGetCityNeighborZipResult(CityNeighborZipInfo value) {
        this.getCityNeighborZipResult = value;
    }

}
