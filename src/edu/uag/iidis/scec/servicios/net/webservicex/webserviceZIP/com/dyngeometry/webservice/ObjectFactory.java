
package com.dyngeometry.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dyngeometry.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _XYInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "XYInfo");
    private final static QName _CityNeighborZipInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "CityNeighborZipInfo");
    private final static QName _CityBufferInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "CityBufferInfo");
    private final static QName _IPInfoPro_QNAME = new QName("http://www.DynGeometry.com/WebService/", "IPInfoPro");
    private final static QName _ZipBufferInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "ZipBufferInfo");
    private final static QName _CensusTractInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "CensusTractInfo");
    private final static QName _SchoolDistrictInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "SchoolDistrictInfo");
    private final static QName _WaterOrLandInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "WaterOrLandInfo");
    private final static QName _IPInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "IPInfo");
    private final static QName _ZipNeighborCityInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "ZipNeighborCityInfo");
    private final static QName _AddressInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "AddressInfo");
    private final static QName _CountyInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "CountyInfo");
    private final static QName _CityInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "CityInfo");
    private final static QName _Address_QNAME = new QName("http://www.DynGeometry.com/WebService/", "Address");
    private final static QName _ZipInfo_QNAME = new QName("http://www.DynGeometry.com/WebService/", "ZipInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dyngeometry.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetZipBuffer }
     * 
     */
    public GetZipBuffer createGetZipBuffer() {
        return new GetZipBuffer();
    }

    /**
     * Create an instance of {@link CountyInfo }
     * 
     */
    public CountyInfo createCountyInfo() {
        return new CountyInfo();
    }

    /**
     * Create an instance of {@link CityInfo }
     * 
     */
    public CityInfo createCityInfo() {
        return new CityInfo();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link GetWaterOrLandResponse }
     * 
     */
    public GetWaterOrLandResponse createGetWaterOrLandResponse() {
        return new GetWaterOrLandResponse();
    }

    /**
     * Create an instance of {@link WaterOrLandInfo }
     * 
     */
    public WaterOrLandInfo createWaterOrLandInfo() {
        return new WaterOrLandInfo();
    }

    /**
     * Create an instance of {@link ZipBufferInfo }
     * 
     */
    public ZipBufferInfo createZipBufferInfo() {
        return new ZipBufferInfo();
    }

    /**
     * Create an instance of {@link GetCensusTractResponse }
     * 
     */
    public GetCensusTractResponse createGetCensusTractResponse() {
        return new GetCensusTractResponse();
    }

    /**
     * Create an instance of {@link CensusTractInfo }
     * 
     */
    public CensusTractInfo createCensusTractInfo() {
        return new CensusTractInfo();
    }

    /**
     * Create an instance of {@link GeocodePro }
     * 
     */
    public GeocodePro createGeocodePro() {
        return new GeocodePro();
    }

    /**
     * Create an instance of {@link ZipNeighborCityInfo }
     * 
     */
    public ZipNeighborCityInfo createZipNeighborCityInfo() {
        return new ZipNeighborCityInfo();
    }

    /**
     * Create an instance of {@link GetCityBuffer }
     * 
     */
    public GetCityBuffer createGetCityBuffer() {
        return new GetCityBuffer();
    }

    /**
     * Create an instance of {@link GetCityNeighborZipResponse }
     * 
     */
    public GetCityNeighborZipResponse createGetCityNeighborZipResponse() {
        return new GetCityNeighborZipResponse();
    }

    /**
     * Create an instance of {@link CityNeighborZipInfo }
     * 
     */
    public CityNeighborZipInfo createCityNeighborZipInfo() {
        return new CityNeighborZipInfo();
    }

    /**
     * Create an instance of {@link GetCityResponse }
     * 
     */
    public GetCityResponse createGetCityResponse() {
        return new GetCityResponse();
    }

    /**
     * Create an instance of {@link GetCountyResponse }
     * 
     */
    public GetCountyResponse createGetCountyResponse() {
        return new GetCountyResponse();
    }

    /**
     * Create an instance of {@link GetZipResponse }
     * 
     */
    public GetZipResponse createGetZipResponse() {
        return new GetZipResponse();
    }

    /**
     * Create an instance of {@link ZipInfo }
     * 
     */
    public ZipInfo createZipInfo() {
        return new ZipInfo();
    }

    /**
     * Create an instance of {@link GetWaterOrLand }
     * 
     */
    public GetWaterOrLand createGetWaterOrLand() {
        return new GetWaterOrLand();
    }

    /**
     * Create an instance of {@link GetZipNeighborCity }
     * 
     */
    public GetZipNeighborCity createGetZipNeighborCity() {
        return new GetZipNeighborCity();
    }

    /**
     * Create an instance of {@link GetCensusTract }
     * 
     */
    public GetCensusTract createGetCensusTract() {
        return new GetCensusTract();
    }

    /**
     * Create an instance of {@link IPQueryResponse }
     * 
     */
    public IPQueryResponse createIPQueryResponse() {
        return new IPQueryResponse();
    }

    /**
     * Create an instance of {@link IPInfo }
     * 
     */
    public IPInfo createIPInfo() {
        return new IPInfo();
    }

    /**
     * Create an instance of {@link GetCityBufferResponse }
     * 
     */
    public GetCityBufferResponse createGetCityBufferResponse() {
        return new GetCityBufferResponse();
    }

    /**
     * Create an instance of {@link CityBufferInfo }
     * 
     */
    public CityBufferInfo createCityBufferInfo() {
        return new CityBufferInfo();
    }

    /**
     * Create an instance of {@link Geocode }
     * 
     */
    public Geocode createGeocode() {
        return new Geocode();
    }

    /**
     * Create an instance of {@link GetZip }
     * 
     */
    public GetZip createGetZip() {
        return new GetZip();
    }

    /**
     * Create an instance of {@link XYQuery }
     * 
     */
    public XYQuery createXYQuery() {
        return new XYQuery();
    }

    /**
     * Create an instance of {@link IPQueryPro }
     * 
     */
    public IPQueryPro createIPQueryPro() {
        return new IPQueryPro();
    }

    /**
     * Create an instance of {@link SchoolDistrictInfo }
     * 
     */
    public SchoolDistrictInfo createSchoolDistrictInfo() {
        return new SchoolDistrictInfo();
    }

    /**
     * Create an instance of {@link GetCounty }
     * 
     */
    public GetCounty createGetCounty() {
        return new GetCounty();
    }

    /**
     * Create an instance of {@link XYQueryResponse }
     * 
     */
    public XYQueryResponse createXYQueryResponse() {
        return new XYQueryResponse();
    }

    /**
     * Create an instance of {@link XYInfo }
     * 
     */
    public XYInfo createXYInfo() {
        return new XYInfo();
    }

    /**
     * Create an instance of {@link AddressInfo }
     * 
     */
    public AddressInfo createAddressInfo() {
        return new AddressInfo();
    }

    /**
     * Create an instance of {@link GetSchoolDistrict }
     * 
     */
    public GetSchoolDistrict createGetSchoolDistrict() {
        return new GetSchoolDistrict();
    }

    /**
     * Create an instance of {@link GetSchoolDistrictResponse }
     * 
     */
    public GetSchoolDistrictResponse createGetSchoolDistrictResponse() {
        return new GetSchoolDistrictResponse();
    }

    /**
     * Create an instance of {@link IPQueryProResponse }
     * 
     */
    public IPQueryProResponse createIPQueryProResponse() {
        return new IPQueryProResponse();
    }

    /**
     * Create an instance of {@link IPInfoPro }
     * 
     */
    public IPInfoPro createIPInfoPro() {
        return new IPInfoPro();
    }

    /**
     * Create an instance of {@link GetZipBufferResponse }
     * 
     */
    public GetZipBufferResponse createGetZipBufferResponse() {
        return new GetZipBufferResponse();
    }

    /**
     * Create an instance of {@link GetCity }
     * 
     */
    public GetCity createGetCity() {
        return new GetCity();
    }

    /**
     * Create an instance of {@link GeocodeResponse }
     * 
     */
    public GeocodeResponse createGeocodeResponse() {
        return new GeocodeResponse();
    }

    /**
     * Create an instance of {@link IPQuery }
     * 
     */
    public IPQuery createIPQuery() {
        return new IPQuery();
    }

    /**
     * Create an instance of {@link GetCityNeighborZip }
     * 
     */
    public GetCityNeighborZip createGetCityNeighborZip() {
        return new GetCityNeighborZip();
    }

    /**
     * Create an instance of {@link GeocodeProResponse }
     * 
     */
    public GeocodeProResponse createGeocodeProResponse() {
        return new GeocodeProResponse();
    }

    /**
     * Create an instance of {@link GetZipNeighborCityResponse }
     * 
     */
    public GetZipNeighborCityResponse createGetZipNeighborCityResponse() {
        return new GetZipNeighborCityResponse();
    }

    /**
     * Create an instance of {@link Zip }
     * 
     */
    public Zip createZip() {
        return new Zip();
    }

    /**
     * Create an instance of {@link TrafficZone }
     * 
     */
    public TrafficZone createTrafficZone() {
        return new TrafficZone();
    }

    /**
     * Create an instance of {@link County }
     * 
     */
    public County createCounty() {
        return new County();
    }

    /**
     * Create an instance of {@link ArrayOfCensusCity }
     * 
     */
    public ArrayOfCensusCity createArrayOfCensusCity() {
        return new ArrayOfCensusCity();
    }

    /**
     * Create an instance of {@link CoreBasedStatisticalArea }
     * 
     */
    public CoreBasedStatisticalArea createCoreBasedStatisticalArea() {
        return new CoreBasedStatisticalArea();
    }

    /**
     * Create an instance of {@link CountySubdivision }
     * 
     */
    public CountySubdivision createCountySubdivision() {
        return new CountySubdivision();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link CombinedStatisticalArea }
     * 
     */
    public CombinedStatisticalArea createCombinedStatisticalArea() {
        return new CombinedStatisticalArea();
    }

    /**
     * Create an instance of {@link CensusCity }
     * 
     */
    public CensusCity createCensusCity() {
        return new CensusCity();
    }

    /**
     * Create an instance of {@link SchoolDistrict }
     * 
     */
    public SchoolDistrict createSchoolDistrict() {
        return new SchoolDistrict();
    }

    /**
     * Create an instance of {@link ArrayOfZip }
     * 
     */
    public ArrayOfZip createArrayOfZip() {
        return new ArrayOfZip();
    }

    /**
     * Create an instance of {@link State }
     * 
     */
    public State createState() {
        return new State();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfPoint }
     * 
     */
    public ArrayOfPoint createArrayOfPoint() {
        return new ArrayOfPoint();
    }

    /**
     * Create an instance of {@link AreaCode }
     * 
     */
    public AreaCode createAreaCode() {
        return new AreaCode();
    }

    /**
     * Create an instance of {@link MetropolitanDivision }
     * 
     */
    public MetropolitanDivision createMetropolitanDivision() {
        return new MetropolitanDivision();
    }

    /**
     * Create an instance of {@link VotingDistrict }
     * 
     */
    public VotingDistrict createVotingDistrict() {
        return new VotingDistrict();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XYInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "XYInfo")
    public JAXBElement<XYInfo> createXYInfo(XYInfo value) {
        return new JAXBElement<XYInfo>(_XYInfo_QNAME, XYInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityNeighborZipInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "CityNeighborZipInfo")
    public JAXBElement<CityNeighborZipInfo> createCityNeighborZipInfo(CityNeighborZipInfo value) {
        return new JAXBElement<CityNeighborZipInfo>(_CityNeighborZipInfo_QNAME, CityNeighborZipInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityBufferInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "CityBufferInfo")
    public JAXBElement<CityBufferInfo> createCityBufferInfo(CityBufferInfo value) {
        return new JAXBElement<CityBufferInfo>(_CityBufferInfo_QNAME, CityBufferInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IPInfoPro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "IPInfoPro")
    public JAXBElement<IPInfoPro> createIPInfoPro(IPInfoPro value) {
        return new JAXBElement<IPInfoPro>(_IPInfoPro_QNAME, IPInfoPro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZipBufferInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "ZipBufferInfo")
    public JAXBElement<ZipBufferInfo> createZipBufferInfo(ZipBufferInfo value) {
        return new JAXBElement<ZipBufferInfo>(_ZipBufferInfo_QNAME, ZipBufferInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CensusTractInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "CensusTractInfo")
    public JAXBElement<CensusTractInfo> createCensusTractInfo(CensusTractInfo value) {
        return new JAXBElement<CensusTractInfo>(_CensusTractInfo_QNAME, CensusTractInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolDistrictInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "SchoolDistrictInfo")
    public JAXBElement<SchoolDistrictInfo> createSchoolDistrictInfo(SchoolDistrictInfo value) {
        return new JAXBElement<SchoolDistrictInfo>(_SchoolDistrictInfo_QNAME, SchoolDistrictInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterOrLandInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "WaterOrLandInfo")
    public JAXBElement<WaterOrLandInfo> createWaterOrLandInfo(WaterOrLandInfo value) {
        return new JAXBElement<WaterOrLandInfo>(_WaterOrLandInfo_QNAME, WaterOrLandInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IPInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "IPInfo")
    public JAXBElement<IPInfo> createIPInfo(IPInfo value) {
        return new JAXBElement<IPInfo>(_IPInfo_QNAME, IPInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZipNeighborCityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "ZipNeighborCityInfo")
    public JAXBElement<ZipNeighborCityInfo> createZipNeighborCityInfo(ZipNeighborCityInfo value) {
        return new JAXBElement<ZipNeighborCityInfo>(_ZipNeighborCityInfo_QNAME, ZipNeighborCityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "AddressInfo")
    public JAXBElement<AddressInfo> createAddressInfo(AddressInfo value) {
        return new JAXBElement<AddressInfo>(_AddressInfo_QNAME, AddressInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountyInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "CountyInfo")
    public JAXBElement<CountyInfo> createCountyInfo(CountyInfo value) {
        return new JAXBElement<CountyInfo>(_CountyInfo_QNAME, CountyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "CityInfo")
    public JAXBElement<CityInfo> createCityInfo(CityInfo value) {
        return new JAXBElement<CityInfo>(_CityInfo_QNAME, CityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZipInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DynGeometry.com/WebService/", name = "ZipInfo")
    public JAXBElement<ZipInfo> createZipInfo(ZipInfo value) {
        return new JAXBElement<ZipInfo>(_ZipInfo_QNAME, ZipInfo.class, null, value);
    }

}
