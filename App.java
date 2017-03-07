package JPARelationshipsDemo;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeePersistence");
		
		
		TopicsDAO tDao = new TopicsDAO(factory);
		List<Topic> topicsList = tDao.getAllTopics();
		System.out.println("Please select a topic from the below list");
		for(Topic t : topicsList){
			System.out.println(t.getName());
		}
		factory.close();
		
	}

}
