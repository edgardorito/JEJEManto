
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchoolDistrictInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolDistrictInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schoolDistrictUnifiedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictUnifiedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictSecondaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictSecondaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictElementaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictElementaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrollment" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "SchoolDistrictInfo", propOrder = {
    "schoolDistrictUnifiedName",
    "schoolDistrictUnifiedID",
    "schoolDistrictSecondaryName",
    "schoolDistrictSecondaryID",
    "schoolDistrictElementaryName",
    "schoolDistrictElementaryID",
    "state",
    "enrollment",
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
public class SchoolDistrictInfo {

    protected String schoolDistrictUnifiedName;
    protected String schoolDistrictUnifiedID;
    protected String schoolDistrictSecondaryName;
    protected String schoolDistrictSecondaryID;
    protected String schoolDistrictElementaryName;
    protected String schoolDistrictElementaryID;
    protected String state;
    protected int enrollment;
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
     * Gets the value of the schoolDistrictUnifiedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictUnifiedName() {
        return schoolDistrictUnifiedName;
    }

    /**
     * Sets the value of the schoolDistrictUnifiedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictUnifiedName(String value) {
        this.schoolDistrictUnifiedName = value;
    }

    /**
     * Gets the value of the schoolDistrictUnifiedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictUnifiedID() {
        return schoolDistrictUnifiedID;
    }

    /**
     * Sets the value of the schoolDistrictUnifiedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictUnifiedID(String value) {
        this.schoolDistrictUnifiedID = value;
    }

    /**
     * Gets the value of the schoolDistrictSecondaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictSecondaryName() {
        return schoolDistrictSecondaryName;
    }

    /**
     * Sets the value of the schoolDistrictSecondaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictSecondaryName(String value) {
        this.schoolDistrictSecondaryName = value;
    }

    /**
     * Gets the value of the schoolDistrictSecondaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictSecondaryID() {
        return schoolDistrictSecondaryID;
    }

    /**
     * Sets the value of the schoolDistrictSecondaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictSecondaryID(String value) {
        this.schoolDistrictSecondaryID = value;
    }

    /**
     * Gets the value of the schoolDistrictElementaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictElementaryName() {
        return schoolDistrictElementaryName;
    }

    /**
     * Sets the value of the schoolDistrictElementaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictElementaryName(String value) {
        this.schoolDistrictElementaryName = value;
    }

    /**
     * Gets the value of the schoolDistrictElementaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictElementaryID() {
        return schoolDistrictElementaryID;
    }

    /**
     * Sets the value of the schoolDistrictElementaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictElementaryID(String value) {
        this.schoolDistrictElementaryID = value;
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
     * Gets the value of the enrollment property.
     * 
     */
    public int getEnrollment() {
        return enrollment;
    }

    /**
     * Sets the value of the enrollment property.
     * 
     */
    public void setEnrollment(int value) {
        this.enrollment = value;
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
