package com.edu.abhi.datehandler;

import java.util.Date;

public class DateBO {
	Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "DATEBO [date=" + date + "]";
	}
}
