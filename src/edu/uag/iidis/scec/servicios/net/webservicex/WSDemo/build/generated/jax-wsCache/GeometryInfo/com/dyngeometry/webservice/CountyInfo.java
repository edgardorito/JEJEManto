
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countyFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pop2005" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="houseHolds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="avg_Sale97" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="centerX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="centerY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="highth_Mi" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="width_Mi" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="area_Mi" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="geom" type="{http://www.DynGeometry.com/WebService/}ArrayOfPoint" minOccurs="0"/>
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
@XmlType(name = "CountyInfo", propOrder = {
    "countyName",
    "countyFIPS",
    "state",
    "pop2005",
    "houseHolds",
    "avgSale97",
    "centerX",
    "centerY",
    "minX",
    "minY",
    "maxX",
    "maxY",
    "highthMi",
    "widthMi",
    "areaMi",
    "geom",
    "errorNo",
    "errorDesc"
})
public class CountyInfo {

    protected String countyName;
    protected String countyFIPS;
    protected String state;
    protected double pop2005;
    protected double houseHolds;
    @XmlElement(name = "avg_Sale97")
    protected double avgSale97;
    protected double centerX;
    protected double centerY;
    protected double minX;
    protected double minY;
    protected double maxX;
    protected double maxY;
    @XmlElement(name = "highth_Mi")
    protected double highthMi;
    @XmlElement(name = "width_Mi")
    protected double widthMi;
    @XmlElement(name = "area_Mi")
    protected double areaMi;
    protected ArrayOfPoint geom;
    @XmlElement(name = "error_no")
    protected int errorNo;
    @XmlElement(name = "error_desc")
    protected String errorDesc;

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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the pop2005 property.
     * 
     */
    public double getPop2005() {
        return pop2005;
    }

    /**
     * Sets the value of the pop2005 property.
     * 
     */
    public void setPop2005(double value) {
        this.pop2005 = value;
    }

    /**
     * Gets the value of the houseHolds property.
     * 
     */
    public double getHouseHolds() {
        return houseHolds;
    }

    /**
     * Sets the value of the houseHolds property.
     * 
     */
    public void setHouseHolds(double value) {
        this.houseHolds = value;
    }

    /**
     * Gets the value of the avgSale97 property.
     * 
     */
    public double getAvgSale97() {
        return avgSale97;
    }

    /**
     * Sets the value of the avgSale97 property.
     * 
     */
    public void setAvgSale97(double value) {
        this.avgSale97 = value;
    }

    /**
     * Gets the value of the centerX property.
     * 
     */
    public double getCenterX() {
        return centerX;
    }

    /**
     * Sets the value of the centerX property.
     * 
     */
    public void setCenterX(double value) {
        this.centerX = value;
    }

    /**
     * Gets the value of the centerY property.
     * 
     */
    public double getCenterY() {
        return centerY;
    }

    /**
     * Sets the value of the centerY property.
     * 
     */
    public void setCenterY(double value) {
        this.centerY = value;
    }

    /**
     * Gets the value of the minX property.
     * 
     */
    public double getMinX() {
        return minX;
    }

    /**
     * Sets the value of the minX property.
     * 
     */
    public void setMinX(double value) {
        this.minX = value;
    }

    /**
     * Gets the value of the minY property.
     * 
     */
    public double getMinY() {
        return minY;
    }

    /**
     * Sets the value of the minY property.
     * 
     */
    public void setMinY(double value) {
        this.minY = value;
    }

    /**
     * Gets the value of the maxX property.
     * 
     */
    public double getMaxX() {
        return maxX;
    }

    /**
     * Sets the value of the maxX property.
     * 
     */
    public void setMaxX(double value) {
        this.maxX = value;
    }

    /**
     * Gets the value of the maxY property.
     * 
     */
    public double getMaxY() {
        return maxY;
    }

    /**
     * Sets the value of the maxY property.
     * 
     */
    public void setMaxY(double value) {
        this.maxY = value;
    }

    /**
     * Gets the value of the highthMi property.
     * 
     */
    public double getHighthMi() {
        return highthMi;
    }

    /**
     * Sets the value of the highthMi property.
     * 
     */
    public void setHighthMi(double value) {
        this.highthMi = value;
    }

    /**
     * Gets the value of the widthMi property.
     * 
     */
    public double getWidthMi() {
        return widthMi;
    }

    /**
     * Sets the value of the widthMi property.
     * 
     */
    public void setWidthMi(double value) {
        this.widthMi = value;
    }

    /**
     * Gets the value of the areaMi property.
     * 
     */
    public double getAreaMi() {
        return areaMi;
    }

    /**
     * Sets the value of the areaMi property.
     * 
     */
    public void setAreaMi(double value) {
        this.areaMi = value;
    }

    /**
     * Gets the value of the geom property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPoint }
     *     
     */
    public ArrayOfPoint getGeom() {
        return geom;
    }

    /**
     * Sets the value of the geom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPoint }
     *     
     */
    public void setGeom(ArrayOfPoint value) {
        this.geom = value;
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
