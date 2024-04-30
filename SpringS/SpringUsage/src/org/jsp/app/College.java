package org.jsp.app;

public class College {
	private String clgId;
	private String clgName;
	
	public College(String clgId, String clgName) {
		super();
		this.clgId = clgId;
		this.clgName = clgName;
	}
	public String getClgId() {
		return clgId;
	}
	public void setClgId(String clgId) {
		this.clgId = clgId;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", clgName=" + clgName + "]";
	}
	

}
