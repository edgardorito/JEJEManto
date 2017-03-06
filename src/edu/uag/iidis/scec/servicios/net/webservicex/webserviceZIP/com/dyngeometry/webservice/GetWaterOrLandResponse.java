
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
 *         &lt;element name="GetWaterOrLandResult" type="{http://www.DynGeometry.com/WebService/}WaterOrLandInfo" minOccurs="0"/>
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
    "getWaterOrLandResult"
})
@XmlRootElement(name = "GetWaterOrLandResponse")
public class GetWaterOrLandResponse {

    @XmlElement(name = "GetWaterOrLandResult")
    protected WaterOrLandInfo getWaterOrLandResult;

    /**
     * Gets the value of the getWaterOrLandResult property.
     * 
     * @return
     *     possible object is
     *     {@link WaterOrLandInfo }
     *     
     */
    public WaterOrLandInfo getGetWaterOrLandResult() {
        return getWaterOrLandResult;
    }

    /**
     * Sets the value of the getWaterOrLandResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterOrLandInfo }
     *     
     */
    public void setGetWaterOrLandResult(WaterOrLandInfo value) {
        this.getWaterOrLandResult = value;
    }

}
