package trans;


public class Employee {
	private int eid;
	private String ename;
	private String role;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, String role) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.role = role;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}