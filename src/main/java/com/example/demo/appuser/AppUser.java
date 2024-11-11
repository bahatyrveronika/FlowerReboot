package com.example.demo.appuser;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Table(name = "app_user")
@Entity
public class AppUser {
    @Id
    @SequenceGenerator(
            name = "flower_sequence",
            sequenceName = "flower_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "flower_sequence"
    )
    private long id;

    @Column(unique = true, nullable = false)
    private String email;
    private LocalDate dob;
    @Transient
    private int age;

    public AppUser(String email, LocalDate dob) {
        this.email = email;
        this.dob = dob;
    }

    // @Transient
    public int getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
        this.dob = LocalDate.now().minusYears(age);
    }
}
