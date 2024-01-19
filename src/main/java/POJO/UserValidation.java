package POJO;

public class UserValidation {
	private String sname;
	private String smail;
	public UserValidation()
    {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserValidation(String sname,String smail) 
	{
		super();
		this.sname = sname;
		this.smail = smail;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmail() {
		return smail;
	}
	public void setSmail(String smail) {
		this.smail = smail;
	}
	

}
