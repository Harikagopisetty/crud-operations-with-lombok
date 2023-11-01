package com.crud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	@Size(min=6,max=12,message="once check the size of name")
	@NotBlank(message="should not be null and alteast one whitespace")
	@NotEmpty(message="should not be null empty")
	@Pattern(regexp = "^[^a-zA-Z]*$",message="not valid name")
	private String name;
	@Digits(integer=2,fraction=0,message="enter roll number with in size")
	private int roll;
	private int salary;
	@Digits(integer=2,fraction=3,message="enter age within range")
	private int age;
	@Email(message = "invalid email")
	private String email;
	@Pattern(regexp ="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",message="not valid")
	private String password;
	//@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@OneToOne(fetch = FetchType.EAGER,optional=true)
	@JoinColumn(name="FkeyAddress")
	@JsonIgnore
	private Address address;
	//@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	//private List<Role> role;
}
