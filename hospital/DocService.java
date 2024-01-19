package hospital;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocService {

	@Autowired
	private DoctorRep repo;
	
	@Transactional//(propagation = Propagation.REQUIRED)
	public void save(Doctor doc) {
		try {
		for(int i=0; i<5; i++) {
			repo.save(doc);
			int eid = new Random().nextInt(10);
			doc.setId(eid);
		}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
