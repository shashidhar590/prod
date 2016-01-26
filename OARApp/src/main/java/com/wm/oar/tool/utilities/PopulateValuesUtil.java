package com.wm.oar.tool.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.wm.oar.tool.domain.API;
import com.wm.oar.tool.domain.Product;


@Component
public class PopulateValuesUtil {
	
public List<Product> populateStaticValues(){
		
		List<Product> productList = new ArrayList<Product>();
		
		Product tempProduct = new Product();
		
		List<API> apiList = new ArrayList<API>();
		
		/*API api0 = new API();
		api0.setApiName("--Select API--");
		
		apiList.add(0, api0);*/
		
		API api1 = new API();
		Map<String,String> orderLocatorHeaders = new HashMap<String,String>();
		orderLocatorHeaders.put("WM_SVC.VERSION","2.0.0");
		orderLocatorHeaders.put("WM_SVC.ENV","prod");
		orderLocatorHeaders.put("WM_SVC.NAME","order-service");
		orderLocatorHeaders.put("WM_QOS.CORRELATION_ID","21343245344523452345");
		orderLocatorHeaders.put("content-type","application/json");
		
		
		api1.setApiName("orderLocator");
		api1.setTemplateJSON("{'payload':{'order':{'orderNo':'5641591723052','purchaseOrders':[{'purchaseOrderNo':'1573150403663','purchaseOrderShipments':[{'actualShipmentDate':'2015-10-30T14:00:00-07:00','packageASN':'0','trackingNo':'123456789123','carrierServiceCode':'79','purchaseOrderShipmentLines':[{'quantity':{'unitOfMeasure':'EA','measurementValue':1},'poLineId':'1'}]}]}]}}}"); 
		api1.setUrl("http://ultra-esb.prod-order.esb.platform.glb.prod.walmart.com/service/order-service/v2/orderlocator/{order_no}");
		api1.setHeaders(orderLocatorHeaders);
		apiList.add(api1);
		
		/*API api2 = new API();
		Map<String,String> orderLocatorHeaders2 = new HashMap<String,String>();
		orderLocatorHeaders2.put("WM_SVC.VERSION","2.0.0");
		orderLocatorHeaders2.put("WM_SVC.ENV","prod");
		orderLocatorHeaders2.put("WM_SVC.NAME","order-service");
		orderLocatorHeaders2.put("WM_QOS.CORRELATION_ID","21343245344523452345");
		orderLocatorHeaders2.put("content-type","application/json");
		
		
		api2.setApiName("orderLookup");
		api2.setTemplateJSON("{'payload':{'order':{'orderNo':'5641591723052','purchaseOrders':[{'purchaseOrderNo':'1573150403663','purchaseOrderShipments':[{'actualShipmentDate':'2015-10-30T14:00:00-07:00','packageASN':'0','trackingNo':'123456789123','carrierServiceCode':'79','purchaseOrderShipmentLines':[{'quantity':{'unitOfMeasure':'EA','measurementValue':1},'poLineId':'1'}]}]}]}}}"); 
		api2.setUrl("http://ultra-esb.prod-order.esb.platform.glb.prod.walmart.com/service/order-service/v2/orderlookup/{order_no}");
		api2.setHeaders(orderLocatorHeaders2);
		apiList.add(api2);*/
		
		tempProduct.setApiList(apiList);
		
		tempProduct.setProductName("OS");
		tempProduct.setCreatedBy("Shashi");
		tempProduct.setCreatedTs("2016-01-15");
		tempProduct.setProductOwner("Shashi");
		tempProduct.setProductDescription("Order Service");
		tempProduct.setProductDL("product DL.. ");
		
		productList.add(tempProduct);
		
		//Second product obj
		
		Product tempProduct2 = new Product();
		
		List<API> tempProduct2apiList = new ArrayList<API>();
		
		/*API tempProduct2api0 = new API();
		tempProduct2api0.setApiName("--Select API--");
		
		apiList.add(0, tempProduct2api0);*/
		
		API tempProduct2api1 = new API();
		Map<String,String> tempProduct2orderLocatorHeaders = new HashMap<String,String>();
		tempProduct2orderLocatorHeaders.put("WM_SVC.VERSION","2.0.0");
		tempProduct2orderLocatorHeaders.put("WM_SVC.ENV","prod");
		tempProduct2orderLocatorHeaders.put("WM_SVC.NAME","rms-service");
		tempProduct2orderLocatorHeaders.put("WM_QOS.CORRELATION_ID","21343245344523452345");
		tempProduct2orderLocatorHeaders.put("content-type","application/json");
		
		
		tempProduct2api1.setApiName("rms-api1");
		tempProduct2api1.setTemplateJSON("{'payload':{'RMS':{'rmsNo':'5641591723052','purchaseOrders':[{'purchaseOrderNo':'1573150403663','purchaseOrderShipments':[{'actualShipmentDate':'2015-10-30T14:00:00-07:00','packageASN':'0','trackingNo':'123456789123','carrierServiceCode':'79','purchaseOrderShipmentLines':[{'quantity':{'unitOfMeasure':'EA','measurementValue':1},'poLineId':'1'}]}]}]}}}"); 
		tempProduct2api1.setUrl("http://ultra-esb.prod-rms.esb.platform.glb.prod.walmart.com/service/rms-service/v2/{order_no}/orderUpdate");
		tempProduct2api1.setHeaders(tempProduct2orderLocatorHeaders);
		tempProduct2apiList.add(tempProduct2api1);
		
		API tempProduct2api2 = new API();
		
		Map<String,String> tempProduct2orderLocatorHeaders2 = new HashMap<String,String>();
		tempProduct2orderLocatorHeaders2.put("WM_SVC.VERSION","2.0.0");
		tempProduct2orderLocatorHeaders2.put("WM_SVC.ENV","prod");
		tempProduct2orderLocatorHeaders2.put("WM_SVC.NAME","rms-service");
		tempProduct2orderLocatorHeaders2.put("WM_QOS.CORRELATION_ID","21343245344523452345");
		tempProduct2orderLocatorHeaders2.put("content-type","application/json");
		
		
		tempProduct2api2.setApiName("rms-api2");
		tempProduct2api2.setTemplateJSON("{'payload':{'RMS':{'rmsNo':'5641591723052','purchaseOrders':[{'purchaseOrderNo':'1573150403663','purchaseOrderShipments':[{'actualShipmentDate':'2015-10-30T14:00:00-07:00','packageASN':'0','trackingNo':'123456789123','carrierServiceCode':'79','purchaseOrderShipmentLines':[{'quantity':{'unitOfMeasure':'EA','measurementValue':1},'poLineId':'1'}]}]}]}}}"); 
		tempProduct2api2.setUrl("http://ultra-esb.prod-rms.esb.platform.glb.prod.walmart.com/service/rms-service/v2/{order_no}/orderUpdate");
		tempProduct2api2.setHeaders(tempProduct2orderLocatorHeaders2);
		tempProduct2apiList.add(tempProduct2api2);
		
		tempProduct2.setApiList(tempProduct2apiList);
		
		tempProduct2.setProductName("RMS");
		tempProduct2.setCreatedBy("RMS team");
		tempProduct2.setCreatedTs("2016-01-16");
		tempProduct2.setProductOwner("Not me");
		tempProduct2.setProductDescription("RMS Service");
		tempProduct2.setProductDL("RMS DL.. ");

		productList.add(tempProduct2);
		
		return productList;
	}

}
