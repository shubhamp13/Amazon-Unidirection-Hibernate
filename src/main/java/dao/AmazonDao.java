package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Amazon;


public class AmazonDao 
{
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("shubham").createEntityManager();
	}
	public void saveUser(Amazon amazon)
	{
		EntityManager entityManager=getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(amazon);
		entityManager.getTransaction().commit();
	}
	public void updateAmazon(long phoneNo,Amazon amazon)
	{
		EntityManager entityManager=getEntityManager();
		Amazon dbAmazon=entityManager.find(Amazon.class,phoneNo);
		if(dbAmazon!=null)
		{
			entityManager.getTransaction().begin();
			amazon.setMobileNumber(phoneNo);
			amazon.setAmazonPrime(dbAmazon.getAmazonPrime());
			entityManager.merge(amazon);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Invalid Phone No");
		}
	}
	public void deleteAmazon(long phoneNo)
	{
		EntityManager entityManager=getEntityManager();
		Amazon dbAmazon=entityManager.find(Amazon.class, phoneNo);
		if(dbAmazon!=null)
		{
			entityManager.getTransaction().begin();
			entityManager.remove(dbAmazon);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Invalid Phone No");
		}
	}
	public void fetchAmazon(long phoneNo)
	{
		EntityManager entityManager=getEntityManager();
		Amazon dbAmazon=entityManager.find(Amazon.class,phoneNo);
		if(dbAmazon!=null)
		{
			System.out.println(dbAmazon);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public void displayAll()
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select a from Amazon a");
		List<Amazon>list=query.getResultList();
		System.out.println("**************************************************");
		for(Amazon amazon:list)
		{
			System.out.println(amazon);
			System.out.println("**********************************************\n");
		}
		
	}
}
