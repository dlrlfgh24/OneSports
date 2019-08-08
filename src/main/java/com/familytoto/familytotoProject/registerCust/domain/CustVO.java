package com.familytoto.familytotoProject.registerCust.domain;

import java.sql.Timestamp;

// OneSports회원
public class CustVO {

	// CUST_NO 100000001
	private int custNo;

	// FAMILY_CUST_NO 10000001
	private int familyCustNo;

	// CUST_ID
	private String custId;

	// CUST_PASSWORD
	private String custPassword;

	// REG_CUST_NO
	private int regCustNo;

	// CHG_CUST_NO
	private int chgCustNo;

	// REG_DT
	private Timestamp regDt;

	// CHG_DT
	private Timestamp chgDt;

	// REG_IP
	private String regIp;

	// CHG_IP
	private String chgIp;

	// USE_YN Y,N,B
	private String useYn;

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public int getFamilyCustNo() {
		return familyCustNo;
	}

	public void setFamilyCustNo(int familyCustNo) {
		this.familyCustNo = familyCustNo;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	public int getRegCustNo() {
		return regCustNo;
	}

	public void setRegCustNo(int regCustNo) {
		this.regCustNo = regCustNo;
	}

	public int getChgCustNo() {
		return chgCustNo;
	}

	public void setChgCustNo(int chgCustNo) {
		this.chgCustNo = chgCustNo;
	}

	public Timestamp getRegDt() {
		return regDt;
	}

	public void setRegDt(Timestamp regDt) {
		this.regDt = regDt;
	}

	public Timestamp getChgDt() {
		return chgDt;
	}

	public void setChgDt(Timestamp chgDt) {
		this.chgDt = chgDt;
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public String getChgIp() {
		return chgIp;
	}

	public void setChgIp(String chgIp) {
		this.chgIp = chgIp;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	 
}