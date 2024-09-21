package com.procesamiento.procesamiento_json;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;

import clases.Employee;

@SpringBootApplication
public class ProcesamientoJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcesamientoJsonApplication.class, args);

		
		String json = "[\n"
				+ "  {\n"
				+ "      \"firstName\": \"Lokesh\",\n"
				+ "      \"lastName\": \"Gupta\",\n"
				+ "      \"website\": \"howtodoinjava.com\"\n"
				+ "    },\n"
				+ "  {\n"
				+ "      \"firstName\": \"Brian\",\n"
				+ "      \"lastName\": \"Schultz\",\n"
				+ "      \"website\": \"example.com\"\n"
				+ "  }\n"
				+ "]";
		
		
		System.out.println(json);
		
		Gson gson = new Gson();
		
		Employee[] employees = gson.fromJson(json, Employee[].class);	
		
		for (Employee employee : employees) {
			
			System.out.println(employee.toString());
		}
		
		
		
		
		
		
		
	}

}
