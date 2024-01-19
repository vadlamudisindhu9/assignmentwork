package UsingBeans;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
       public static void main(String []args) {
    	   ApplicationContext context=new FileSystemXmlApplicationContext("workk.xml");
    	   EmployeeImpl employeeImp=context.getBean("empDAO",EmployeeImpl.class);
    	   //save the employee
    	   Employee employee=new Employee(1,"sindhu","developer");
    	   employeeImp.save(employee);
    	   employee=new Employee(2,"kim","trainer");
    	   employeeImp.save(employee);
    	   //retrieve employee
    	   Employee getEmployee=employeeImp.getById(2);
    	   System.out.println(getEmployee);
    	   //update employee
    	   Employee updatedEmployee=new Employee(3,"tae","sdet");
    	   employeeImp.update(updatedEmployee);
    	   //delete employee
    	   employeeImp.delete(5);
    	   //list of employees
    	   List<Employee> list=employeeImp.getEmpList();
    	   System.out.println("list of employees:");
    	   for(Employee emp:list) {
    		   System.out.println(emp);
    	   }
    	   
       }
}
