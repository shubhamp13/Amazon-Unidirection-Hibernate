package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import dao.AmazonDao;
import dao.AmazonPrimeDao;
import dto.Amazon;
import dto.AmazonPrime;


public class App 
{
	public static void main(String[] args) 
	{
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Choice");
		System.out.println("1.Save Amazon Details");
		System.out.println("2.Save Amazon Prime Details");
		System.out.println("3.Update Amazon Details");
		System.out.println("4.Update AmazonPrime Details");
		System.out.println("5.Delete Amazon Account");
		System.out.println("6.Delete Amazon Prime Details");
		System.out.println("7.Fetch Amazon Details");
		System.out.println("8 Fetch Amazon Prime Details");
		System.out.println("9.Display All records");
		
		try
		{
			Amazon amazon=new Amazon();
			AmazonPrime amazonPrime=new AmazonPrime();
			AmazonDao amazonDao=new AmazonDao();
			AmazonPrimeDao amazonPrimeDao=new AmazonPrimeDao();
			DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			int choice=Integer.parseInt(bufferedReader.readLine());
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter Phone No");
					long phoneNo=Long.parseLong(bufferedReader.readLine());
					System.out.println("Enter your Name");
					String name=bufferedReader.readLine();
					System.out.println("Enter Your Password");
					String password=bufferedReader.readLine();
					System.out.println("Enter your Date Of Birth In (dd-MM-yyyy)");
					LocalDate date=LocalDate.parse(bufferedReader.readLine(), dateTimeFormatter);
					amazon.setDateOfBirth(date);
					amazon.setMobileNumber(phoneNo);
					amazon.setName(name);
					amazon.setPassword(password);
					amazonDao.saveUser(amazon);
				}
				break;
				case 2:
				{
					System.out.println("Enter Your Amazon registered mobile Number");
					long phoneNo=Long.parseLong(bufferedReader.readLine());
					System.out.println("Enter your Age");
					int age=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Subscription date");
					LocalDate subscribDate=LocalDate.parse(bufferedReader.readLine(),dateTimeFormatter);
					System.out.println("Enter Expiry date");
					LocalDate expiryDate=LocalDate.parse(bufferedReader.readLine(),dateTimeFormatter);
					amazonPrime.setAge(age);
					amazonPrime.setExpiryDate(expiryDate);
					amazonPrime.setSubsDate(subscribDate);
					amazonPrimeDao.saveAmazonPrime(phoneNo, amazonPrime);
				}
				break;
				case 3:
				{

					System.out.println("Enter Phone No To Update Amazon ");
					long phoneNo=Long.parseLong(bufferedReader.readLine());
					System.out.println("Enter your Name");
					String name=bufferedReader.readLine();
					System.out.println("Enter Your Password");
					String password=bufferedReader.readLine();
					System.out.println("Enter your Date Of Birth In (dd-MM-yyyy)");
					LocalDate date=LocalDate.parse(bufferedReader.readLine(), dateTimeFormatter);
					amazon.setDateOfBirth(date);
					amazon.setName(name);
					amazon.setPassword(password);
					amazonDao.updateAmazon(phoneNo, amazon);
				}
				break;
				case 4:
				{
					System.out.println("Enter Your Amazon Prime regestration id");
					int regId=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter your Age");
					int age=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Subscription date");
					LocalDate subscribDate=LocalDate.parse(bufferedReader.readLine(),dateTimeFormatter);
					System.out.println("Enter Expiry date");
					LocalDate expiryDate=LocalDate.parse(bufferedReader.readLine(),dateTimeFormatter);
					amazonPrime.setAge(age);
					amazonPrime.setExpiryDate(expiryDate);
					amazonPrime.setSubsDate(subscribDate);
					amazonPrimeDao.updateAmazonPrime(regId, amazonPrime);
				}
				break;
				case 5:
				{
					System.out.println("Enter Phone No to delete from amazon");
					long phoneNo=Long.parseLong(bufferedReader.readLine());
					amazonDao.deleteAmazon(phoneNo);
				}
				break;
				case 6:
				{
					System.out.println("Enter Your Amazon Prime regestration id to delete");
					int regId=Integer.parseInt(bufferedReader.readLine());
					amazonPrimeDao.deleteAmazonPrime(regId);
				}
				break;
				case 7:
				{
					System.out.println("Enter Phone No to fetch details from amazon");
					long phoneNo=Long.parseLong(bufferedReader.readLine());
					amazonDao.fetchAmazon(phoneNo);
				}
				break;
				case 8:
				{
					System.out.println("Enter Your Amazon Prime regestration id To fetch all details");
					int regId=Integer.parseInt(bufferedReader.readLine());
					amazonPrimeDao.fetchAmazonPrime(regId);
				}
				break;
				case 9:
				{
					amazonDao.displayAll();
				}
				break;
			}
		}
		catch (IOException e)
		{
			
		}
	}
}
