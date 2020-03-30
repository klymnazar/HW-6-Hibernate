package com.HW6;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory;
    }

    public void close() {
        sessionFactory.close();
    }


}
