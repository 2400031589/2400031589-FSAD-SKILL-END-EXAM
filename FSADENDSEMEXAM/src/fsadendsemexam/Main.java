package fsadendsemexam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        
        Transaction tx = session.beginTransaction();
        Library l1 = new Library("Book1", "Java", "01-05-2026", "Available");
        session.save(l1);
        tx.commit();

        
        session.beginTransaction();
        Library obj = session.get(Library.class, 1);
        if (obj != null) {
            session.delete(obj);
        }
        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}
