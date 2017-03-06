
package com.dyngeometry.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GeometryInfo", targetNamespace = "http://www.DynGeometry.com/WebService/", wsdlLocation = "http://www.dyngeometry.com/WebServiceV2/GeometryInfo.asmx?WSDL")
public class GeometryInfo
    extends Service
{

    private final static URL GEOMETRYINFO_WSDL_LOCATION;
    private final static WebServiceException GEOMETRYINFO_EXCEPTION;
    private final static QName GEOMETRYINFO_QNAME = new QName("http://www.DynGeometry.com/WebService/", "GeometryInfo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.dyngeometry.com/WebServiceV2/GeometryInfo.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GEOMETRYINFO_WSDL_LOCATION = url;
        GEOMETRYINFO_EXCEPTION = e;
    }

    public GeometryInfo() {
        super(__getWsdlLocation(), GEOMETRYINFO_QNAME);
    }

    public GeometryInfo(WebServiceFeature... features) {
        super(__getWsdlLocation(), GEOMETRYINFO_QNAME, features);
    }

    public GeometryInfo(URL wsdlLocation) {
        super(wsdlLocation, GEOMETRYINFO_QNAME);
    }

    public GeometryInfo(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GEOMETRYINFO_QNAME, features);
    }

    public GeometryInfo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GeometryInfo(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GeometryInfoSoap
     */
    @WebEndpoint(name = "GeometryInfoSoap")
    public GeometryInfoSoap getGeometryInfoSoap() {
        return super.getPort(new QName("http://www.DynGeometry.com/WebService/", "GeometryInfoSoap"), GeometryInfoSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GeometryInfoSoap
     */
    @WebEndpoint(name = "GeometryInfoSoap")
    public GeometryInfoSoap getGeometryInfoSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.DynGeometry.com/WebService/", "GeometryInfoSoap"), GeometryInfoSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GEOMETRYINFO_EXCEPTION!= null) {
            throw GEOMETRYINFO_EXCEPTION;
        }
        return GEOMETRYINFO_WSDL_LOCATION;
    }

}