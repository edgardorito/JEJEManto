
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficZone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficZone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trafficZoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trafficZoneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficZone", propOrder = {
    "trafficZoneName",
    "trafficZoneID"
})
public class TrafficZone {

    protected String trafficZoneName;
    protected String trafficZoneID;

    /**
     * Gets the value of the trafficZoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficZoneName() {
        return trafficZoneName;
    }

    /**
     * Sets the value of the trafficZoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficZoneName(String value) {
        this.trafficZoneName = value;
    }

    /**
     * Gets the value of the trafficZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficZoneID() {
        return trafficZoneID;
    }

    /**
     * Sets the value of the trafficZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficZoneID(String value) {
        this.trafficZoneID = value;
    }

}
