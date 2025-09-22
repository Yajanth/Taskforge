package com.TaskForge.Taskforge.domain.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class User {
	
	@Id
	private final int ID;
	private final String Name;
	private final String email;
	private LocalDateTime createdAt;
	
	public User() {
		this.ID = 1;
		this.Name = "";
		this.email = "mail";
		
	}
	public User(int id, String name, String emai) {
		this.ID = 1;
		this.Name = "";
		this.email = "mail";
		
	}
}
