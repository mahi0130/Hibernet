package in.co.rays.oneone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOne {
	public static void main(String[] args) {
		Address emaddress = new Address();
		emaddress.setId(1);
		emaddress.setStreet("street2");
		emaddress.setCity("mumbai");
		
		Employee em = new Employee();
		em.setId(1);
		em.setName("mahi");
		em.setEmaddress(emaddress);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(em);
		tx.commit();
		session.close();
		
	}

}
