import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	@Temporal(TemporalType.DATE)
	private Calendar calDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateJavaUtil;
	@Lob // blob
	private byte[] b;
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "person", cascade = CascadeType.ALL)
	private List<Car> listCars = new ArrayList<>();

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int person_id, String name, int age, Calendar calDate, Date dateJavaUtil,
			byte[] b) {
		this.id = person_id;
		this.name = name;
		this.age = age;
		this.calDate = calDate;
		this.dateJavaUtil = dateJavaUtil;
		this.b = b;
	}

	public Person(String name, int age, Calendar calDate,  Date dateJavaUtil) {

		this.name = name;
		this.age = age;
		this.calDate = calDate;
		this.dateJavaUtil = dateJavaUtil;
		
	}

	public int getPerson_id() {
		return id;
	}

	public void setPerson_id(int person_id) {
		this.id = person_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Calendar getCalDate() {
		return calDate;
	}

	public void setCalDate(Calendar calDate) {
		this.calDate = calDate;
	}


	public Date getDateJavaUtil() {
		return dateJavaUtil;
	}

	public void setDateJavaUtil(Date dateJavaUtil) {
		this.dateJavaUtil = dateJavaUtil;
	}

	public byte[] getB() {
		return b;
	}

	public void setB(byte[] b) {
		this.b = b;
	}

	public List<Car> getListCars() {
		return listCars;
	}

	public void setListCars(List<Car> listCars) {
		this.listCars = listCars;
	}

	@Override
	public String toString() {
		return "Person [person_id=" + id + ", name=" + name + ", age=" + age + ", calDate=" + calDate.getFirstDayOfWeek()
				+  ", dateJavaUtil=" + dateJavaUtil.getDate() + ", b=" + Arrays.toString(b) + "]";
	}

}
