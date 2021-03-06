
package com.microsoft.schemas.ws._2008._06.identity.securitytokenservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SecurityTokenService", targetNamespace = "http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", wsdlLocation = "file:/home/abhayk/workspaces/jar/testsdf/adfs.wsdl")
public class SecurityTokenService
    extends Service
{

    private final static URL SECURITYTOKENSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.microsoft.schemas.ws._2008._06.identity.securitytokenservice.SecurityTokenService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.microsoft.schemas.ws._2008._06.identity.securitytokenservice.SecurityTokenService.class.getResource(".");
            url = new URL(baseUrl, "file:/home/abhayk/workspaces/jar/testsdf/adfs.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/home/abhayk/workspaces/jar/testsdf/adfs.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SECURITYTOKENSERVICE_WSDL_LOCATION = url;
    }

    public SecurityTokenService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SecurityTokenService() {
        super(SECURITYTOKENSERVICE_WSDL_LOCATION, new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "SecurityTokenService"));
    }

    /**
     * 
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "CustomBinding_IWSTrustFeb2005Async")
    public IWSTrustFeb2005Async getCustomBindingIWSTrustFeb2005Async() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CustomBinding_IWSTrustFeb2005Async"), IWSTrustFeb2005Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "CustomBinding_IWSTrustFeb2005Async")
    public IWSTrustFeb2005Async getCustomBindingIWSTrustFeb2005Async(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CustomBinding_IWSTrustFeb2005Async"), IWSTrustFeb2005Async.class, features);
    }

    /**
     * 
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "CertificateWSTrustBinding_IWSTrustFeb2005Async")
    public IWSTrustFeb2005Async getCertificateWSTrustBindingIWSTrustFeb2005Async() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CertificateWSTrustBinding_IWSTrustFeb2005Async"), IWSTrustFeb2005Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "CertificateWSTrustBinding_IWSTrustFeb2005Async")
    public IWSTrustFeb2005Async getCertificateWSTrustBindingIWSTrustFeb2005Async(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CertificateWSTrustBinding_IWSTrustFeb2005Async"), IWSTrustFeb2005Async.class, features);
    }

    /**
     * 
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "CertificateWSTrustBinding_IWSTrustFeb2005Async1")
    public IWSTrustFeb2005Async getCertificateWSTrustBindingIWSTrustFeb2005Async1() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CertificateWSTrustBinding_IWSTrustFeb2005Async1"), IWSTrustFeb2005Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "CertificateWSTrustBinding_IWSTrustFeb2005Async1")
    public IWSTrustFeb2005Async getCertificateWSTrustBindingIWSTrustFeb2005Async1(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CertificateWSTrustBinding_IWSTrustFeb2005Async1"), IWSTrustFeb2005Async.class, features);
    }

    /**
     * 
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "UserNameWSTrustBinding_IWSTrustFeb2005Async")
    public IWSTrustFeb2005Async getUserNameWSTrustBindingIWSTrustFeb2005Async() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "UserNameWSTrustBinding_IWSTrustFeb2005Async"), IWSTrustFeb2005Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "UserNameWSTrustBinding_IWSTrustFeb2005Async")
    public IWSTrustFeb2005Async getUserNameWSTrustBindingIWSTrustFeb2005Async(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "UserNameWSTrustBinding_IWSTrustFeb2005Async"), IWSTrustFeb2005Async.class, features);
    }

    /**
     * 
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "CustomBinding_IWSTrustFeb2005Async1")
    public IWSTrustFeb2005Async getCustomBindingIWSTrustFeb2005Async1() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CustomBinding_IWSTrustFeb2005Async1"), IWSTrustFeb2005Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "CustomBinding_IWSTrustFeb2005Async1")
    public IWSTrustFeb2005Async getCustomBindingIWSTrustFeb2005Async1(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CustomBinding_IWSTrustFeb2005Async1"), IWSTrustFeb2005Async.class, features);
    }

    /**
     * 
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "IssuedTokenWSTrustBinding_IWSTrustFeb2005Async")
    public IWSTrustFeb2005Async getIssuedTokenWSTrustBindingIWSTrustFeb2005Async() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "IssuedTokenWSTrustBinding_IWSTrustFeb2005Async"), IWSTrustFeb2005Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "IssuedTokenWSTrustBinding_IWSTrustFeb2005Async")
    public IWSTrustFeb2005Async getIssuedTokenWSTrustBindingIWSTrustFeb2005Async(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "IssuedTokenWSTrustBinding_IWSTrustFeb2005Async"), IWSTrustFeb2005Async.class, features);
    }

    /**
     * 
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "IssuedTokenWSTrustBinding_IWSTrustFeb2005Async1")
    public IWSTrustFeb2005Async getIssuedTokenWSTrustBindingIWSTrustFeb2005Async1() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "IssuedTokenWSTrustBinding_IWSTrustFeb2005Async1"), IWSTrustFeb2005Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrustFeb2005Async
     */
    @WebEndpoint(name = "IssuedTokenWSTrustBinding_IWSTrustFeb2005Async1")
    public IWSTrustFeb2005Async getIssuedTokenWSTrustBindingIWSTrustFeb2005Async1(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "IssuedTokenWSTrustBinding_IWSTrustFeb2005Async1"), IWSTrustFeb2005Async.class, features);
    }

    /**
     * 
     * @return
     *     returns IWSTrust13Async
     */
    @WebEndpoint(name = "CustomBinding_IWSTrust13Async")
    public IWSTrust13Async getCustomBindingIWSTrust13Async() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CustomBinding_IWSTrust13Async"), IWSTrust13Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrust13Async
     */
    @WebEndpoint(name = "CustomBinding_IWSTrust13Async")
    public IWSTrust13Async getCustomBindingIWSTrust13Async(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CustomBinding_IWSTrust13Async"), IWSTrust13Async.class, features);
    }

    /**
     * 
     * @return
     *     returns IWSTrust13Async
     */
    @WebEndpoint(name = "CertificateWSTrustBinding_IWSTrust13Async")
    public IWSTrust13Async getCertificateWSTrustBindingIWSTrust13Async() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CertificateWSTrustBinding_IWSTrust13Async"), IWSTrust13Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrust13Async
     */
    @WebEndpoint(name = "CertificateWSTrustBinding_IWSTrust13Async")
    public IWSTrust13Async getCertificateWSTrustBindingIWSTrust13Async(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "CertificateWSTrustBinding_IWSTrust13Async"), IWSTrust13Async.class, features);
    }

    /**
     * 
     * @return
     *     returns IWSTrust13Async
     */
    @WebEndpoint(name = "UserNameWSTrustBinding_IWSTrust13Async")
    public IWSTrust13Async getUserNameWSTrustBindingIWSTrust13Async() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "UserNameWSTrustBinding_IWSTrust13Async"), IWSTrust13Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrust13Async
     */
    @WebEndpoint(name = "UserNameWSTrustBinding_IWSTrust13Async")
    public IWSTrust13Async getUserNameWSTrustBindingIWSTrust13Async(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "UserNameWSTrustBinding_IWSTrust13Async"), IWSTrust13Async.class, features);
    }

    /**
     * 
     * @return
     *     returns IWSTrust13Async
     */
    @WebEndpoint(name = "IssuedTokenWSTrustBinding_IWSTrust13Async")
    public IWSTrust13Async getIssuedTokenWSTrustBindingIWSTrust13Async() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "IssuedTokenWSTrustBinding_IWSTrust13Async"), IWSTrust13Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrust13Async
     */
    @WebEndpoint(name = "IssuedTokenWSTrustBinding_IWSTrust13Async")
    public IWSTrust13Async getIssuedTokenWSTrustBindingIWSTrust13Async(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "IssuedTokenWSTrustBinding_IWSTrust13Async"), IWSTrust13Async.class, features);
    }

    /**
     * 
     * @return
     *     returns IWSTrust13Async
     */
    @WebEndpoint(name = "IssuedTokenWSTrustBinding_IWSTrust13Async1")
    public IWSTrust13Async getIssuedTokenWSTrustBindingIWSTrust13Async1() {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "IssuedTokenWSTrustBinding_IWSTrust13Async1"), IWSTrust13Async.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSTrust13Async
     */
    @WebEndpoint(name = "IssuedTokenWSTrustBinding_IWSTrust13Async1")
    public IWSTrust13Async getIssuedTokenWSTrustBindingIWSTrust13Async1(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "IssuedTokenWSTrustBinding_IWSTrust13Async1"), IWSTrust13Async.class, features);
    }

}
