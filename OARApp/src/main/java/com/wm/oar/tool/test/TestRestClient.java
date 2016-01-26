package com.wm.oar.tool.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestRestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			  try {

				URL url = new URL("http://ultra-esb.prod-order.esb.platform.glb.prod.walmart.com/service/order-service/v2/orderlocator/5941503045217");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");
				conn.setRequestProperty("WM_SVC.VERSION", "2.0.0");
				conn.setRequestProperty("WM_SVC.WM_SVC.ENV", "prod");
				conn.setRequestProperty("WM_SVC.NAME", "order-service");
				conn.setRequestProperty("WM_CONSUMER.ID", "710dabdc-bedd-40b1-bead-4c513ee129f2");
				conn.setRequestProperty("WM_QOS.CORRELATION_ID", "21343245344523452345");
				conn.setRequestProperty("content-type", "application/json");
				
				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}

				BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

				String output;
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				}

				conn.disconnect();

			  } catch (MalformedURLException e) {

				e.printStackTrace();

			  } catch (IOException ioe) {

				ioe.printStackTrace();

			  }
			  catch (Exception e) {

					e.printStackTrace();

				  }

			}

	}

