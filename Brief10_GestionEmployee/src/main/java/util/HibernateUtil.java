package util;

import java.util.Properties;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;
import org.hibernate.service.ServiceRegistry;

import entity.Admin;
import entity.Employee;

public class HibernateUtil {
	
	 private static SessionFactory sessionFactory;

	 public static SessionFactory getSessionFactory() {
	  if (sessionFactory == null) {
	   try {
	    Configuration configuration = new Configuration();

	    // Hibernate settings equivalent to hibernate.cfg.xml's properties
	    Properties settings = new Properties();
	    settings.put(Environment.DRIVER, "org.postgresql.Driver");
	    settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/brief10");
	    settings.put(Environment.USER, "postgres");
	    settings.put(Environment.PASS, "18014733");
	    settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
	    settings.put(Environment.SHOW_SQL, "true");
	    settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
	    //settings.put(Environment.HBM2DDL_AUTO, "create-drop");

	    configuration.setProperties(settings);
	    configuration.addAnnotatedClass(Employee.class);
	    configuration.addAnnotatedClass(Admin.class);

	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	      .applySettings(configuration.getProperties()).build();
	    System.out.println("Hibernate Java Config serviceRegistry created");
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    return sessionFactory;

	   } catch (Exception e) {
	    e.printStackTrace();
	   }
	  }
	  return sessionFactory;
	 }

}
