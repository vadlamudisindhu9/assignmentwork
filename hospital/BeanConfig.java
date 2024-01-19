package hospital;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
@ComponentScan(basePackages = "hospital")
@EnableTransactionManagement
public class BeanConfig {
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
	@Bean
	public DataSource dataSource() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/gasagency", 
				"root", "Kimtaehyung9." );
	}
	@Bean
	public Doctor doctor() {
		return new Doctor();
	}
	@Bean
	public Patients patient() {
		return new Patients();
	}
	@Bean
	public Appointments appointments() {
		return new Appointments();
	}
	@Bean
	public PatientRep patientRep() {
		return new PatientRep();
	}
	@Bean
	public AppointmentRep appointmentRep() {
		return new AppointmentRep();
	}
	@Bean
	public DoctorRep doctorRep() {
		return new DoctorRep();
	}
	@Bean
	public TransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}

