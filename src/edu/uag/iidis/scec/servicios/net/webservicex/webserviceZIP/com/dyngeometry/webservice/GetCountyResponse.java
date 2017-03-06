
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
 *         &lt;element name="GetCountyResult" type="{http://www.DynGeometry.com/WebService/}CountyInfo" minOccurs="0"/>
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
    "getCountyResult"
})
@XmlRootElement(name = "GetCountyResponse")
public class GetCountyResponse {

    @XmlElement(name = "GetCountyResult")
    protected CountyInfo getCountyResult;

    /**
     * Gets the value of the getCountyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CountyInfo }
     *     
     */
    public CountyInfo getGetCountyResult() {
        return getCountyResult;
    }

    /**
     * Sets the value of the getCountyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountyInfo }
     *     
     */
    public void setGetCountyResult(CountyInfo value) {
        this.getCountyResult = value;
    }

}
