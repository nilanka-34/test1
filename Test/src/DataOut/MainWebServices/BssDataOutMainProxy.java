package DataOut.MainWebServices;

public class BssDataOutMainProxy implements DataOut.MainWebServices.BssDataOutMain_PortType {
  private String _endpoint = null;
  private DataOut.MainWebServices.BssDataOutMain_PortType bssDataOutMain_PortType = null;
  
  public BssDataOutMainProxy() {
    _initBssDataOutMainProxy();
  }
  
  public BssDataOutMainProxy(String endpoint) {
    _endpoint = endpoint;
    _initBssDataOutMainProxy();
  }
  
  private void _initBssDataOutMainProxy() {
    try {
      bssDataOutMain_PortType = (new DataOut.MainWebServices.BssDataOutMain_ServiceLocator()).getBssDataOutMainPort();
      if (bssDataOutMain_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bssDataOutMain_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bssDataOutMain_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bssDataOutMain_PortType != null)
      ((javax.xml.rpc.Stub)bssDataOutMain_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DataOut.MainWebServices.BssDataOutMain_PortType getBssDataOutMain_PortType() {
    if (bssDataOutMain_PortType == null)
      _initBssDataOutMainProxy();
    return bssDataOutMain_PortType;
  }
  
  public DataOut.MainWebServices.MainResponse getBssData(DataOut.MainWebServices.MainRequest inputMainRequest) throws java.rmi.RemoteException{
    if (bssDataOutMain_PortType == null)
      _initBssDataOutMainProxy();
    return bssDataOutMain_PortType.getBssData(inputMainRequest);
  }
  
  
}