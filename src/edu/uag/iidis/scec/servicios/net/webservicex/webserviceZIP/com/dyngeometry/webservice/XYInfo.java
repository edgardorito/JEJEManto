
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XYInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XYInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="censusCity" type="{http://www.DynGeometry.com/WebService/}CensusCity" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.DynGeometry.com/WebService/}State" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.DynGeometry.com/WebService/}Zip" minOccurs="0"/>
 *         &lt;element name="county" type="{http://www.DynGeometry.com/WebService/}County" minOccurs="0"/>
 *         &lt;element name="countySubdivision" type="{http://www.DynGeometry.com/WebService/}CountySubdivision" minOccurs="0"/>
 *         &lt;element name="censusTractFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockGroupFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coreBasedStatisticalArea" type="{http://www.DynGeometry.com/WebService/}CoreBasedStatisticalArea" minOccurs="0"/>
 *         &lt;element name="combinedStatisticalArea" type="{http://www.DynGeometry.com/WebService/}CombinedStatisticalArea" minOccurs="0"/>
 *         &lt;element name="metropolitanDivision" type="{http://www.DynGeometry.com/WebService/}MetropolitanDivision" minOccurs="0"/>
 *         &lt;element name="schoolDistrict" type="{http://www.DynGeometry.com/WebService/}SchoolDistrict" minOccurs="0"/>
 *         &lt;element name="trafficZone" type="{http://www.DynGeometry.com/WebService/}TrafficZone" minOccurs="0"/>
 *         &lt;element name="votingDistrict" type="{http://www.DynGeometry.com/WebService/}VotingDistrict" minOccurs="0"/>
 *         &lt;element name="areaCode" type="{http://www.DynGeometry.com/WebService/}AreaCode" minOccurs="0"/>
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
@XmlType(name = "XYInfo", propOrder = {
    "longitude",
    "latitude",
    "censusCity",
    "state",
    "zipCode",
    "county",
    "countySubdivision",
    "censusTractFIPS",
    "blockGroupFIPS",
    "coreBasedStatisticalArea",
    "combinedStatisticalArea",
    "metropolitanDivision",
    "schoolDistrict",
    "trafficZone",
    "votingDistrict",
    "areaCode",
    "errorNo",
    "errorDesc"
})
public class XYInfo {

    protected double longitude;
    protected double latitude;
    protected CensusCity censusCity;
    protected State state;
    protected Zip zipCode;
    protected County county;
    protected CountySubdivision countySubdivision;
    protected String censusTractFIPS;
    protected String blockGroupFIPS;
    protected CoreBasedStatisticalArea coreBasedStatisticalArea;
    protected CombinedStatisticalArea combinedStatisticalArea;
    protected MetropolitanDivision metropolitanDivision;
    protected SchoolDistrict schoolDistrict;
    protected TrafficZone trafficZone;
    protected VotingDistrict votingDistrict;
    protected AreaCode areaCode;
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
     * Gets the value of the censusCity property.
     * 
     * @return
     *     possible object is
     *     {@link CensusCity }
     *     
     */
    public CensusCity getCensusCity() {
        return censusCity;
    }

    /**
     * Sets the value of the censusCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CensusCity }
     *     
     */
    public void setCensusCity(CensusCity value) {
        this.censusCity = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setState(State value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link Zip }
     *     
     */
    public Zip getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zip }
     *     
     */
    public void setZipCode(Zip value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link County }
     *     
     */
    public County getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link County }
     *     
     */
    public void setCounty(County value) {
        this.county = value;
    }

    /**
     * Gets the value of the countySubdivision property.
     * 
     * @return
     *     possible object is
     *     {@link CountySubdivision }
     *     
     */
    public CountySubdivision getCountySubdivision() {
        return countySubdivision;
    }

    /**
     * Sets the value of the countySubdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountySubdivision }
     *     
     */
    public void setCountySubdivision(CountySubdivision value) {
        this.countySubdivision = value;
    }

    /**
     * Gets the value of the censusTractFIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCensusTractFIPS() {
        return censusTractFIPS;
    }

    /**
     * Sets the value of the censusTractFIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCensusTractFIPS(String value) {
        this.censusTractFIPS = value;
    }

    /**
     * Gets the value of the blockGroupFIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockGroupFIPS() {
        return blockGroupFIPS;
    }

    /**
     * Sets the value of the blockGroupFIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockGroupFIPS(String value) {
        this.blockGroupFIPS = value;
    }

    /**
     * Gets the value of the coreBasedStatisticalArea property.
     * 
     * @return
     *     possible object is
     *     {@link CoreBasedStatisticalArea }
     *     
     */
    public CoreBasedStatisticalArea getCoreBasedStatisticalArea() {
        return coreBasedStatisticalArea;
    }

    /**
     * Sets the value of the coreBasedStatisticalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreBasedStatisticalArea }
     *     
     */
    public void setCoreBasedStatisticalArea(CoreBasedStatisticalArea value) {
        this.coreBasedStatisticalArea = value;
    }

    /**
     * Gets the value of the combinedStatisticalArea property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedStatisticalArea }
     *     
     */
    public CombinedStatisticalArea getCombinedStatisticalArea() {
        return combinedStatisticalArea;
    }

    /**
     * Sets the value of the combinedStatisticalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedStatisticalArea }
     *     
     */
    public void setCombinedStatisticalArea(CombinedStatisticalArea value) {
        this.combinedStatisticalArea = value;
    }

    /**
     * Gets the value of the metropolitanDivision property.
     * 
     * @return
     *     possible object is
     *     {@link MetropolitanDivision }
     *     
     */
    public MetropolitanDivision getMetropolitanDivision() {
        return metropolitanDivision;
    }

    /**
     * Sets the value of the metropolitanDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetropolitanDivision }
     *     
     */
    public void setMetropolitanDivision(MetropolitanDivision value) {
        this.metropolitanDivision = value;
    }

    /**
     * Gets the value of the schoolDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolDistrict }
     *     
     */
    public SchoolDistrict getSchoolDistrict() {
        return schoolDistrict;
    }

    /**
     * Sets the value of the schoolDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolDistrict }
     *     
     */
    public void setSchoolDistrict(SchoolDistrict value) {
        this.schoolDistrict = value;
    }

    /**
     * Gets the value of the trafficZone property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficZone }
     *     
     */
    public TrafficZone getTrafficZone() {
        return trafficZone;
    }

    /**
     * Sets the value of the trafficZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficZone }
     *     
     */
    public void setTrafficZone(TrafficZone value) {
        this.trafficZone = value;
    }

    /**
     * Gets the value of the votingDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link VotingDistrict }
     *     
     */
    public VotingDistrict getVotingDistrict() {
        return votingDistrict;
    }

    /**
     * Sets the value of the votingDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link VotingDistrict }
     *     
     */
    public void setVotingDistrict(VotingDistrict value) {
        this.votingDistrict = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link AreaCode }
     *     
     */
    public AreaCode getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaCode }
     *     
     */
    public void setAreaCode(AreaCode value) {
        this.areaCode = value;
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
