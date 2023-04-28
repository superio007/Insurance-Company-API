package com.example.InsuranceCompany.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admincashlessupdate")
public class AdminCashlessEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "rnumber")
	private String rnumber;
	
	@Column(name = "pname")
	private String pname;
	
	@Column(name = "pemail")
	private String pemail;
	
	@Column(name = "pnumber")
	private String pnumber;
	
	@Column(name = "policynumber")
	private String policynumber;
	
	@Column(name = "policyname")
	private String policyname;
	
	@Column(name = "tpaname")
	private String tpaname;
	
	@Column(name = "hname")
	private String hname;
	
	@Column(name = "hid")
	private String hid;
	
	@Column(name = "hlocation")
	private String hlocation;
	
	@Column(name = "dname")
	private String dname;
	
	@Column(name = "patientname")
	private String patientname;
	
	@Column(name = "patientage")
	private String patientage;
	
	@Column(name = "relation")
	private String relation;
	
	@Column(name = "patientpriordisease")
	private String patientpriordisease;
	
	@Column(name = "nameofillness")
	private String nameofillness;
	
	@Column(name = "sumnumber")
	private String sumnumber;
	
	@Column(name = "hospitalbill")
	private String hospitalbill;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "remark")
	private String remark;
	
	public AdminCashlessEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminCashlessEntity(Long id, String rnumber, String pname, String pemail, String pnumber,
			String policynumber, String policyname, String tpaname, String hname, String hid, String hlocation,
			String dname, String patientname, String patientage, String relation, String patientpriordisease,
			String nameofillness, String sumnumber, String hospitalbill, String status, String remark) {
		super();
		this.id = id;
		this.rnumber = rnumber;
		this.pname = pname;
		this.pemail = pemail;
		this.pnumber = pnumber;
		this.policynumber = policynumber;
		this.policyname = policyname;
		this.tpaname = tpaname;
		this.hname = hname;
		this.hid = hid;
		this.hlocation = hlocation;
		this.dname = dname;
		this.patientname = patientname;
		this.patientage = patientage;
		this.relation = relation;
		this.patientpriordisease = patientpriordisease;
		this.nameofillness = nameofillness;
		this.sumnumber = sumnumber;
		this.hospitalbill = hospitalbill;
		this.status = status;
		this.remark = remark;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRnumber() {
		return rnumber;
	}

	public void setRnumber(String rnumber) {
		this.rnumber = rnumber;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getPolicynumber() {
		return policynumber;
	}

	public void setPolicynumber(String policynumber) {
		this.policynumber = policynumber;
	}

	public String getPolicyname() {
		return policyname;
	}

	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}

	public String getTpaname() {
		return tpaname;
	}

	public void setTpaname(String tpaname) {
		this.tpaname = tpaname;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHid() {
		return hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
	}

	public String getHlocation() {
		return hlocation;
	}

	public void setHlocation(String hlocation) {
		this.hlocation = hlocation;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getPatientage() {
		return patientage;
	}

	public void setPatientage(String patientage) {
		this.patientage = patientage;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getPatientpriordisease() {
		return patientpriordisease;
	}

	public void setPatientpriordisease(String patientpriordisease) {
		this.patientpriordisease = patientpriordisease;
	}

	public String getNameofillness() {
		return nameofillness;
	}

	public void setNameofillness(String nameofillness) {
		this.nameofillness = nameofillness;
	}

	public String getSumnumber() {
		return sumnumber;
	}

	public void setSumnumber(String sumnumber) {
		this.sumnumber = sumnumber;
	}

	public String getHospitalbill() {
		return hospitalbill;
	}

	public void setHospitalbill(String hospitalbill) {
		this.hospitalbill = hospitalbill;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
