
package com.oracle.csm.soapjsonproxy.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.csm.soapjsonproxy.client package. 
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

    private final static QName _CallJsonResponse_QNAME = new QName("http://ws.soapjsonproxy.csm.oracle.com/", "callJsonResponse");
    private final static QName _CallJson_QNAME = new QName("http://ws.soapjsonproxy.csm.oracle.com/", "callJson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.csm.soapjsonproxy.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CallJsonResponse }
     * 
     */
    public CallJsonResponse createCallJsonResponse() {
        return new CallJsonResponse();
    }

    /**
     * Create an instance of {@link CallJson }
     * 
     */
    public CallJson createCallJson() {
        return new CallJson();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallJsonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soapjsonproxy.csm.oracle.com/", name = "callJsonResponse")
    public JAXBElement<CallJsonResponse> createCallJsonResponse(CallJsonResponse value) {
        return new JAXBElement<CallJsonResponse>(_CallJsonResponse_QNAME, CallJsonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallJson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soapjsonproxy.csm.oracle.com/", name = "callJson")
    public JAXBElement<CallJson> createCallJson(CallJson value) {
        return new JAXBElement<CallJson>(_CallJson_QNAME, CallJson.class, null, value);
    }

}
