package Classes;

import java.util.*;
import java.io.*;

public class gaccount
{
	private String username;
	private String pass;
	private String phone, email;

	private File file;
	private FileWriter fwriter;
	private FileReader fr;
	private Scanner sc;

	public gaccount()
	{
		this.username = "";
	}

	public gaccount(String username, String phone, String email, String pass) {
		this.username = username;
		this.phone = phone;
		this.email = email;
		this.pass = pass;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setpass(String pass) {
		this.pass = pass;
	}

	public String getusername() {
		return username;
	}

	public String getphone() {
		return phone;
	}

	public String getemail() {
		return email;
	}

	public String getpass() {
		return pass;
	}

	public void addGaccount()
	{
		try
		{
			file = new File("Gdata.txt");
			if (!file.exists())
			{
				file.createNewFile();
			}
			fwriter = new FileWriter(file, true);
			fwriter.write(getusername() + "\t" + getphone() + "\t" + getemail() + "\t" + getpass() + "\n");
			fwriter.flush();
			fwriter.close();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public boolean getGaccount(String username, String pass)
	{
		boolean isAuth=false;
		file= new File("Gdata.txt");
		try{
			sc=new Scanner(file);
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String[] value=line.split("\t");
				if(value[0].equals(username)&&value[3].equals(pass))
				{
					isAuth=true;
				}
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		return isAuth;
	}

	
}