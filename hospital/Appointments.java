package hospital;

import java.util.Date;

public class Appointments {
	private int aid;
	private Patients patient;
	private Date appdate;
	public Appointments(int aid, Patients patient, Date appdate) {
		super();
		this.aid = aid;
		this.patient = patient;
		this.appdate = appdate;
	}
	public Appointments() {
		super();
	}
	public int getAid() {
		return aid;
	}
	@Override
	public String toString() {
		return "Appointments [aid=" + aid + ", patient=" + patient + ", appdate=" + appdate + "]";
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Patients getPatient() {
		return patient;
	}
	public void setPatient(Patients patient) {
		this.patient = patient;
	}
	public Date getAppdate() {
		return appdate;
	}
	public void setAppdate(Date appdate) {
		this.appdate = appdate;
	}
}
