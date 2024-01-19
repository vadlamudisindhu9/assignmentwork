package trans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import com.concentrix.spring_transaction_demo.config.BeanConfig;
//import com.concentrix.spring_transaction_demo.model.Employee;
//import com.concentrix.spring_transaction_demo.service.EmpService;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
        		new AnnotationConfigApplicationContext(BeanConfig.class);
    	context.registerShutdownHook();
        
        EmpService service = context.getBean(EmpService.class);
        
        Employee emp = new Employee(110, "Shankar", "FS Developer");
        //Employee em = new Employee(108,"sindhu","manager");
        //Employee emp1 = new Employee(111,"bindhu","tester");
        service.save(emp);
        service.upd();
        service.del(108);
//        try {
//        service.save(emp);
//        }catch(Exception ex) {
//        	System.out.println("Rollback Happend becuase : " + ex.getMessage());
//        }
        context.close();
        
    }
}