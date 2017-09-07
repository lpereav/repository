package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Test {

	public static void main (String args[]) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", new Locale("es", "MX"));
		dateFormat.setTimeZone(TimeZone.getTimeZone("America/Mexico_City"));
		Date fechaNacimiento = null;
		Date date = Calendar.getInstance(new Locale("es", "MX")).getTime();
		String strDate= dateFormat.format(date);
		System.out.println(strDate);
		
		System.out.println("1981-01-20".concat("T12:00:00Z"));
		//2017-08-30T18:35:42Z
		fechaNacimiento = dateFormat.parse("1981-01-20".concat("'T'12:00:00'Z'"));
		System.out.println(fechaNacimiento);
	}
}
