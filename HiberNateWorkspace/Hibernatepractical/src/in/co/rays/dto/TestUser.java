package in.co.rays.dto;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TestUser {
	public static void main(String[] args) {
		
	
	UserDTO dto =new UserDTO();
	dto.setId(1);
	dto.setFirstName("Mahi");
	dto.setLastName("singh");
	dto.setLogin("mahi@gmail.com");
	dto.setPassword("123");
	dto.setAddress("indore");
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session =sf.openSession();
	
	Transaction tx= session.beginTransaction();
	session.save(dto);
	tx.commit();
	session.close();
	
	}
	
	

}
