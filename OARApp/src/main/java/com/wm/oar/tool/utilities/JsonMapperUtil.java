package com.wm.oar.tool.utilities;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonMapperUtil {

	public Object mapJsonToObj(String requestJson, Class<? extends Object> classOfRequest) throws Exception {

	       Object requestObject =  null;
	       ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();

	       try{
	           requestObject =   mapper.readValue(requestJson, classOfRequest);
	       } catch (JsonParseException ex) {
	           throw new Exception(ex.getMessage());
	       } catch (JsonMappingException ex) {
	           throw new Exception(ex.getMessage());
	       } catch (IOException ex) {
	           throw new Exception(ex.getMessage());
	       }

	       return requestObject;
 
	}
	
	public String mapObjectToJson(List<? extends Object> requestClass) throws Exception {

	       String outJsonStr =  null;
	       ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();

	       try{
	    	   outJsonStr =   mapper.writeValueAsString(requestClass);
	       } catch (JsonParseException ex) {
	           throw new Exception(ex.getMessage());
	       } catch (JsonMappingException ex) {
	           throw new Exception(ex.getMessage());
	       } catch (IOException ex) {
	           throw new Exception(ex.getMessage());
	       }

	       return outJsonStr;

	}
	
	
	public String mapObjectToJson(Object requestClass) throws Exception {

	       String outJsonStr =  null;
	       ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();

	       try{
	    	   outJsonStr =   mapper.writeValueAsString(requestClass);
	       } catch (JsonParseException ex) {
	           throw new Exception(ex.getMessage());
	       } catch (JsonMappingException ex) {
	           throw new Exception(ex.getMessage());
	       } catch (IOException ex) {
	           throw new Exception(ex.getMessage());
	       }

	       return outJsonStr;

	}

}
