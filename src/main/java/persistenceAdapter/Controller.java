package persistenceAdapter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Controller {

    private static SessionFactory buildSessionFactory() {
        try {
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build();

            Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

            return metadata.getSessionFactoryBuilder().build();

        } catch (Throwable ex) {
            System.err.println("Internel SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }

    }

    public static void sessionExample(ViolationDAO v) {
        SessionFactory sf = buildSessionFactory();

        Session session = sf.openSession();

        session.getTransaction().begin();



        Long id = (Long) session.save(v);


        session.getTransaction().commit();
        session.close();

        session = sf.openSession();

        session.close();

        session = sf.openSession();


        session.close();
    }
}


