/**
 * Copyright (c) 2015 Drishti-Soft Solutions Pvt. Ltd.
 *
 * @author: abhayk
 * Date:  Jul 3, 2015
 */
package com.upwork.test;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.upwork.test.WsseSecurity.Assertion;

/**
 *
 */
public class MainSolexEdited {
	private static final Logger logger = Logger.getLogger(MainSolexEdited.class.getName());

	public static void main(String[] args) {

		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

		requestToIWSTrust();
		//		requestToIVR();
	}

	private static void requestToIWSTrust() {
		URL url = null;
		try {
			//			url = new URL("file:///D:/Projects/Repositories/j2ee/upwork-jax-ws-client-new/src/main/resources/mex/mex.xml");
			url = new URL("file:///Users/daniyar/repos/j2ee/upwork-jax-ws-client-new/src/main/resources/mex/mex.xml");
			//url = new URL("http://localhost:8080/localhost?WSDL");
			//			url = new URL("http://localhost:8081/IVR?WSDL");
			//sample location path can be file:///home/abc/IVRUserManagementServiceImplPort.wsdl
		} catch (MalformedURLException e) {
			logger.severe("Unable to create URL for for passed wsdl Location");
			logger.severe(e.getMessage());
		}

		QName qname = new QName("http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice", "SecurityTokenService");
		SecurityTokenService stService = new SecurityTokenService(url, qname);
		IWSTrust13Async trust13Async = stService.getUserNameWSTrustBindingIWSTrust13Async();
		RequestSecurityTokenType requestToken = new RequestSecurityTokenType(); 

		ActionTypeHeader actionHeader = new ActionTypeHeader();
		actionHeader.setMustUnderstand("1");
		actionHeader.setAction("http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Issue");
		MessageIdHeader midHeader = new MessageIdHeader("urn:uuid:e01d8a0e-f169-4cb8-9587-c964de542a30");
		ReplyToHeader replyTo = new ReplyToHeader();
		replyTo.setAddress("http://www.w3.org/2005/08/addressing/anonymous");
		VsDebuggerCausalityData vsDebugger = new VsDebuggerCausalityData("uIDPox7qbcwXb+NFkG8FI4LiN7QAAAAApgNa0rNL+Eu9x08ZJr+6IxzYsy9hRWFEtxa4wjA7dqYACQAA");
		ToHeader toHeader = new ToHeader();
		toHeader.setMustUnderstand("1");
		toHeader.setText("https://adfs.preprod.nes/adfs/services/trust/13/UsernameMixed");
		SecurityHeader security = new SecurityHeader();
		UsernameTokenHeader usernameToken = new UsernameTokenHeader();
		usernameToken.setId("uuid-43e22322-edd1-44a9-9228-4d173daf5875-1");
		usernameToken.setUsername("preproduser1");
		usernameToken.setPassword("Password1");
		security.setMustUnderstand("1");
		security.setUsernameToken(usernameToken);

		try {
			Document document = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder()
					.newDocument();
			Element appliesTo = document
					.createElementNS("http://schemas.xmlsoap.org/ws/2004/09/policy", "AppliesTo");

			Element endpoint = document.createElementNS("http://www.w3.org/2005/08/addressing", "EndpointReference");
			Element address = document.createElementNS("http://www.w3.org/2005/08/addressing", "Address");
			address.setTextContent("https://ivr.taqat.sa");

			endpoint.appendChild(address);
			appliesTo.appendChild(endpoint);

			requestToken.getAny().add(appliesTo);

			Element keyType = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder()
					.newDocument()
					.createElementNS("http://docs.oasis-open.org/ws-sx/ws-trust/200512", "KeyType");
			keyType.setTextContent("http://docs.oasis-open.org/ws-sx/ws-trust/200512/Bearer");
			requestToken.getAny().add(keyType);

			Element requestType = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder()
					.newDocument()
					.createElementNS("http://docs.oasis-open.org/ws-sx/ws-trust/200512", "RequestType");
			requestType.setTextContent("http://docs.oasis-open.org/ws-sx/ws-trust/200512/Issue");
			requestToken.getAny().add(requestType);

			Element tokenType = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder()
					.newDocument()
					.createElementNS("http://docs.oasis-open.org/ws-sx/ws-trust/200512", "TokenType");
			tokenType.setTextContent("urn:oasis:names:tc:SAML:2.0:assertion");
			requestToken.getAny().add(tokenType);

		} catch(Exception e) {
			logger.severe(e.getMessage());
		}
		RequestSecurityTokenResponseCollectionType rsp = 
				trust13Async.trust13IssueAsync(actionHeader, midHeader, replyTo, vsDebugger, toHeader, security, requestToken);
		//RequestSecurityTokenResponseCollectionType rsp = trust13Async.trust13IssueAsync(requestToken);
		List<RequestSecurityTokenResponseType> listRsp = rsp.getRequestSecurityTokenResponse();
		String assertionStr = null;
		for(RequestSecurityTokenResponseType rspType : listRsp) {
			try {
				DOMResult res = new DOMResult();
				JAXBContext context = JAXBContext.newInstance(rspType.getClass());
				context.createMarshaller().marshal(rspType, res);
				Document doc = (Document) res.getNode();
				DOMSource domSource = new DOMSource(doc);
				StringWriter writer = new StringWriter();
				StreamResult result = new StreamResult(writer);
				TransformerFactory tf = TransformerFactory.newInstance();
				Transformer transformer = tf.newTransformer();
				transformer.transform(domSource, result);
				int startIndex = writer.toString().indexOf("<Assertion:Assertion");
				int lastIndex = writer.toString().indexOf("</Assertion:Assertion>");
				assertionStr = writer.toString().substring(startIndex, lastIndex + 22);
			} catch(Exception e) {
				logger.severe(e.getMessage());
			}
		}
		if(assertionStr != null) {
			logger.info(assertionStr);
		} else {
			logger.warning("unable find assertion tag!!");
		}
	}

	private static void requestToIVR() {
		URL url = null;
		try {
			url = new URL("http://localhost:8081/IVR?WSDL");

			//sample location path can be file:///home/abc/IVRUserManagementServiceImplPort.wsdl
		} catch (MalformedURLException e) {
			logger.severe("Unable to create URL for for passed wsdl Location");
			logger.severe(e.getMessage());
		}

		QName qname = new QName("http://webservices.nes.accenture.com", "IVRUserManagementService");
		IVRUserManagementService soap = new IVRUserManagementService(url, qname);
		IIVRUserManagementService userManagementService = soap.getIVRUserManagementServiceImplPort();

		WsseSecurity header = new WsseSecurity();
		Assertion assertion = new Assertion();
		assertion.setID("_5547b3cb-e910-48e3-8b6f-9dbc0e56e45c");

		try {
			GregorianCalendar c = new GregorianCalendar();
			XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			assertion.setIssueInstant(date2);
		} catch(Exception e) {
			logger.severe(e.getMessage());
		}

		assertion.setVersion(new BigDecimal("2.0"));
		assertion.setIssuer("http://adfs.preprod.nes/adfs/services/trust");

		header.setAssertion(assertion);

		AuthorizeUserRequestDTO request = new AuthorizeUserRequestDTO();
		request.setEstablishmentID("32434");
		request.setLanguageKey(232L);
		request.setTelephone("2312");
		request.setUniqueID(43333L);

		AuthorizeUserResponseDTO response = 
				userManagementService.authorizeUser(header, request);
		System.out.println(response.toString());
	}

}
