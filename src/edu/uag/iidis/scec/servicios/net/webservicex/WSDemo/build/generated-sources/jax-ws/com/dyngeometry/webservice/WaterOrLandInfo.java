
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaterOrLandInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterOrLandInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="waterOrLandIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterOrLandDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waterArea_Mi" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nearestWaterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nearestWaterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nearestWaterDistance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nearestWaterArea_Mi" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="stateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countyFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="error_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterOrLandInfo", propOrder = {
    "longitude",
    "latitude",
    "waterOrLandIndicator",
    "waterOrLandDesc",
    "waterName",
    "waterType",
    "waterAreaMi",
    "nearestWaterName",
    "nearestWaterType",
    "nearestWaterDistance",
    "nearestWaterAreaMi",
    "stateName",
    "stateFIPS",
    "countyName",
    "countyFIPS",
    "errorNo",
    "errorDesc"
})
public class WaterOrLandInfo {

    protected double longitude;
    protected double latitude;
    protected String waterOrLandIndicator;
    protected String waterOrLandDesc;
    protected String waterName;
    protected String waterType;
    @XmlElement(name = "waterArea_Mi")
    protected double waterAreaMi;
    protected String nearestWaterName;
    protected String nearestWaterType;
    protected double nearestWaterDistance;
    @XmlElement(name = "nearestWaterArea_Mi")
    protected double nearestWaterAreaMi;
    protected String stateName;
    protected String stateFIPS;
    protected String countyName;
    protected String countyFIPS;
    @XmlElement(name = "error_no")
    protected int errorNo;
    @XmlElement(name = "error_desc")
    protected String errorDesc;

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the waterOrLandIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterOrLandIndicator() {
        return waterOrLandIndicator;
    }

    /**
     * Sets the value of the waterOrLandIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterOrLandIndicator(String value) {
        this.waterOrLandIndicator = value;
    }

    /**
     * Gets the value of the waterOrLandDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterOrLandDesc() {
        return waterOrLandDesc;
    }

    /**
     * Sets the value of the waterOrLandDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterOrLandDesc(String value) {
        this.waterOrLandDesc = value;
    }

    /**
     * Gets the value of the waterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterName() {
        return waterName;
    }

    /**
     * Sets the value of the waterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterName(String value) {
        this.waterName = value;
    }

    /**
     * Gets the value of the waterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterType() {
        return waterType;
    }

    /**
     * Sets the value of the waterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterType(String value) {
        this.waterType = value;
    }

    /**
     * Gets the value of the waterAreaMi property.
     * 
     */
    public double getWaterAreaMi() {
        return waterAreaMi;
    }

    /**
     * Sets the value of the waterAreaMi property.
     * 
     */
    public void setWaterAreaMi(double value) {
        this.waterAreaMi = value;
    }

    /**
     * Gets the value of the nearestWaterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNearestWaterName() {
        return nearestWaterName;
    }

    /**
     * Sets the value of the nearestWaterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNearestWaterName(String value) {
        this.nearestWaterName = value;
    }

    /**
     * Gets the value of the nearestWaterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNearestWaterType() {
        return nearestWaterType;
    }

    /**
     * Sets the value of the nearestWaterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNearestWaterType(String value) {
        this.nearestWaterType = value;
    }

    /**
     * Gets the value of the nearestWaterDistance property.
     * 
     */
    public double getNearestWaterDistance() {
        return nearestWaterDistance;
    }

    /**
     * Sets the value of the nearestWaterDistance property.
     * 
     */
    public void setNearestWaterDistance(double value) {
        this.nearestWaterDistance = value;
    }

    /**
     * Gets the value of the nearestWaterAreaMi property.
     * 
     */
    public double getNearestWaterAreaMi() {
        return nearestWaterAreaMi;
    }

    /**
     * Sets the value of the nearestWaterAreaMi property.
     * 
     */
    public void setNearestWaterAreaMi(double value) {
        this.nearestWaterAreaMi = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

    /**
     * Gets the value of the stateFIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateFIPS() {
        return stateFIPS;
    }

    /**
     * Sets the value of the stateFIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateFIPS(String value) {
        this.stateFIPS = value;
    }

    /**
     * Gets the value of the countyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    /**
     * Gets the value of the countyFIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyFIPS() {
        return countyFIPS;
    }

    /**
     * Sets the value of the countyFIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyFIPS(String value) {
        this.countyFIPS = value;
    }

    /**
     * Gets the value of the errorNo property.
     * 
     */
    public int getErrorNo() {
        return errorNo;
    }

    /**
     * Sets the value of the errorNo property.
     * 
     */
    public void setErrorNo(int value) {
        this.errorNo = value;
    }

    /**
     * Gets the value of the errorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * Sets the value of the errorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

}
