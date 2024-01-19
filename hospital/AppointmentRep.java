package hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class AppointmentRep {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void save(Appointments apo) {
		String sql = "insert into Appointmentss values(?,?,?)";
		jdbcTemplate.update(sql, new Object[] {apo.getAid(),apo.getAppdate(),apo.getPatient().getId()});
	}
}
