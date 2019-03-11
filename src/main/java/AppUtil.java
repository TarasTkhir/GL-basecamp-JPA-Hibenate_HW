import entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppUtil {

    private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public static Session session = sessionFactory.openSession();

    public static Session getSession() {

        return session;
    }

    public static SessionFactory getSessionFactory() {

        return sessionFactory;
    }

    public static void closeSession() {

        session.close();
    }

    public static void closeSessionFactory() {

        sessionFactory.close();
    }

    public static void closeSessionFactoryAndSession() {

        session.close();
        sessionFactory.close();
    }
}
