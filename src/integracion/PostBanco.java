package integracion;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONException;
import org.json.JSONObject;

	public class PostBanco {
	
		private static String CBU = "1122334455667788990022";

//	public static void main(String[] args) {
//		PostBanco.postearPagoBanco("Hola", 10.5, "");
//	}

			public static void postearPagoBanco(String CBUCliente, double montoFactura, String fecha){
			
				
				JSONObject json = new JSONObject();
			
				json.accumulate("CBU", CBU);
				json.accumulate("CBUCliente", CBUCliente);		
				json.accumulate("MontoFacturado", montoFactura);
				json.accumulate("FechaFacturado", fecha);
				json.accumulate("DetalleFactura", "Honorarios");

		
				System.out.println(json.toString());
		
		
				StringEntity entity;
				try {
					entity = new StringEntity(json.toString(), "UTF-8");
					HttpClient httpClient = HttpClientBuilder.create().build();
					HttpPost request = new HttpPost("192.168.215.34:8080/api/transferencia");
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
