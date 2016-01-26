package com.wm.oar.tool.test;

import java.util.List;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wm.oar.tool.domain.Product;
import com.wm.oar.tool.utilities.PopulateValuesUtil;




public class TestJavaToJsonConversion {

	static ObjectMapper mapper = new ObjectMapper();
	public static void main(String[] args) {
		System.out.println("Testing conversion");
		pojoToJson();
	//	jsonToPojo();
	}
	
	
	public static void pojoToJson(){
		try{
			PopulateValuesUtil populateValue = new PopulateValuesUtil();
			
			
			List<Product> tempProduct = populateValue.populateStaticValues();
			//Object to JSON in String
			String jsonInString = mapper.writeValueAsString(tempProduct);
			
			System.out.println(jsonInString);
			
			}catch(JsonMappingException jme){
				jme.printStackTrace();
			}catch(Exception ex){
				ex.printStackTrace();
			}
	}
	
	public static void jsonToPojo(){
		String jsonInString = "{\"userId\":\"dhanu\",\"systemTime\":\"2016/01/16 10:05:42\",\"createdBy\":\"Shashi\",\"updatedBy\":\"dhanu\",\"createdTs\":\"2016-01-15\",\"updatedTs\":\"2016-01-15\",\"productName\":\"Oh Yes\",\"apiList\":[{\"userId\":\"apiUserid\",\"systemTime\":\"2016/01/16 10:05:42\",\"createdBy\":\"Shashi\",\"updatedBy\":\"Shashi\",\"createdTs\":\"2016-12-12\",\"updatedTs\":\"\",\"apiName\":\"orderLocator\",\"templateJSON\":\"Payload:{JSON goes here...}\",\"headers\":{\"WM_SVC.ENV\":\"prod\",\"WM_SVC.VERSION\":\"2.0.0\",\"content-type\":\"application/json\",\"WM_QOS.CORRELATION_ID\":\"21343245344523452345\",\"WM_SVC.NAME\":\"order-service\"},\"url\":\"http://ultra-esb.prod-order.esb.platform.glb.prod.walmart.com/service/order-service/v2/orderlocator/{order_no}\"},{\"userId\":\"apilist2userid\",\"systemTime\":\"2016/01/16 10:05:42\",\"createdBy\":null,\"updatedBy\":\"\",\"createdTs\":null,\"updatedTs\":\"\",\"apiName\":\"orderLookup\",\"templateJSON\":\"Payload:{JSON goes here...}\",\"headers\":{\"WM_SVC.ENV\":\"prod\",\"WM_SVC.VERSION\":\"2.0.0\",\"content-type\":\"application/json\",\"WM_QOS.CORRELATION_ID\":\"21343245344523452345\",\"WM_SVC.NAME\":\"order-service\"},\"url\":\"http://ultra-esb.prod-order.esb.platform.glb.prod.walmart.com/service/order-service/v2/orderlookup/{order_no}\"}],\"productOwner\":\"Shashi\",\"productDL\":\"product DL.. \",\"productDescription\":\"Order Service\"}";
		try{
			
		Product productObj = mapper.readValue(jsonInString, Product.class);
		System.out.println(productObj);
		
		}
		catch(JsonMappingException jme){
			jme.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
