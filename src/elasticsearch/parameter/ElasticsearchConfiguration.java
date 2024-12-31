package elasticsearch.parameter;

import org.elasticsearch.client.RestHighLevelClient;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ElasticsearchConfiguration {
	//The configuration parameters for the connection
	public static final String HOST = "localhost";
	public static final int PORT_ONE = 9200;
	public static final int PORT_TWO = 9201;
	public static final String SCHEME = "http";
	 
	public static RestHighLevelClient restHighLevelClient;
	public static ObjectMapper objectMapper = new ObjectMapper();
	 
	public static final String INDEX = "persondata";
	public static final String TYPE = "person";
}
