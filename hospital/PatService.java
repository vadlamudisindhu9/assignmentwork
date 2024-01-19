package hospital;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service
public class PatService {

	@Autowired
	private PatientRep repo;
	
	@Transactional//(propagation = Propagation.REQUIRED)
	public void save(Patients pat) {
		try {
		//for(int i=0; i<5; i++) {
			repo.save(pat);
			//int eid = new Random().nextInt(10);
			//pat.setId(eid);
		//}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
