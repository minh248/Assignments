package com.vti.backend.repository;

import com.vti.entity.Group;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.sql.SQLOutput;
import java.util.List;

public class DepartmentRepository {
    // nên dùng biến static ??
    private SessionFactory sessionFactory;

    public DepartmentRepository() {
        sessionFactory = buidSessionFactory();
    }

    private static SessionFactory buidSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Group.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        return configuration.buildSessionFactory(serviceRegistry);
    }

    public List<Group> getAllGroups(){
        Session session = null;

        try {
            session = sessionFactory.openSession();
            Query<Group> query = session.createQuery("FROM Group");

            return query.list();
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    public void createGroup(Group group){
        Session session = null;

        try {
            session = sessionFactory.openSession();

            session.beginTransaction();

            session.save(group);
            session.getTransaction().commit();
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    public Group getGroupByName(String groupName){
        Session session = null;
        try {
            session = sessionFactory.openSession();

            Query<Group> query = session.createQuery("FROM Group WHERE name = :groupName");
            query.setParameter("groupName", groupName);

            return query.uniqueResult();
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    public void deleteGroupById(int id){
        Session session = null;

        try {
            session = sessionFactory.openSession();

            session.beginTransaction();

            Group group = (Group) session.load(Group.class, id);
            session.delete(group);

            session.getTransaction().commit();
        } finally {
            if (session != null){
                session.close();
            }
        }
    }
}
