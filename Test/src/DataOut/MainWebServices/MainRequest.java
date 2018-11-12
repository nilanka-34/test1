/**
 * MainRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DataOut.MainWebServices;

public class MainRequest  implements java.io.Serializable {
    private java.lang.String connectingDb;

    private java.lang.String eventSource;

    private java.lang.String userId;

    public MainRequest() {
    }

    public MainRequest(
           java.lang.String connectingDb,
           java.lang.String eventSource,
           java.lang.String userId) {
           this.connectingDb = connectingDb;
           this.eventSource = eventSource;
           this.userId = userId;
    }


    /**
     * Gets the connectingDb value for this MainRequest.
     * 
     * @return connectingDb
     */
    public java.lang.String getConnectingDb() {
        return connectingDb;
    }


    /**
     * Sets the connectingDb value for this MainRequest.
     * 
     * @param connectingDb
     */
    public void setConnectingDb(java.lang.String connectingDb) {
        this.connectingDb = connectingDb;
    }


    /**
     * Gets the eventSource value for this MainRequest.
     * 
     * @return eventSource
     */
    public java.lang.String getEventSource() {
        return eventSource;
    }


    /**
     * Sets the eventSource value for this MainRequest.
     * 
     * @param eventSource
     */
    public void setEventSource(java.lang.String eventSource) {
        this.eventSource = eventSource;
    }


    /**
     * Gets the userId value for this MainRequest.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this MainRequest.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MainRequest)) return false;
        MainRequest other = (MainRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.connectingDb==null && other.getConnectingDb()==null) || 
             (this.connectingDb!=null &&
              this.connectingDb.equals(other.getConnectingDb()))) &&
            ((this.eventSource==null && other.getEventSource()==null) || 
             (this.eventSource!=null &&
              this.eventSource.equals(other.getEventSource()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getConnectingDb() != null) {
            _hashCode += getConnectingDb().hashCode();
        }
        if (getEventSource() != null) {
            _hashCode += getEventSource().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MainRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MainWebServices.DataOut/", "mainRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectingDb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectingDb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
