package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import dto.Amazon;
import dto.AmazonPrime;

public class AmazonPrimeDao 
{
	public EntityManager  getEntityManager()
	{
		return Persistence.createEntityManagerFactory("shubham").createEntityManager();
	}
	
	public void saveAmazonPrime(long phoneNo, AmazonPrime amazonPrime) 
	{
	    EntityManager entityManager = getEntityManager();
	    Amazon dbAmazon = entityManager.find(Amazon.class, phoneNo);
	    
	    if (dbAmazon != null) 
	    {
	        entityManager.getTransaction().begin();
	        entityManager.persist(amazonPrime);
	        dbAmazon.setAmazonPrime(amazonPrime);
	        entityManager.getTransaction().commit();
	    } else {
	        System.out.println("Invalid User");
	    }
	}
	public void deleteAmazonPrime(int regId)
	{
		EntityManager entityManager=getEntityManager();
		AmazonPrime amazonPrime=entityManager.find(AmazonPrime.class,regId);
		if(amazonPrime!=null)
		{
			entityManager.getTransaction().begin();
			entityManager.remove(amazonPrime);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Invalid Regestration Id");
		}
	}
	public void fetchAmazonPrime(int regId)
	{
		EntityManager entityManager=getEntityManager();
		AmazonPrime amazonPrime=entityManager.find(AmazonPrime.class, regId);
		if(amazonPrime!=null)
		{
			System.out.println(amazonPrime);
		}
		else
		{
			System.out.println("Invalid Id");
		}
	}
	public void updateAmazonPrime(int regId,AmazonPrime amazonPrime)
	{
		EntityManager entityManager=getEntityManager();
		AmazonPrime dbAmazonPrime=entityManager.find(AmazonPrime.class,regId);
		if(dbAmazonPrime!=null)
		{
			entityManager.getTransaction().begin();
			amazonPrime.setRegId(regId);
			entityManager.merge(amazonPrime);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Invalid Reg No");
		}
	}

}
