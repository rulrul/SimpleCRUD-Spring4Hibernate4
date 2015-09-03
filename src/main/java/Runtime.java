/*
 * @author Rully Andhika a.k.a jarul
 * Copyleft 2015
 */
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rulrul.spring4hibernate4.model.Freelancer;
import com.rulrul.spring4hibernate4.services.FreelancerService;

public class Runtime {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		FreelancerService service = (FreelancerService) context.getBean("freelancerService");
		
		
		//Insert
		Freelancer freelancer = new Freelancer();
		freelancer.setName("Rully Andhika");
		freelancer.setPosition("IT Progrmmer Manager");
		freelancer.setSalary(17500000);
		freelancer.setEmail("rul.rul.jar@gmail.com");
		service.insertFreelancer(freelancer);
		/*
		//Update
		Freelancer freelancer = new Freelancer();
		freelancer.setId((long) 1);
		freelancer.setName("Rully Andhika");
		freelancer.setPosition("IT Programmer Manager");
		freelancer.setSalary(17500000);
		freelancer.setEmail("rul.rul.jar@gmail.com");
		service.updateFreelancer(freelancer);
		
		//Delete
		service.deleteFreelancer((long) 1);
		
		//Get-All-Data
		List<Freelancer> data = service.getAllFreelancer();
		
		for(Freelancer freelancer : data) {
			System.out.println("ID: " + freelancer.getId());
			System.out.println("Nama: " + freelancer.getName());
			System.out.println("Position: " + freelancer.getPosition());
			System.out.println("Gaji: " + freelancer.getSalary());
			System.out.println("Email: " + freelancer.getEmail());
			System.out.println("=========================================");
		}
		
		//Find-Data-By-Id
		Freelancer freelancer = service.findFreelancerById((long) 1);
		System.out.println("ID: " + freelancer.getId());
		System.out.println("Nama: " + freelancer.getName());
		System.out.println("Position: " + freelancer.getPosition());
		System.out.println("Gaji: " + freelancer.getSalary());
		System.out.println("Email: " + freelancer.getEmail());
		*/
		
		context.close();
		
	}

}
