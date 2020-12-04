package com.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hib_instituteinfo")
public class Institute {
	 @Id
	 @Column(name="instituteid")
	private int instituteId;
	 
	 @Column(name="instituteName")
    private	String instituteName;
	 
	 @OneToOne(mappedBy = "inst",cascade = CascadeType.ALL)
	private InstituteHistory history ;

	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Institute(int instituteId, String instituteName, InstituteHistory history) {
		super();
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.history = history;
	}

	public int getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public InstituteHistory getHistory() {
		return history;
	}

	public void setHistory(InstituteHistory history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", instituteName=" + instituteName + ", history=" + history
				+ "]";
	}
	
	
}
