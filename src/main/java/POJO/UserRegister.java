package POJO;

public class UserRegister {
	
	private String sname;
	private String smail;
	
	public UserRegister()
    {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserRegister(String sname,String smail) 
	{
		super();
		this.sname = sname;
		this.smail = smail;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	public String getSname()
	{
		return sname;
	}
	
	public void setSmail(String smail)
	{
		this.smail = smail;
	}
	
	public String getSmail()
	{
		return smail;
	}
	

}
