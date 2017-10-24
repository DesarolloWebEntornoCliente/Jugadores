package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import es.altair.bean.Equipo;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory;
        
        StandardServiceRegistry str = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        
        Metadata mt = new MetadataSources(str).getMetadataBuilder().build();
        
        sessionFactory = mt.getSessionFactoryBuilder().build();
        
        Session sesion = sessionFactory.openSession();
        
        Equipo e = new Equipo("Vasco da Gama","Rio de Janeiro",123);
        
        sesion.beginTransaction();
        
        sesion.save(e);
        
        sesion.getTransaction().commit();
        
        sesion.close();
        
        sessionFactory.close();
    }
}
