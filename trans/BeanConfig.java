package trans;

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

//import com.concentrix.spring_transaction_demo.model.Employee;
//import com.concentrix.spring_transaction_demo.repo.EmpRepository;
//import com.concentrix.spring_transaction_demo.service.EmpService;
//import com.concentrix.spring_transaction_demo.repo.EmpRepository;

@Configuration
@ComponentScan(basePackages = "trans")
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
	public Employee employee() {
		return new Employee();
	}
	@Bean
	public EmpRepository empRepository() {
		return new EmpRepository();
	}
	@Bean
	public TransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}

