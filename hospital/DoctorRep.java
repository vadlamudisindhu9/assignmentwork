package hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class DoctorRep {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void save(Doctor doc) {
		String sql = "insert into Doctors values(?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {doc.getId(),doc.getName(),doc.getSpecialization(),doc.getAppoint().getAid()});
	}
}
