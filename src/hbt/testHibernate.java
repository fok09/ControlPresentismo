package hbt;

import bean.Servicio;
import srv.ServicioSrv;

public class testHibernate {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();
<<<<<<< HEAD
		
		Servicio s1 = new Servicio ("Mensual",250, (float) 0.02);
		Servicio s2 = new Servicio ("Eventual",200, (float) 0.02);
		Servicio s3 = new Servicio ("Semanal",100, (float) 0.02);
=======

		Servicio s1 = new Servicio("Mensual", 250, (float) 0.02);
		Servicio s2 = new Servicio("Eventual", 200, (float) 0.02);
		Servicio s3 = new Servicio("Semanal", 100, (float) 0.02);
>>>>>>> refs/remotes/origin/master
		ServicioSrv.grabarServicio(s1);
		ServicioSrv.grabarServicio(s2);
<<<<<<< HEAD
		ServicioSrv.grabarServicio(s3);
=======
		ServicioSrv.grabarServicio(s3);
>>>>>>> refs/remotes/origin/master

	}
	
}
