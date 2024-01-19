package hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class PatientRep {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void save(Patients pat) {
		String sql = "insert into Patients values(?,?,?)";
		jdbcTemplate.update(sql, new Object[] {pat.getId(),pat.getName(),pat.getProblem()});
	}
}
