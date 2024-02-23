package com.api.template;

import com.api.template.beans.Employee;

import javax.persistence.*;
import javax.sql.DataSource;

import com.api.template.services.TemplateService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Arrays;
import java.util.List;


@Import(TemplateConfiguration.class) // Import the JpaConfig class to use its configuration
public class TestConnection {


    @Autowired
    private EntityManager entityManager;

    @Autowired
    private DataSource dataSource;

    private static void nativeQuery(EntityManagerFactory emf, String s) {
        EntityManager em = emf.createEntityManager();
        System.out.printf("---------------------------%n'%s'%n", s);
        Query query = em.createNativeQuery(s);
        List list = query.getResultList();
        for (Object o : list) {
            if (o instanceof Object[]) {
                System.out.println(Arrays.toString((Object[]) o));
            } else {
                System.out.println(o);
            }
        }
        em.close();
    }


    @Test
    public void testShowTablesQuery() {
        Query query = entityManager.createNativeQuery("SHOW TABLES");
        List<Object> tables = query.getResultList();
        //assertNotNull(tables);
        for (Object table : tables) {
            System.out.println(table);
        }
    }


}
