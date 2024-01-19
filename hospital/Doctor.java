package hospital;

public class Doctor {
	private int id;
	private String name;
	private String specialization;
	private Appointments appoint;
	public Doctor(int id, String name, String specialization, Appointments appoint) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.appoint = appoint;
	}
	public Doctor() {
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public Appointments getAppoint() {
		return appoint;
	}
	public void setAppoint(Appointments appoint) {
		this.appoint = appoint;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", appoint=" + appoint
				+ "]";
	}
	
}
