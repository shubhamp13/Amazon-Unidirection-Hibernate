package dto;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Cacheable(true)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Amazon 
{
	@Id
	private long mobileNumber;
	private String name;
	private String password;
	private LocalDate dateOfBirth;
	@OneToOne 
	@Cascade(CascadeType.ALL)
	private AmazonPrime amazonPrime;
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public AmazonPrime getAmazonPrime() {
		return amazonPrime;
	}
	public void setAmazonPrime(AmazonPrime amazonPrime) {
		this.amazonPrime = amazonPrime;
	}
	@Override
	public String toString() {
		return "Amazon [mobileNumber=" + mobileNumber + ", name=" + name + ", password=" + password + ", dateOfBirth="
				+ dateOfBirth + ", amazonPrime=" + amazonPrime + "]";
	}
	
	
	
}
