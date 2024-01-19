package hospital;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
        		new AnnotationConfigApplicationContext(BeanConfig.class);
    	context.registerShutdownHook();
    	PatService service = context.getBean(PatService.class);
    	AppService service1 = context.getBean(AppService.class);
        DocService service2 = context.getBean(DocService.class);
        Patients p = new Patients(10,"sravanthi","bp");
        Patients p1 = new Patients(20,"kavya","sugar");
        Patients p2 = new Patients(300,"aasritha","memory loss");
        Appointments app = new Appointments(1,p,new Date());
        Doctor doc = new Doctor(1,"ram","mbbs",app);
        
        
        //Employee emp = new Employee(103, "Shankar", "FS Developer");
        try {
        service.save(p2);
        service1.save(app);
        service2.save(doc);
        }catch(Exception ex) {
        	System.out.println("Rollback Happend becuase : " + ex.getMessage());
        }
        context.close();
        
    }
}
