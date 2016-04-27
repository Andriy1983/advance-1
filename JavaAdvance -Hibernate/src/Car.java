import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOfCar")
	private int car_id;
	private String model;

	/* !!! */
	@ManyToOne(cascade = CascadeType.ALL)
	private Person person;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model, Person person) {
		this.model = model;
		this.person = person;
	}
	
	public Car(String model) {
		this.model = model;
		
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Car [car_id=" + car_id + ", model=" + model + "]";
	}
	
	
	
	
}


