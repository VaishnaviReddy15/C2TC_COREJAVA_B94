package edu.atria.B94java.inheritance;

public class Mp extends Citizen {
  private int mpid;
  private String name;
  private String locality;
  private String party;
public Mp(long aadharNo, long voterId, String nationality, int mpid, String name, String locality, String party) {
	super(aadharNo, voterId, nationality);
	this.mpid = mpid;
	this.name = name;
	this.locality = locality;
	this.party = party;
}
public int getMpid() {
	return mpid;
}
public void setMpid(int mpid) {
	this.mpid = mpid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
public String getParty() {
	return party;
}
public void setParty(String party) {
	this.party = party;
}
@Override
public String toString() {
	return "Mp [mpid=" + mpid + ", name=" + name + ", locality=" + locality + ", party=" + party + ", getAadharNo()="
			+ getAadharNo() + ", getVoterId()=" + getVoterId() + ", getNationality()=" + getNationality()
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
  
  
}
