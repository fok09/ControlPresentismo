package integracion;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

import dto.EmpleadoHorasDTO;

//import bean.Empleado;


public class PostLiquidacion {
		
	public static void postLiquidacionSueldos(EmpleadoHorasDTO empleado) {
		JSONObject json = new JSONObject();

		if (empleado.getTipo().equals("mensual") == true){
			
			json.accumulate("update", "absense_days");
			json.accumulate("mount", empleado.getHorasAusentes()/8);
			
		}else if (empleado.getTipo().equals("hora") == true) {
			json.accumulate("update", "worked_hours");
			json.accumulate("mount", empleado.getHorasTrabajadas());
		}
		
		
		System.out.println(json.toString());


		StringEntity entity;
		try {
			entity = new StringEntity(json.toString());
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost request = new HttpPost("https://sueldosya.herokuapp.com/update/" + empleado.getCuitEmpresa() +"/" + empleado.getDni());
			request.setHeader("Accept", "application/json");
			request.setHeader("Content-type", "application/json");
			request.setEntity(entity);

			HttpResponse response = httpClient.execute(request);
			System.out.println(response.getStatusLine().getStatusCode());
			if(response.getStatusLine().getStatusCode() != 201) {
				System.out.println(response.getStatusLine().getStatusCode());
				
			}
		} catch (IOException e) {
			
		}
	}
	
	public static void postGym(EmpleadoHorasDTO empleado) {
		JSONObject json = new JSONObject();
		
		json.accumulate("update", "worked_hours");
		json.accumulate("mount", empleado.getHorasTrabajadas());
					
		System.out.println(json.toString());

		StringEntity entity;
		try {
			entity = new StringEntity(json.toString());
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost request = new HttpPost("https://sueldosya.herokuapp.com/update/" + empleado.getCuitEmpresa() +"/" + empleado.getDni());
			request.setHeader("Accept", "application/json");
			request.setHeader("Content-type", "application/json");
			request.setEntity(entity);

			HttpResponse response = httpClient.execute(request);
			System.out.println(response.getStatusLine().getStatusCode());
			if(response.getStatusLine().getStatusCode() != 201) {
				System.out.println(response.getStatusLine().getStatusCode());
				
			}
		} catch (IOException e) {
			
		}
	}
}
