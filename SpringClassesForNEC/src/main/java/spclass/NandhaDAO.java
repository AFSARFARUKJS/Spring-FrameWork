package spclass;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class NandhaDAO {

	private HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	@Transactional(readOnly = false)
	public void storeData(Object obj) {
		template.save(obj);
	}
	
	@Transactional(readOnly = false)
	public void updateData(Object obj) {
		template.update(obj);
	}
	
	@Transactional(readOnly = false)
	public void deleteData(Object obj) {
		template.delete(obj);
	}
	
	@Transactional(readOnly = false)
	public List retrieveData(String hql_query) {
		List data = null;		
		SessionFactory sf = template.getSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		Query q = ses.createQuery(hql_query);
		data = q.list();
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
}
