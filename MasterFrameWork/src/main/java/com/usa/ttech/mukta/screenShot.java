package com.usa.ttech.mukta;

import java.io.File;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;



public class screenShot {



	    public static String captureScreenShot(WebDriver driver, String ScreenShotName) throws Exception{

	    TakesScreenshot ts =(TakesScreenshot)driver;

		File source=ts.getScreenshotAs(OutputType.FILE);

		String currentDir = System.getProperty("user.dir");

		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

		Date date = new Date();

	    String dateTime = dateFormat.format(date.getTime());

		//String destination=".//RCO_Regression/Screenshot"+ScreenShotName+"-"+dateTime+".png";

		String destination=currentDir +"\\Regression Report output\\ScreenShots\\"+dateTime+"\\" +ScreenShotName + ".png";

		FileUtils.copyFile(source, new File("./Regression Report output\\ScreenShots/Ground Transportation.png"));

		return destination;

	    }}