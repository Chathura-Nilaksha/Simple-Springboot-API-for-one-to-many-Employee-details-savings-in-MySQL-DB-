package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Table(name = "employee_details")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    private String empName;
    private Integer empAge;
    //NOTE-Memo
        // { addressEntity_add_id  <-- this comes as default colum name for FOREIGN KEY if we
            // did nt put custom key with @JoinColumn(name = "fk_add_id") annotation }
//    @OneToOne(cascade = CascadeType.ALL)
//            //NOTE-Memo--This cascade property will save relevant data in the address table too
//    @JoinColumn(name = "fk_add_id") //NOTE-Memo--to give a custom name to foreign key colum

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id", referencedColumnName = "emp_id")
    private List<AddressEntity> addressEntity;  //check here needs the table name or
                                        // just a variable name

}

