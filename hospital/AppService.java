package hospital;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AppService {

	@Autowired
	private AppointmentRep repo;
	
	@Transactional//(propagation = Propagation.REQUIRED)
	public void save(Appointments apo) {
		try {
		for(int i=0; i<5; i++) {
			repo.save(apo);
			int eid = new Random().nextInt(10);
			apo.setAid(eid);
		}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}