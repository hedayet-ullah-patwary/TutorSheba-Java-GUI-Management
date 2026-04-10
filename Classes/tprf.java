package Classes;

import java.lang.*;
import java.lang.*;
import java.util.*;
import java.io.*;


public class tprf
{
    private String cat, cls, city, avail, plat, sub, location, days, fname, lname, idtype, idno, religion, dob, gdname, relation, degree, lvl, major, institute, instid;
    private File file;
    private FileWriter fwriter;
    private Scanner sc;

    public tprf(){}
    public tprf(String cat, String cls, String city, String avail, String plat, String sub, String location, String days)
    {
        this.cat = cat;
        this.cls = cls;
        this.city = city;
        this.avail = avail;
        this.plat = plat;
        this.sub = sub;
        this.location = location;
        this.days = days;
    }
	public tprf(String fname, String lname, String idtype, String idno, String religion, String dob, String gdname, String relation, String degree, String lvl, String major, String institute, String instid)
    {
        this.fname = fname;
        this.lname = lname;
        this.idtype = idtype;
        this.idno = idno;
        this.religion = religion;
        this.dob = dob;
        this.gdname = gdname;
        this.relation = relation;
		this.degree = degree;
		this.lvl = lvl;
		this.major = major;
		this.institute = institute;
		this.instid = instid;
    }
	

    public void setcat(String cat)
    {
        this.cat = cat;
    }
    public void setcls(String cls)
    {
        this.cls = cls;
    }
    public void setcity(String city)
    {
        this.city = city;
    }
    public void setavail(String avail)
    {
        this.avail = avail;
    }
    public void setplat(String plat)
    {
        this.plat = plat;
    }
    public void setsub(String sub)
    {
        this.sub = sub;
    }
    public void setlocation(String location)
    {
        this.location = location;
    }
    public void setdays(String days)
    {
        this.days = days;
    }
	public void setfname(String fname)
    {
        this.fname = fname;
    }
    public void setlname(String lname)
    {
        this.lname = lname;
    }
    public void setidtype(String idtype)
    {
        this.idtype = idtype;
    }
    public void setidno(String idno)
    {
        this.idno = idno;
    }
    public void setreligion(String religion)
    {
        this.religion = religion;
    }
    public void setdob(String dob)
    {
        this.dob = dob;
    }
    public void setgdname(String gdname)
    {
        this.gdname = gdname;
    }
    public void setrelation(String relation)
    {
        this.relation = relation;
    }
	public void setdegree(String degree)
    {
        this.degree = degree;
    }
	public void setlvl(String lvl)
    {
        this.lvl = lvl;
    }
	public void setmajor(String major)
    {
        this.major = major;
    }
	public void setinstitute(String institute)
    {
        this.institute = institute;
    }
	public void setinstid(String instid)
    {
        this.instid = instid;
    }
    public String getcat()
    {
        return cat;
    }
    public String getcls()
    {
        return cls;
    }
    public String getcity()
    {
        return city;
    }
    public String getavail()
    {
        return avail;
    }
    public String getplat()
    {
        return plat;
    }
    public String getsub()
    {
        return sub;
    }
    public String getlocation()
    {
        return location;
    }
    public String getdays()
    {
        return days;
    }
	public String getfname()
    {
        return fname;
    }
    public String getlname()
    {
        return lname;
    }
    public String getidtype()
    {
        return idtype;
    }
    public String getidno()
    {
        return idno;
    }
    public String getreligion()
    {
        return religion;
    }
    public String getdob()
    {
        return dob;
    }
    public String getgdname()
    {
        return gdname;
    }
    public String getrelation()
    {
        return relation;
    }
	public String getdegree()
    {
        return degree;
    }
	public String getlvl()
    {
        return lvl;
    }
	public String getmajor()
    {
        return major;
    }
	public String getinstitute()
    {
        return institute;
    }
	public String getinstid()
    {
        return instid;
    }
	
    public void preferences()
    {
        try
        {
            file = new File("tprefdata.txt");
            file.createNewFile();
            fwriter = new FileWriter(file, true);
            fwriter.write(getcat()+"\t");
            fwriter.write(getcls()+"\t");
            fwriter.write(getcity()+"\t");
            fwriter.write(getavail()+"\t");
            fwriter.write(getplat()+"\t");
            fwriter.write(getsub()+"\t");
            fwriter.write(getlocation()+"\t");
            fwriter.write(getdays()+"\t");
            fwriter.flush();
            fwriter.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
	public void info()
    {
        try
        {
            file = new File("tprefdata.txt");
            file.createNewFile();
            fwriter = new FileWriter(file, true);
            fwriter.write(getfname()+"\t");
            fwriter.write(getlname()+"\t");
            fwriter.write(getidtype()+"\t");
            fwriter.write(getidno()+"\t");
            fwriter.write(getreligion()+"\t");
            fwriter.write(getdob()+"\t");
            fwriter.write(getgdname()+"\t");
            fwriter.write(getrelation()+"\t");
			fwriter.write(getdegree()+"\t");
			fwriter.write(getlvl()+"\t");
			fwriter.write(getmajor()+"\t");
			fwriter.write(getinstitute()+"\t");
			fwriter.write(getinstid()+"\t");
            fwriter.flush();
            fwriter.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
	
    
}