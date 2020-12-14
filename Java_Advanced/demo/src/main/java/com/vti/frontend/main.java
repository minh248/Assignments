package com.vti.frontend;

import com.vti.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class main {
    public static void main(String[] args) {

        // get session
        Session session = null;
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();

            User user = new User();
            user.setUserName("user 1");

            session.save(user);

            System.out.println("Create success!");

            session.getTransaction().commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    private static SessionFactory buildSessionFactory() {
        // load configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        // add entity
        configuration.addAnnotatedClass(User.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        return configuration.buildSessionFactory(serviceRegistry);
    }
}
