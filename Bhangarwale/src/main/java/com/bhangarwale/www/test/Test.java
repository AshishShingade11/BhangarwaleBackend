package com.bhangarwale.www.test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.influxdb.annotations.Column;
import com.influxdb.annotations.Measurement;
import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.InfluxDBClientFactory;
import com.influxdb.client.WriteApiBlocking;
import com.influxdb.client.domain.WritePrecision;
import com.influxdb.client.write.Point;
import com.influxdb.query.FluxRecord;
import com.influxdb.query.FluxTable;

public class Test {

	public static void main(String[] args) {

//		List<Integer> list=Arrays.asList(12,34,12,56,87,34);
//		Set<Integer> list1=new HashSet();
//		list.stream().filter(x -> !list1.add(x)).forEach(x-> System.out.println(x));
//		
		
		
		
	    // You can generate an API token from the "API Tokens Tab" in the UI
	    String token = "PmnCy_w0E01SRaoX1dqFCMlwoPF4WZNYN62CBUmIOfVsM3aAQ8IC8DnsQWf529iU8fbZndb1U6d82rn0v2eNcw==";
	    String bucket = "tempdata";
	    String org = "Bhangarwale";

	    InfluxDBClient client = InfluxDBClientFactory.create("http://localhost:8086", token.toCharArray());
	    
	    
	    String data = "mem,host=host1 used_percent=23.43234543";

	    WriteApiBlocking writeApi = client.getWriteApiBlocking();
	    writeApi.writeRecord(bucket, org, WritePrecision.NS, data);


		
	    Point point = Point
	    		  .measurement("mem")
	    		  .addTag("host", "host1")
	    		  .addField("used_percent", 23.43234543)
	    		  .time(Instant.now(), WritePrecision.NS);

	    		WriteApiBlocking writeApiBlocking = client.getWriteApiBlocking();
	    		writeApiBlocking.writePoint(bucket, org, point);
	    		
	    		
	    		
	    		String query = "from(bucket: \"tempdata\") |> range(start: -1h)";
	    		List<FluxTable> tables = client.getQueryApi().query(query, org);

	    		for (FluxTable table : tables) {
	    		  for (FluxRecord record : table.getRecords()) {
	    		    System.out.println(record);
	    		  }
	    		}
	    		
	    		client.close();
	    		

		
		
		
	}
	

}

