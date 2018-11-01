package integracion;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONException;
import org.json.JSONObject;

import bean.Empleado;


public class PostLiquidacion {

	public PostLiquidacion(Empleado em) throws JSONException {
		JSONObject json = new JSONObject();

		json.accumulate("update", "worked_hours");
		json.accumulate("mount", "Contidad de Horas");
		
		System.out.println(json.toString());


		StringEntity entity;
		try {
			entity = new StringEntity(json.toString());
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost request = new HttpPost("https://sueldosya.herokuapp.com/update/clientCUIT/employeeDNI");
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
