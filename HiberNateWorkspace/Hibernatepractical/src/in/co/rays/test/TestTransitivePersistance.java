package in.co.rays.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.auction.AuctionItem;
import in.co.rays.auction.Bid;

public class TestTransitivePersistance {

	public static void main(String[] args) {

		Bid bid = new Bid();
		bid.setId(5);
		bid.setAmount(4000);
		bid.setTimeStamp("TTTT");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		AuctionItem item = (AuctionItem) session.get(AuctionItem.class, 1);

		Set s = item.getBids();

		s.add(bid);

		tx.commit();

		session.close();

	}

}