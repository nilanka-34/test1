/**
 * MainResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DataOut.MainWebServices;

public class MainResponse  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String errorDescription;

    private java.lang.String errorMessage;

    private java.lang.String eventSource;

    private java.lang.Boolean isSuccess;

    private java.lang.String mobileNumber;

    private java.lang.String nicAccountLevel;

    private java.lang.String nicCustomerLevel;

    private java.lang.String eMailAddress;

    public MainResponse() {
    }

    public MainResponse(
           java.lang.String accountNumber,
           java.lang.String errorDescription,
           java.lang.String errorMessage,
           java.lang.String eventSource,
           java.lang.Boolean isSuccess,
           java.lang.String mobileNumber,
           java.lang.String nicAccountLevel,
           java.lang.String nicCustomerLevel,
           java.lang.String eMailAddress) {
           this.accountNumber = accountNumber;
           this.errorDescription = errorDescription;
           this.errorMessage = errorMessage;
           this.eventSource = eventSource;
           this.isSuccess = isSuccess;
           this.mobileNumber = mobileNumber;
           this.nicAccountLevel = nicAccountLevel;
           this.nicCustomerLevel = nicCustomerLevel;
           this.eMailAddress = eMailAddress;
    }


    /**
     * Gets the accountNumber value for this MainResponse.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this MainResponse.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the errorDescription value for this MainResponse.
     * 
     * @return errorDescription
     */
    public java.lang.String getErrorDescription() {
        return errorDescription;
    }


    /**
     * Sets the errorDescription value for this MainResponse.
     * 
     * @param errorDescription
     */
    public void setErrorDescription(java.lang.String errorDescription) {
        this.errorDescription = errorDescription;
    }


    /**
     * Gets the errorMessage value for this MainResponse.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this MainResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the eventSource value for this MainResponse.
     * 
     * @return eventSource
     */
    public java.lang.String getEventSource() {
        return eventSource;
    }


    /**
     * Sets the eventSource value for this MainResponse.
     * 
     * @param eventSource
     */
    public void setEventSource(java.lang.String eventSource) {
        this.eventSource = eventSource;
    }


    /**
     * Gets the isSuccess value for this MainResponse.
     * 
     * @return isSuccess
     */
    public java.lang.Boolean getIsSuccess() {
        return isSuccess;
    }


    /**
     * Sets the isSuccess value for this MainResponse.
     * 
     * @param isSuccess
     */
    public void setIsSuccess(java.lang.Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }


    /**
     * Gets the mobileNumber value for this MainResponse.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this MainResponse.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the nicAccountLevel value for this MainResponse.
     * 
     * @return nicAccountLevel
     */
    public java.lang.String getNicAccountLevel() {
        return nicAccountLevel;
    }


    /**
     * Sets the nicAccountLevel value for this MainResponse.
     * 
     * @param nicAccountLevel
     */
    public void setNicAccountLevel(java.lang.String nicAccountLevel) {
        this.nicAccountLevel = nicAccountLevel;
    }


    /**
     * Gets the nicCustomerLevel value for this MainResponse.
     * 
     * @return nicCustomerLevel
     */
    public java.lang.String getNicCustomerLevel() {
        return nicCustomerLevel;
    }


    /**
     * Sets the nicCustomerLevel value for this MainResponse.
     * 
     * @param nicCustomerLevel
     */
    public void setNicCustomerLevel(java.lang.String nicCustomerLevel) {
        this.nicCustomerLevel = nicCustomerLevel;
    }


    /**
     * Gets the eMailAddress value for this MainResponse.
     * 
     * @return eMailAddress
     */
    public java.lang.String getEMailAddress() {
        return eMailAddress;
    }


    /**
     * Sets the eMailAddress value for this MainResponse.
     * 
     * @param eMailAddress
     */
    public void setEMailAddress(java.lang.String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MainResponse)) return false;
        MainResponse other = (MainResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.errorDescription==null && other.getErrorDescription()==null) || 
             (this.errorDescription!=null &&
              this.errorDescription.equals(other.getErrorDescription()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.eventSource==null && other.getEventSource()==null) || 
             (this.eventSource!=null &&
              this.eventSource.equals(other.getEventSource()))) &&
            ((this.isSuccess==null && other.getIsSuccess()==null) || 
             (this.isSuccess!=null &&
              this.isSuccess.equals(other.getIsSuccess()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.nicAccountLevel==null && other.getNicAccountLevel()==null) || 
             (this.nicAccountLevel!=null &&
              this.nicAccountLevel.equals(other.getNicAccountLevel()))) &&
            ((this.nicCustomerLevel==null && other.getNicCustomerLevel()==null) || 
             (this.nicCustomerLevel!=null &&
              this.nicCustomerLevel.equals(other.getNicCustomerLevel()))) &&
            ((this.eMailAddress==null && other.getEMailAddress()==null) || 
             (this.eMailAddress!=null &&
              this.eMailAddress.equals(other.getEMailAddress())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getErrorDescription() != null) {
            _hashCode += getErrorDescription().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getEventSource() != null) {
            _hashCode += getEventSource().hashCode();
        }
        if (getIsSuccess() != null) {
            _hashCode += getIsSuccess().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getNicAccountLevel() != null) {
            _hashCode += getNicAccountLevel().hashCode();
        }
        if (getNicCustomerLevel() != null) {
            _hashCode += getNicCustomerLevel().hashCode();
        }
        if (getEMailAddress() != null) {
            _hashCode += getEMailAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MainResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MainWebServices.DataOut/", "mainResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMessage"));
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
        elemField.setFieldName("isSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isSuccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicAccountLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicAccountLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicCustomerLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicCustomerLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eMailAddress"));
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
