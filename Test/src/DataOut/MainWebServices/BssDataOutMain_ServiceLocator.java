/**
 * BssDataOutMain_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DataOut.MainWebServices;

public class BssDataOutMain_ServiceLocator extends org.apache.axis.client.Service implements DataOut.MainWebServices.BssDataOutMain_Service {

    public BssDataOutMain_ServiceLocator() {
    }


    public BssDataOutMain_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BssDataOutMain_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BssDataOutMainPort
    private java.lang.String BssDataOutMainPort_address = "http://172.25.17.231:8080/DataOutApplication/BssDataOutMain";

    public java.lang.String getBssDataOutMainPortAddress() {
        return BssDataOutMainPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BssDataOutMainPortWSDDServiceName = "BssDataOutMainPort";

    public java.lang.String getBssDataOutMainPortWSDDServiceName() {
        return BssDataOutMainPortWSDDServiceName;
    }

    public void setBssDataOutMainPortWSDDServiceName(java.lang.String name) {
        BssDataOutMainPortWSDDServiceName = name;
    }

    public DataOut.MainWebServices.BssDataOutMain_PortType getBssDataOutMainPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BssDataOutMainPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBssDataOutMainPort(endpoint);
    }

    public DataOut.MainWebServices.BssDataOutMain_PortType getBssDataOutMainPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DataOut.MainWebServices.BssDataOutMainPortBindingStub _stub = new DataOut.MainWebServices.BssDataOutMainPortBindingStub(portAddress, this);
            _stub.setPortName(getBssDataOutMainPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBssDataOutMainPortEndpointAddress(java.lang.String address) {
        BssDataOutMainPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DataOut.MainWebServices.BssDataOutMain_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                DataOut.MainWebServices.BssDataOutMainPortBindingStub _stub = new DataOut.MainWebServices.BssDataOutMainPortBindingStub(new java.net.URL(BssDataOutMainPort_address), this);
                _stub.setPortName(getBssDataOutMainPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BssDataOutMainPort".equals(inputPortName)) {
            return getBssDataOutMainPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://MainWebServices.DataOut/", "BssDataOutMain");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://MainWebServices.DataOut/", "BssDataOutMainPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BssDataOutMainPort".equals(portName)) {
            setBssDataOutMainPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
