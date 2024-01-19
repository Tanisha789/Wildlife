package POJO;

public class AdminValidation {
	
   private String sname;
	private String smail;
	private String pass;
	public AdminValidation()
    {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AdminValidation(String sname,String smail,String pass) 
	{
		super();
		this.sname = sname;
		this.smail = smail;
		this.pass=pass;
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
