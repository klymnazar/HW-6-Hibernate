package com.HW6;

import com.HW6.entity.School;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        System.out.println("Maven + Hibernate + MySQL");

        HibernateConfig hibernateConfig = new HibernateConfig();

        Session session = hibernateConfig.getSessionFactory().openSession();
        session.beginTransaction();
        School school = new School();

        school.setSchoolName("Lviv 1");
        school.setSchoolName("Lviv 2");
        school.setSchoolName("Lviv 3");

        System.out.println(school.getSchoolId());
        System.out.println(school.getSchoolName());

        session.save(school);
        session.getTransaction().commit();

        hibernateConfig.close();

    }
}
