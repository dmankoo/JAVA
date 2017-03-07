package JPARelationshipsDemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

public class TopicsDAO {

	private EntityManagerFactory factory;
	
	public TopicsDAO(EntityManagerFactory factory){
		super();
		this.factory = factory;
		
	}
	

	
	
	public List<Topic> getAllTopics(){
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Topic> query = manager.createQuery("select t from topic t", Topic.class);
		List<Topic> topicsList = query.getResultList();
		manager.close();
		return topicsList;
	}
}
