package hbt;

import bean.Servicio;
import srv.ServicioSrv;

public class testHibernate {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();

		Servicio s1 = new Servicio("Mensual", 250, (float) 0.02);
		Servicio s2 = new Servicio("Eventual", 200, (float) 0.02);
		Servicio s3 = new Servicio("Semanal", 100, (float) 0.02);
		ServicioSrv.grabarServicio(s1);
		ServicioSrv.grabarServicio(s2);
		ServicioSrv.grabarServicio(s3);

	}

}
