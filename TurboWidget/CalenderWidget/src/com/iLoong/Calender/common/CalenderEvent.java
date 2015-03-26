package com.iLoong.Calender.common;


public class CalenderEvent
{
	private  String _id;
	private String title;
	private String dtstart;
	private String dtend;
	private String all_day;
	private String duration;
	private String rrule;
	private String rdate;
	
	public String getAll_day()
	{
		return all_day;
	}

	
	public void setAll_day(
			String all_day )
	{
		this.all_day = all_day;
	}

	
	public String getDuration()
	{
		return duration;
	}

	
	public void setDuration(
			String duration )
	{
		this.duration = duration;
	}

	
	public String getRrule()
	{
		return rrule;
	}

	
	public void setRrule(
			String rrule )
	{
		this.rrule = rrule;
	}

	
	public String getRdate()
	{
		return rdate;
	}

	
	public void setRdate(
			String rdate )
	{
		this.rdate = rdate;
	}

	public String get_id()
	{
		return _id;
	}
	
	public void set_id(
			String _id )
	{
		this._id = _id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(
			String title )
	{
		this.title = title;
	}
	
	public String getDtstart()
	{
		return dtstart;
	}
	
	public void setDtstart(
			String dtstart )
	{
		this.dtstart = dtstart;
	}
	
	public String getDtend()
	{
		return dtend;
	}
	
	public void setDtend(
			String dtend )
	{
		this.dtend = dtend;
	}
	
}
