package dto;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable(true)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AmazonPrime 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int regId;
	private int age;
	private LocalDate subsDate;
	private LocalDate expiryDate;
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) 
	{
		this.regId = regId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getSubsDate() {
		return subsDate;
	}
	public void setSubsDate(LocalDate subsDate) {
		this.subsDate = subsDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "AmazonPrime [regId=" + regId + ", age=" + age + ", subsDate=" + subsDate + ", expiryDate=" + expiryDate
				+ "]";
	}
	
	
}
