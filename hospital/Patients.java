package hospital;

public class Patients {
	private int id;
	private String name;
	private String problem;
	public Patients(int id, String name, String problem) {
		super();
		this.id = id;
		this.name = name;
		this.problem = problem;
	}
	public Patients() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	@Override
	public String toString() {
		return "Patients [id=" + id + ", name=" + name + ", problem=" + problem + "]";
	}
	
}
