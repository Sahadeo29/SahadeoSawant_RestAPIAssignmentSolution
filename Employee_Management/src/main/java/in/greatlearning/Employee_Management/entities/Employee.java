package in.greatlearning.Employee_Management.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Employee_Details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    public Employee(String firstName,String lastName,String email){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }
}
