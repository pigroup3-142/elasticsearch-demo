package demo;

import java.io.IOException;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import com.fasterxml.jackson.databind.ObjectMapper;

import models.Product;

public class ElasticsearchDemo {
	//The configuration parameters for the connection
	public static final String HOST = "localhost";
	public static final int PORT_ONE = 9200;
	public static final int PORT_TWO = 9201;
	public static final String SCHEME = "http";
	 
	public static RestHighLevelClient restHighLevelClient;
	public static ObjectMapper objectMapper = new ObjectMapper();
	 
	public static final String INDEX = "persondata";
	public static final String TYPE = "person";
	
	public static synchronized RestHighLevelClient makeConnection() {
		if(restHighLevelClient == null) {
			restHighLevelClient = new RestHighLevelClient(
	                RestClient.builder(
	                        new HttpHost(HOST, PORT_ONE, SCHEME),
	                        new HttpHost(HOST, PORT_TWO, SCHEME)));
		}
		
		return restHighLevelClient;
	}
	
	public static synchronized void closeConnection() throws IOException {
	    restHighLevelClient.close();
	    restHighLevelClient = null;
	}
	
	
	public static void main(String[] args) {
		
	}
}
