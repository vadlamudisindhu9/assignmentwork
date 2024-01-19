package UsingConfigurations;

public interface EmployeeDAccess {
	//create
	void save(Employee emp);
	//read
	Employee getById(int id);
	//update
	void update(Employee emp);
	//delete
	void delete(int id);
}
